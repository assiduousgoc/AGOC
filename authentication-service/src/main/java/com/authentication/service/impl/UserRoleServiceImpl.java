package com.authentication.service.impl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.authentication.dao.UserRoleRepository;
import com.authentication.exceptions.EntityNotFoundException;
import com.authentication.models.UserRoleDto;
import com.authentication.service.UserRoleService;

@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

	private UserRoleRepository repo;

	public UserRoleServiceImpl(UserRoleRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public UserRoleDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public UserRoleDto findByRoleName(String role_name) {
		return etm.apply(repo.findByRolename(role_name).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public List<UserRoleDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public Set<String> findAll(List<Integer> ids) {
		return etm_col.apply(repo.findAllById(ids)).stream().map(r -> r.getRoleName()).collect(Collectors.toSet());
	}

	@Override
	public UserRoleDto save(UserRoleDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public UserRoleDto update(UserRoleDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
