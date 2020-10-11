package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Department;
import com.restaurant.entities.Employee;
import com.restaurant.models.DepartmentDto;
import com.restaurant.models.EmployeeDto;

public interface EmployeeService {

	EmployeeDto findById(Integer id);

	EmployeeDto findByMob(Long mob);

	EmployeeDto findByEmail(String email);

	List<EmployeeDto> findByDept(Integer dept_id);

	List<EmployeeDto> findAll();

	EmployeeDto save(EmployeeDto dto);

	EmployeeDto update(EmployeeDto dto);

	void delete(Integer id);

	static Employee toEntity(EmployeeDto dto) {
		Employee entity = new Employee();
		entity.setDept(MapperInstance.getModelMapper().map(dto.getDeptDto(), Department.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return entity;
	}

	static EmployeeDto toDto(Employee entity) {
		EmployeeDto dto = new EmployeeDto();
		dto.setDeptDto(MapperInstance.getModelMapper().map(entity.getDept(), DepartmentDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<EmployeeDto, Employee> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Employee, EmployeeDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<EmployeeDto>, List<Employee>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Employee>, List<EmployeeDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
