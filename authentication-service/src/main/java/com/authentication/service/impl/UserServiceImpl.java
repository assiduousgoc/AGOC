package com.authentication.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.PersistenceException;

import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.authentication.config.TokenProvider;
import com.authentication.constants.AuthConstant;
import com.authentication.dao.UserRepository;
import com.authentication.enm.ModuleType;
import com.authentication.enm.UserType;
import com.authentication.entities.Users;
import com.authentication.exceptions.EntityNotFoundException;
import com.authentication.exceptions.InvalidUserException;
import com.authentication.exceptions.NotAcceptableException;
import com.authentication.models.CustomerDto;
import com.authentication.models.UserData;
import com.authentication.models.UserLoginDto;
import com.authentication.models.UsersDto;
import com.authentication.service.UserRoleService;
import com.authentication.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService {

	private UserRepository repo;

	private BCryptPasswordEncoder encoder;

	private AuthenticationManager auth_mgr;

	private TokenProvider token_util;

	private UserRoleService role_service;

	private RestTemplate client;

	public UserServiceImpl(UserRepository repo, @Lazy BCryptPasswordEncoder encoder,
			@Lazy AuthenticationManager auth_mgr, @Lazy TokenProvider token_util, UserRoleService role_service,
			RestTemplate client) {
		super();
		this.repo = repo;
		this.encoder = encoder;
		this.auth_mgr = auth_mgr;
		this.token_util = token_util;
		this.role_service = role_service;
		this.client = client;
	}

	@Override
	public UserDetails loadUserByUsername(String user_name) throws UsernameNotFoundException {
		Users user = null;
		if (isMob(user_name)) {
			user = repo.findByMob(Long.parseLong(user_name)).orElse(null);
		} else if (isEmail(user_name)) {
			user = repo.findByEmail(user_name).orElse(null);
		} else {
			user = repo.findByUsername(user_name).orElse(null);
		}
		if (user == null)
			throw new UsernameNotFoundException("Invalid username or password");
		return new User(user_name, user.getPassword(), true, user.isActive(), true, user.isActive(),
				user.getRoles().stream().map(r -> new SimpleGrantedAuthority(AUTH_PREFIX + r.getRoleName()))
						.collect(Collectors.toSet()));
	}

	@Override
	public UsersDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public UsersDto findByUsersname(String user_name) {
		return etm.apply(repo.findByUsername(user_name).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public UsersDto findByEmail(String email) {
		return etm.apply(repo.findByEmail(email).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public UsersDto findByMob(Long mob) {
		return etm.apply(repo.findByMob(mob).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public List<UsersDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public UsersDto save(UsersDto dto) {
		if (dto.getRole_dtos() != null) {
			Set<String> role = role_service
					.findAll(dto.getRole_dtos().stream().map(r -> r.getId()).collect(Collectors.toList()));
			if (dto.getUserType().equals(UserType.CORPORATE))
				if (role.contains("SUPERADMIN"))
					throw new NotAcceptableException();
		}

		dto.setPassword(encoder.encode(dto.getPassword()));
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public UsersDto update(UsersDto dto) {
		if (dto.getRole_dtos() != null) {
			Set<String> role = role_service
					.findAll(dto.getRole_dtos().stream().map(r -> r.getId()).collect(Collectors.toList()));
			if (dto.getUserType().equals(UserType.CORPORATE))
				if (role.contains("SUPERADMIN"))
					throw new NotAcceptableException();
		}
		Users u = repo.findById(dto.getId()).get();
		dto.setPassword(u.getPassword());
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public UserData login(UserLoginDto dto) throws AuthenticationException {
		final Authentication authentication = auth_mgr
				.authenticate(new UsernamePasswordAuthenticationToken(dto.getUserName(), dto.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		final String token = token_util.generateToken(authentication);
		Users user = null;
		if (isMob(dto.getUserName())) {
			user = repo.findByMob(Long.parseLong(dto.getUserName())).orElse(null);
		} else if (isEmail(dto.getUserName())) {
			user = repo.findByEmail(dto.getUserName()).orElse(null);
		} else {
			user = repo.findByUsername(dto.getUserName()).orElse(null);
		}
		if (!user.getUserType().equals(UserType.INDIVISUAL) && !user.getUserType().equals(UserType.VENDOR)) {
			Set<ModuleType> module = user.getModules().stream().map(m -> m.getName()).collect(Collectors.toSet());
			if (!module.contains(dto.getModule()))
				throw new InsufficientAuthenticationException("You are not authorised for this action.");
		}

		return new UserData(user, token);
	}

	@Override
	public boolean forgotPassword(UserLoginDto dto) throws RuntimeException {
		Users user = null;
		if (isMob(dto.getUserName()))
			user = repo.findByMob(Long.parseLong(dto.getUserName())).orElse(null);
		else if (isEmail(dto.getUserName()))
			user = repo.findByEmail(dto.getUserName()).orElse(null);
		else
			user = repo.findByUsername(dto.getUserName()).orElse(null);
		if (user == null)
			throw new InvalidUserException();
		user.setPassword(encoder.encode(dto.getPassword()));
		repo.save(user);
		return true;
	}

	@Override
	public void resetPassword(UserLoginDto dto) throws RuntimeException {
		Users user = null;
		if (isMob(dto.getUserName()))
			user = repo.findByMob(Long.parseLong(dto.getUserName())).orElse(null);
		else if (isEmail(dto.getUserName()))
			user = repo.findByEmail(dto.getUserName()).orElse(null);
		else
			user = repo.findByUsername(dto.getUserName()).orElse(null);
		if (user == null)
			throw new InvalidUserException();
		user.setPassword(encoder.encode(dto.getPassword()));
		repo.save(user);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public UsersDto active(Boolean flag, Integer id) throws PersistenceException {
		Optional<Users> u = repo.findById(id);
		Users p = u.get();
		p.setActive(flag);
		return etm.apply(repo.save(p));
	}

	@Override
	public Integer getId(String user_name) throws AuthenticationException {
		if (isMob(user_name))
			return repo.findByMob(Long.parseLong(user_name)).get().getId();
		else if (isEmail(user_name))
			return repo.findByEmail(user_name).get().getId();
		else
			return repo.findByUsername(user_name).get().getId();

	}

	@Override
	public void postToRestaurant(CustomerDto dto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("AUTH-TOKEN",
				AuthConstant.TOKEN_PREFIX + login(new UserLoginDto("deepak.k742@gmail.com", "test")).getToken());
		try {
			String value = new ObjectMapper().writeValueAsString(dto);
			HttpEntity<String> entity = new HttpEntity<String>(value, headers);
			client.exchange("http://localhost:8184/food-express/customers", HttpMethod.POST, entity, CustomerDto.class)
					.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
