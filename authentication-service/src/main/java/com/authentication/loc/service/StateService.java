package com.authentication.loc.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.persistence.PersistenceException;

import com.authentication.loc.entities.Country;
import com.authentication.loc.entities.State;
import com.authentication.loc.models.StateDto;
import com.authentication.models.CommonDto;
import com.dcs.common.util.MapperInstance;

public interface StateService {

	StateDto findById(Integer id) throws PersistenceException;

	StateDto findByCode(String code) throws PersistenceException;

	StateDto findByName(String name) throws PersistenceException;

	List<StateDto> findAll() throws PersistenceException;

	StateDto save(StateDto dto) throws PersistenceException;

	List<StateDto> save(List<StateDto> dtos) throws PersistenceException;

	StateDto update(StateDto dto) throws PersistenceException;

	List<StateDto> update(List<StateDto> dtos) throws PersistenceException;

	List<StateDto> findByCountry(Integer country_id) throws PersistenceException;

	void deleteByCode(String code) throws IllegalArgumentException, RuntimeException;

	void deleteByName(String name) throws IllegalArgumentException, RuntimeException;

	void deleteById(Integer id) throws IllegalArgumentException, RuntimeException;

	static State toEntity(StateDto dto) {
		State entity = new State();
		entity.setCountry(new Country(dto.getCountryDto().getId()));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static StateDto toDto(State entity) {
		StateDto dto = new StateDto();
		dto.setCountryDto(new CommonDto(entity.getCountry().getId(), entity.getCountry().getCode(),
				entity.getCountry().getName()));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<StateDto, State> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<State, StateDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<StateDto>, List<State>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<State>, List<StateDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};
}
