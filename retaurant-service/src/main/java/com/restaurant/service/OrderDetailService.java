package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.FoodItem;
import com.restaurant.entities.Order;
import com.restaurant.entities.OrderDetail;
import com.restaurant.models.FoodItemDto;
import com.restaurant.models.OrderDetailDto;
import com.restaurant.models.OrderDto;

public interface OrderDetailService {

	OrderDetailDto findById(Integer id);

	List<OrderDetailDto> findByFood(Integer food_id);

	List<OrderDetailDto> findByOrder(Integer order_id);

	List<OrderDetailDto> findByOrder(String order_no);

	List<OrderDetailDto> findAll();

	OrderDetailDto save(OrderDetailDto dto);

	OrderDetailDto update(OrderDetailDto dto);

	void delete(Integer id);

	static OrderDetail toEntity(OrderDetailDto dto) {
		OrderDetail entity = new OrderDetail();
		entity.setOrder(MapperInstance.getModelMapper().map(dto.getOrder(), Order.class));
		entity.setFoodItem(MapperInstance.getModelMapper().map(dto.getFoodItem(), FoodItem.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static OrderDetailDto toDto(OrderDetail entity) {
		OrderDetailDto dto = new OrderDetailDto();
		dto.setOrder(MapperInstance.getModelMapper().map(entity.getOrder(), OrderDto.class));
		dto.setFoodItem(MapperInstance.getModelMapper().map(entity.getFoodItem(), FoodItemDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<OrderDetailDto, OrderDetail> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<OrderDetail, OrderDetailDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<OrderDetailDto>, List<OrderDetail>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<OrderDetail>, List<OrderDetailDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};
}
