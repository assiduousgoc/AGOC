package com.authentication.loc.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.persistence.PersistenceException;

import com.authentication.loc.entities.Location;
import com.authentication.loc.models.LocationDto;
import com.dcs.common.util.MapperInstance;

public interface LocationService {

	LocationDto findById(Integer id) throws PersistenceException;

	LocationDto findByCode(String code) throws PersistenceException;

	LocationDto findByName(String name) throws PersistenceException;

	List<LocationDto> findAll() throws PersistenceException;

	LocationDto save(LocationDto dto) throws PersistenceException;

	List<LocationDto> save(List<LocationDto> dtos) throws PersistenceException;

	LocationDto update(LocationDto dto) throws PersistenceException;

	List<LocationDto> update(List<LocationDto> dtos) throws PersistenceException;

	LocationDto active(Boolean active, Integer id) throws PersistenceException;

	void deleteByCode(String code) throws IllegalArgumentException, RuntimeException;

	void deleteByName(String name) throws IllegalArgumentException, RuntimeException;

	void deleteById(Integer id) throws IllegalArgumentException, RuntimeException;

	static Location toEntity(LocationDto dto) {
		return MapperInstance.getModelMapper().map(dto, Location.class);
	}

	static LocationDto toDto(Location entity) {
		return MapperInstance.getModelMapper().map(entity, LocationDto.class);
	}

	Function<LocationDto, Location> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Location, LocationDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<LocationDto>, List<Location>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Location>, List<LocationDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};
}
