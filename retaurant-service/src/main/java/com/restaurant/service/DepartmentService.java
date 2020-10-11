package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Department;
import com.restaurant.models.DepartmentDto;

public interface DepartmentService {

	DepartmentDto findById(Integer id);

	DepartmentDto findByCode(String code);

	List<DepartmentDto> findAll();

	DepartmentDto save(DepartmentDto dto);

	DepartmentDto update(DepartmentDto dto);

	void delete(Integer id);

	static Department toEntity(DepartmentDto dto) {
		return MapperInstance.getModelMapper().map(dto, Department.class);
	}

	static DepartmentDto toDto(Department entity) {
		return MapperInstance.getModelMapper().map(entity, DepartmentDto.class);
	}

	Function<DepartmentDto, Department> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Department, DepartmentDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<DepartmentDto>, List<Department>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Department>, List<DepartmentDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
