package com.authentication.loc.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.persistence.PersistenceException;

import com.authentication.loc.entities.City;
import com.authentication.loc.entities.State;
import com.authentication.loc.models.CityDto;
import com.authentication.models.CommonDto;
import com.dcs.common.util.MapperInstance;

public interface CityService {

	CityDto findById(Integer id) throws PersistenceException;

	CityDto findByCode(String code) throws PersistenceException;

	CityDto findByName(String name) throws PersistenceException;

	List<CityDto> findAll() throws PersistenceException;

	List<CityDto> findByState(Integer state_id) throws PersistenceException;

	CityDto save(CityDto dto) throws PersistenceException;

	List<CityDto> save(List<CityDto> dtos) throws PersistenceException;

	CityDto update(CityDto dto) throws PersistenceException;

	List<CityDto> update(List<CityDto> dtos) throws PersistenceException;

	void deleteByCode(String code) throws IllegalArgumentException, RuntimeException;

	void deleteByName(String name) throws IllegalArgumentException, RuntimeException;

	void deleteById(Integer id) throws IllegalArgumentException, RuntimeException;

	static City toEntity(CityDto dto) {
		City entity = new City();
		entity.setState(new State(dto.getStateDto().getId()));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static CityDto toDto(City entity) {
		CityDto dto = new CityDto();
		dto.setStateDto(
				new CommonDto(entity.getState().getId(), entity.getState().getCode(), entity.getState().getName()));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<CityDto, City> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<City, CityDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<CityDto>, List<City>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<City>, List<CityDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};
}
