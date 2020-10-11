package com.restaurant.service.impl;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.restaurant.models.UsersDto;

@Service
public class UserServiceImpl implements UserDetailsService {

	private RestTemplate client;

	public UserServiceImpl(RestTemplate client) {
		super();
		this.client = client;
	}

	@Override
	public UserDetails loadUserByUsername(String user_name) throws UsernameNotFoundException {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		UsersDto user = client.exchange("http://localhost:8187/auth/users/username/" + user_name, HttpMethod.GET,
				entity, UsersDto.class).getBody();
		return new User(user_name, user.getPassword(), true, user.isActive(), true, user.isActive(), user.getRole_dtos()
				.stream().map(r -> new SimpleGrantedAuthority("ROLE_" + r.getCode())).collect(Collectors.toSet()));
	}

}
