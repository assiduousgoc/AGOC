package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Billing;
import com.restaurant.entities.Order;
import com.restaurant.models.BillingDto;
import com.restaurant.models.OrderDto;

public interface BillingService {

	BillingDto findById(Integer id);

	List<BillingDto> findByOrderId(Integer order_id);

	List<BillingDto> findByOrderNo(String order_no);

	List<BillingDto> findAll();

	BillingDto save(BillingDto dto);

	void delete(Integer id);

	static Billing toEntity(BillingDto dto) {
		Billing entity = new Billing();
		entity.setOrder(MapperInstance.getModelMapper().map(dto.getOrder(), Order.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return null;
	}

	static BillingDto toDto(Billing entity) {
		BillingDto dto = new BillingDto();
		dto.setOrder(MapperInstance.getModelMapper().map(entity.getOrder(), OrderDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<BillingDto, Billing> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Billing, BillingDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<BillingDto>, List<Billing>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Billing>, List<BillingDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
