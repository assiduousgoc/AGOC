package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Customer;
import com.restaurant.entities.Order;
import com.restaurant.entities.Restaurant;
import com.restaurant.models.CustomerDto;
import com.restaurant.models.OrderDto;
import com.restaurant.models.RestaurantDto;

public interface OrderService {

	OrderDto findById(Integer id);

	OrderDto findByOrderNo(String order_no);

	List<OrderDto> findByCustomer(Integer cust_id);

	List<OrderDto> findByRestaurant(Integer res_id);

	List<OrderDto> findAll();

	OrderDto save(OrderDto dto);

	OrderDto update(OrderDto dto);

	void delete(Integer id);

	static Order toEntity(OrderDto dto) {
		Order entity = new Order();
		entity.setCustomer(MapperInstance.getModelMapper().map(dto.getCustomer(), Customer.class));
		entity.setRestaurant(MapperInstance.getModelMapper().map(dto.getOrderNo(), Restaurant.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static OrderDto toDto(Order entity) {
		OrderDto dto = new OrderDto();
		dto.setCustomer(MapperInstance.getModelMapper().map(entity.getCustomer(), CustomerDto.class));
		dto.setRestaurant(MapperInstance.getModelMapper().map(entity.getOrderNo(), RestaurantDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<OrderDto, Order> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Order, OrderDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<OrderDto>, List<Order>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Order>, List<OrderDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
