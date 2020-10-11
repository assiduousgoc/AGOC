package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.BillTo;
import com.restaurant.entities.Billing;
import com.restaurant.models.BillToDto;
import com.restaurant.models.BillingDto;

public interface BillToService {

	BillToDto findById(Integer id);

	List<BillToDto> findByBilling(Integer billing_id);

	List<BillToDto> findByOrderNo(String order_no);

	List<BillToDto> findAll();

	BillToDto save(BillToDto dto);

	BillToDto update(BillToDto dto);

	void delete(Integer id);

	static BillTo toEntity(BillToDto dto) {
		BillTo entity = new BillTo();
		entity.setBilling(MapperInstance.getModelMapper().map(dto.getBilling(), Billing.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static BillToDto toDto(BillTo entity) {
		BillToDto dto = new BillToDto();
		dto.setBilling(MapperInstance.getModelMapper().map(entity.getBilling(), BillingDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<BillToDto, BillTo> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<BillTo, BillToDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<BillToDto>, List<BillTo>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<BillTo>, List<BillToDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
