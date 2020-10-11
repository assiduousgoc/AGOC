package com.authentication.loc.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.persistence.PersistenceException;

import com.authentication.loc.entities.Country;
import com.authentication.loc.models.CountryDto;
import com.dcs.common.util.MapperInstance;

public interface CountryService {

	CountryDto findById(Integer id) throws PersistenceException;

	CountryDto findByCode(String code) throws PersistenceException;

	CountryDto findByName(String name) throws PersistenceException;

	CountryDto findByStdCode(String stdCode) throws PersistenceException;

	List<CountryDto> findAll() throws PersistenceException;

	CountryDto save(CountryDto dto) throws PersistenceException;

	List<CountryDto> save(List<CountryDto> dtos) throws PersistenceException;

	CountryDto update(CountryDto dto) throws PersistenceException;

	List<CountryDto> update(List<CountryDto> dtos) throws PersistenceException;

	void deleteByCode(String code) throws IllegalArgumentException, RuntimeException;

	void deleteByName(String name) throws IllegalArgumentException, RuntimeException;

	void deleteByStdCode(String stdCode) throws IllegalArgumentException, RuntimeException;

	void deleteById(Integer id) throws IllegalArgumentException, RuntimeException;

	static Country toEntity(CountryDto dto) {
		return MapperInstance.getModelMapper().map(dto, Country.class);
	}

	static CountryDto toDto(Country entity) {
		return MapperInstance.getModelMapper().map(entity, CountryDto.class);
	}

	Function<CountryDto, Country> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Country, CountryDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<CountryDto>, List<Country>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Country>, List<CountryDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};
}
