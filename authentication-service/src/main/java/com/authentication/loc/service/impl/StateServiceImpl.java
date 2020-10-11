package com.authentication.loc.service.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.authentication.constants.AuthConstant;
import com.authentication.exceptions.DuplicateEntryException;
import com.authentication.exceptions.EntityNotFoundException;
import com.authentication.loc.dao.StateRepository;
import com.authentication.loc.models.StateDto;
import com.authentication.loc.service.StateService;

@Service
@Transactional
public class StateServiceImpl implements StateService {

	private StateRepository repo;

	public StateServiceImpl(StateRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public StateDto findById(Integer id) throws PersistenceException {
		return etm.apply(repo.findById(id).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public StateDto findByCode(String code) throws PersistenceException {
		return etm.apply(repo.findByCode(code).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public StateDto findByName(String name) throws PersistenceException {
		return etm.apply(repo.findByName(name).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public StateDto save(StateDto dto) throws PersistenceException {
		if (repo.findByCode(dto.getCode()).isPresent())
			throw new DuplicateEntryException(AuthConstant.ExceptionCode.CONFLICT,
					AuthConstant.getConflictMessage("state code", dto.getCode()),
					AuthConstant.getConflictMessage("state code", dto.getCode()));
		if (repo.findByName(dto.getName()).isPresent())
			throw new DuplicateEntryException(AuthConstant.ExceptionCode.CONFLICT,
					AuthConstant.getConflictMessage("state name", dto.getName()),
					AuthConstant.getConflictMessage("state name", dto.getName()));
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public List<StateDto> save(List<StateDto> dtos) throws PersistenceException {
		return etm_col.apply(repo.saveAll(mte_col.apply(dtos)));
	}

	@Override
	public StateDto update(StateDto dto) throws PersistenceException {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public List<StateDto> update(List<StateDto> dtos) throws PersistenceException {
		return etm_col.apply(repo.saveAll(mte_col.apply(dtos)));
	}

	@Override
	public List<StateDto> findByCountry(Integer country_id) throws PersistenceException {
		return etm_col.apply(repo.findByCountry(country_id));
	}

	@Override
	public void deleteByCode(String code) throws IllegalArgumentException, RuntimeException {
		repo.deleteByCode(code);

	}

	@Override
	public void deleteByName(String name) throws IllegalArgumentException, RuntimeException {
		repo.deleteByName(name);

	}

	@Override
	public void deleteById(Integer id) throws IllegalArgumentException, RuntimeException {
		repo.deleteById(id);

	}

	@Override
	public List<StateDto> findAll() throws PersistenceException {
		return etm_col.apply(repo.findAll());
	}

}
