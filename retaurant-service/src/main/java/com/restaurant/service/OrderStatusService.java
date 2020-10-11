package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Order;
import com.restaurant.entities.OrderStatus;
import com.restaurant.models.OrderDto;
import com.restaurant.models.OrderStatusDto;

public interface OrderStatusService {

	OrderStatusDto findById(Integer id);

	List<OrderStatusDto> findByOrder(Integer order_id);

	List<OrderStatusDto> findByStatus(Integer status_id);

	List<OrderStatusDto> findAll();

	OrderStatusDto save(OrderStatusDto dto);

	OrderStatusDto update(OrderStatusDto dto);

	void delete(Integer id);

	static OrderStatus toEntity(OrderStatusDto dto) {
		OrderStatus entity = new OrderStatus();
		entity.setOrder(MapperInstance.getModelMapper().map(dto.getOrder(), Order.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static OrderStatusDto toDto(OrderStatus entity) {
		OrderStatusDto dto = new OrderStatusDto();
		dto.setOrder(MapperInstance.getModelMapper().map(entity.getOrder(), OrderDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<OrderStatusDto, OrderStatus> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<OrderStatus, OrderStatusDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<OrderStatusDto>, List<OrderStatus>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<OrderStatus>, List<OrderStatusDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
