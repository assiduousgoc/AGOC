package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Billing;
import com.restaurant.entities.ShipTo;
import com.restaurant.models.BillingDto;
import com.restaurant.models.ShipToDto;

public interface ShipToService {

	ShipToDto findById(Integer id);

	List<ShipToDto> findByBilling(Integer ShipTo_id);

	List<ShipToDto> findAll();

	ShipToDto save(ShipToDto dto);

	ShipToDto update(ShipToDto dto);

	void delete(Integer id);

	static ShipTo toEntity(ShipToDto dto) {
		ShipTo entity = new ShipTo();
		entity.setBilling(MapperInstance.getModelMapper().map(dto.getBilling(), Billing.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static ShipToDto toDto(ShipTo entity) {
		ShipToDto dto = new ShipToDto();
		dto.setBilling(MapperInstance.getModelMapper().map(entity.getBilling(), BillingDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<ShipToDto, ShipTo> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<ShipTo, ShipToDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<ShipToDto>, List<ShipTo>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<ShipTo>, List<ShipToDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
