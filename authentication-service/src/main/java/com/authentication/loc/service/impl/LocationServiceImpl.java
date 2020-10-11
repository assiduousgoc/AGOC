package com.authentication.loc.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.PersistenceException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.authentication.constants.AuthConstant;
import com.authentication.exceptions.DuplicateEntryException;
import com.authentication.exceptions.EntityNotFoundException;
import com.authentication.loc.dao.LocationRepository;
import com.authentication.loc.entities.Location;
import com.authentication.loc.models.LocationDto;
import com.authentication.loc.service.LocationService;

@Service
@Transactional
public class LocationServiceImpl implements LocationService {

	private LocationRepository repo;

	public LocationServiceImpl(LocationRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public LocationDto findById(Integer id) throws PersistenceException {
		return etm.apply(repo.findById(id).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public LocationDto findByCode(String code) throws PersistenceException {
		return etm.apply(repo.findByCode(code).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public LocationDto findByName(String name) throws PersistenceException {
		return etm.apply(repo.findByName(name).orElseThrow(() -> new EntityNotFoundException()));
	}

	@Override
	public List<LocationDto> findAll() throws IllegalArgumentException, RuntimeException {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public LocationDto save(LocationDto dto) throws PersistenceException {
		if (repo.findByCode(dto.getCode()).isPresent())
			throw new DuplicateEntryException(AuthConstant.ExceptionCode.CONFLICT,
					AuthConstant.getConflictMessage("location code", dto.getCode()),
					AuthConstant.getConflictMessage("location code", dto.getCode()));
		if (repo.findByName(dto.getName()).isPresent())
			throw new DuplicateEntryException(AuthConstant.ExceptionCode.CONFLICT,
					AuthConstant.getConflictMessage("location name", dto.getName()),
					AuthConstant.getConflictMessage("location name", dto.getName()));
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public List<LocationDto> save(List<LocationDto> dtos) throws PersistenceException {
		return etm_col.apply(repo.saveAll(mte_col.apply(dtos)));
	}

	@Override
	public LocationDto update(LocationDto dto) throws PersistenceException {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public List<LocationDto> update(List<LocationDto> dtos) throws PersistenceException {
		return etm_col.apply(repo.saveAll(mte_col.apply(dtos)));
	}

	@Override
	public LocationDto active(Boolean active, Integer id) throws PersistenceException {
		Optional<Location> loc = repo.findById(id);
		Location l = loc.get();
		l.setActive(active);
		return loc.isPresent() ? etm.apply(repo.save(l)) : null;
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
}
