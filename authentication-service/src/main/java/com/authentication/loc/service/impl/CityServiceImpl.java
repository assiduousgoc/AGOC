package com.authentication.loc.service.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.authentication.constants.AuthConstant;
import com.authentication.exceptions.DuplicateEntryException;
import com.authentication.exceptions.EntityNotFoundException;
import com.authentication.loc.dao.CityRepository;
import com.authentication.loc.models.CityDto;
import com.authentication.loc.service.CityService;

@Service
@Transactional
public class CityServiceImpl implements CityService {

	private CityRepository repo;

	public CityServiceImpl(CityRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public CityDto findById(Integer id) throws PersistenceException {
		return etm.apply(repo.findById(id).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public CityDto findByCode(String code) throws PersistenceException {
		return etm.apply(repo.findByCode(code).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public CityDto findByName(String name) throws PersistenceException {
		return etm.apply(repo.findByName(name).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public List<CityDto> findByState(Integer state_id) throws PersistenceException {
		return etm_col.apply(repo.findByState(state_id));
	}

	@Override
	public CityDto save(CityDto dto) throws PersistenceException {
		if (repo.findByCode(dto.getCode()).isPresent())
			throw new DuplicateEntryException(AuthConstant.ExceptionCode.CONFLICT,
					AuthConstant.getConflictMessage("city code", dto.getCode()),
					AuthConstant.getConflictMessage("city code", dto.getCode()));
		if (repo.findByName(dto.getName()).isPresent())
			throw new DuplicateEntryException(AuthConstant.ExceptionCode.CONFLICT,
					AuthConstant.getConflictMessage("city name", dto.getName()),
					AuthConstant.getConflictMessage("city name", dto.getName()));
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public List<CityDto> save(List<CityDto> dtos) throws PersistenceException {
		return etm_col.apply(repo.saveAll(mte_col.apply(dtos)));
	}

	@Override
	public CityDto update(CityDto dto) throws PersistenceException {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public List<CityDto> update(List<CityDto> dtos) throws PersistenceException {
		return etm_col.apply(repo.saveAll(mte_col.apply(dtos)));
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
	public List<CityDto> findAll() throws IllegalArgumentException, RuntimeException {
		return etm_col.apply(repo.findAll());
	}

}
