package com.authentication.loc.service.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.authentication.constants.AuthConstant;
import com.authentication.exceptions.DuplicateEntryException;
import com.authentication.exceptions.EntityNotFoundException;
import com.authentication.loc.dao.CountryRepository;
import com.authentication.loc.models.CountryDto;
import com.authentication.loc.service.CountryService;

@Service
@Transactional
public class CountrySetviceImpl implements CountryService {

	private CountryRepository repo;

	public CountrySetviceImpl(CountryRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public CountryDto findById(Integer id) throws PersistenceException {
		return etm.apply(repo.findById(id).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public CountryDto findByCode(String code) throws PersistenceException {
		return etm.apply(repo.findByCode(code).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public CountryDto findByName(String name) throws PersistenceException {
		return etm.apply(repo.findByName(name).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public CountryDto findByStdCode(String stdCode) throws PersistenceException {
		return etm.apply(repo.findByStdCode(stdCode).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public CountryDto save(CountryDto dto) throws PersistenceException {
		if (repo.findByCode(dto.getCode()).isPresent())
			throw new DuplicateEntryException(AuthConstant.ExceptionCode.CONFLICT,
					AuthConstant.getConflictMessage("country code", dto.getCode()),
					AuthConstant.getConflictMessage("country code", dto.getCode()));
		if (repo.findByName(dto.getName()).isPresent())
			throw new DuplicateEntryException(AuthConstant.ExceptionCode.CONFLICT,
					AuthConstant.getConflictMessage("country name", dto.getName()),
					AuthConstant.getConflictMessage("country name", dto.getName()));
		if (repo.findByStdCode(dto.getStdCode()).isPresent())
			throw new DuplicateEntryException(AuthConstant.ExceptionCode.CONFLICT,
					AuthConstant.getConflictMessage("STD code", dto.getStdCode()),
					AuthConstant.getConflictMessage("STD code", dto.getStdCode()));
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public List<CountryDto> save(List<CountryDto> dtos) throws PersistenceException {
		return etm_col.apply(repo.saveAll(mte_col.apply(dtos)));
	}

	@Override
	public CountryDto update(CountryDto dto) throws PersistenceException {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public List<CountryDto> update(List<CountryDto> dtos) throws PersistenceException {
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
	public void deleteByStdCode(String stdCode) throws IllegalArgumentException, RuntimeException {
		repo.deleteByStdCode(stdCode);

	}

	@Override
	public void deleteById(Integer id) throws IllegalArgumentException, RuntimeException {
		repo.deleteById(id);

	}

	@Override
	public List<CountryDto> findAll() throws PersistenceException {
		return etm_col.apply(repo.findAll());
	}

}
