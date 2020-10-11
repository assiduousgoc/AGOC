package com.authentication.service.impl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.authentication.dao.ModuleRepository;
import com.authentication.enm.ModuleType;
import com.authentication.exceptions.EntityNotFoundException;
import com.authentication.models.ModuleDto;
import com.authentication.service.ModuleService;

@Service
@Transactional
public class ModuleServiceImpl implements ModuleService {

	private ModuleRepository repo;

	public ModuleServiceImpl(ModuleRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public ModuleDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public ModuleDto findByName(ModuleType name) {
		return etm.apply(repo.findByName(name).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public List<ModuleDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public Set<ModuleType> findAll(List<Integer> ids) {
		return etm_col.apply(repo.findAllById(ids)).stream().map(m -> m.getName()).collect(Collectors.toSet());
	}

	@Override
	public ModuleDto save(ModuleDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public ModuleDto update(ModuleDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
