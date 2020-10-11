package com.authentication.service;

import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.authentication.entities.UserRole;
import com.authentication.models.UserRoleDto;
import com.dcs.common.util.MapperInstance;

public interface UserRoleService {

	UserRoleDto findById(Integer id);

	UserRoleDto findByRoleName(String role_name);

	List<UserRoleDto> findAll();
	
	Set<String> findAll(List<Integer> ids);

	UserRoleDto save(UserRoleDto dto);

	UserRoleDto update(UserRoleDto dto);

	void delete(Integer id);

	static UserRole toEntity(UserRoleDto dto) {
		UserRole entity = new UserRole();
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static UserRoleDto toDto(UserRole entity) {
		UserRoleDto dto = new UserRoleDto();
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<UserRoleDto, UserRole> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<UserRole, UserRoleDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<UserRoleDto>, List<UserRole>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<UserRole>, List<UserRoleDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};
}
