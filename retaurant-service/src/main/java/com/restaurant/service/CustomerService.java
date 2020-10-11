package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Customer;
import com.restaurant.models.CustomerDto;

public interface CustomerService {

	CustomerDto findById(Integer id);

	CustomerDto findByMob(Long mob);

	List<CustomerDto> findByName(String name);

	List<CustomerDto> findAll();

	CustomerDto save(CustomerDto dto);

	CustomerDto update(CustomerDto dto);

	void delete(Integer id);

	static Customer toEntity(CustomerDto dto) {
		return MapperInstance.getModelMapper().map(dto, Customer.class);
	}

	static CustomerDto toDto(Customer entity) {
		return MapperInstance.getModelMapper().map(entity, CustomerDto.class);
	}

	Function<CustomerDto, Customer> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Customer, CustomerDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<CustomerDto>, List<Customer>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Customer>, List<CustomerDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
