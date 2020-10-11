package com.authentication.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.persistence.PersistenceException;

import org.springframework.security.core.AuthenticationException;

import com.authentication.entities.UserRole;
import com.authentication.entities.Users;
import com.authentication.loc.entities.Address;
import com.authentication.loc.entities.Location;
import com.authentication.loc.models.AddressDto;
import com.authentication.loc.models.LocationDto;
import com.authentication.models.CommonDto;
import com.authentication.models.CustomerDto;
import com.authentication.models.UserData;
import com.authentication.models.UserLoginDto;
import com.authentication.models.UsersDto;
import com.dcs.common.constant.CommonConstant;
import com.dcs.common.util.MapperInstance;
import com.dcs.validation.util.ValidatorUtil;

public interface UserService {

	String AUTH_PREFIX = "ROLE_";

	UsersDto findById(Integer id);

	UsersDto findByUsersname(String user_name);

	UsersDto findByEmail(String email);

	UsersDto findByMob(Long mob);

	List<UsersDto> findAll();

	UsersDto save(UsersDto dto);

	UsersDto update(UsersDto dto);

	UsersDto active(Boolean flag, Integer id) throws PersistenceException;

	UserData login(UserLoginDto dto) throws AuthenticationException;

	Integer getId(String user_name) throws AuthenticationException;

	boolean forgotPassword(UserLoginDto dto) throws RuntimeException;

	void resetPassword(UserLoginDto dto) throws RuntimeException;

	void postToRestaurant(CustomerDto dto);

	void delete(Integer id);

	default boolean isMob(String value) {
		if (value.length() == 10) {
			try {
				Long.parseLong(value);
				return true;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return false;
	}

	default boolean isEmail(String value) {
		return Optional.of(ValidatorUtil.match(value, CommonConstant.RegexPatternConstant.EMAIL_REGEX)).orElse(false);
	}

	static Users toEntity(UsersDto dto) {
		Users entity = new Users();
		entity.setAddress(MapperInstance.getModelMapper().map(dto.getAddress_dto(), Address.class));
		entity.setUpdateBy(1);
		if (dto.getUserName() == null || dto.getUserName().isEmpty())
			dto.setUserName(dto.getEmail());

		if (dto.getLoc_dto() != null)
			entity.setLoc(MapperInstance.getModelMapper().map(dto.getLoc_dto(), Location.class));
		if (dto.getRole_dtos() != null)
			entity.setRoles(dto.getRole_dtos().stream().map(r -> new UserRole(r.getId())).collect(Collectors.toSet()));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static UsersDto toDto(Users entity) {
		UsersDto dto = new UsersDto();
		dto.setAddress_dto(MapperInstance.getModelMapper().map(entity.getAddress(), AddressDto.class));
		if (entity.getLoc() != null)
			dto.setLoc_dto(MapperInstance.getModelMapper().map(entity.getLoc(), LocationDto.class));
		Set<UserRole> roles = entity.getRoles();
		dto.setRole_dtos(
				roles != null
						? roles.stream().map(r -> new CommonDto(r.getId(), r.getRoleName(), r.getDescription()))
								.collect(Collectors.toSet())
						: null);
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<UsersDto, Users> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Users, UsersDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<UsersDto>, List<Users>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Users>, List<UsersDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};
}
