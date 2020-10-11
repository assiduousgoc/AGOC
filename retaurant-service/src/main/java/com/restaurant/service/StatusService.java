package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Status;
import com.restaurant.models.StatusDto;

public interface StatusService {

	StatusDto findById(Integer id);

	List<StatusDto> findByName(String name);

	List<StatusDto> findAll();

	StatusDto save(StatusDto dto);

	StatusDto update(StatusDto dto);

	void delete(Integer id);

	static Status toEntity(StatusDto dto) {
		return MapperInstance.getModelMapper().map(dto, Status.class);
	}

	static StatusDto toDto(Status entity) {
		return MapperInstance.getModelMapper().map(entity, StatusDto.class);
	}

	Function<StatusDto, Status> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Status, StatusDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<StatusDto>, List<Status>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Status>, List<StatusDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
