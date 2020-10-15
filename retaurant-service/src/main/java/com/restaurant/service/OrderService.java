package com.restaurant.service;

import java.util.Calendar;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.CommonUtils;
import com.dcs.common.util.MapperInstance;
import com.restaurant.enm.OrderStatusType;
import com.restaurant.entities.Customer;
import com.restaurant.entities.Order;
import com.restaurant.models.CustomerDto;
import com.restaurant.models.CustomerOrder;
import com.restaurant.models.OrderDto;

public interface OrderService {

	int min = 11111;

	int max = 99999;

	OrderDto findById(Integer id);

	OrderDto findByOrderNo(String order_no);

	List<OrderDto> findByCustomer(Integer cust_id);

	List<OrderDto> findAll();

	OrderDto save(CustomerOrder dto, Long mob) throws Exception;

	OrderDto update(OrderDto dto);
	
	OrderDto update_status(Integer id, OrderStatusType status);

	void delete(Integer id);

	static Order toEntity(OrderDto dto) {
		Order entity = new Order();
		entity.setCustomer(MapperInstance.getModelMapper().map(dto.getCustomer(), Customer.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static OrderDto toDto(Order entity) {
		OrderDto dto = new OrderDto();
		dto.setCustomer(MapperInstance.getModelMapper().map(entity.getCustomer(), CustomerDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	default String getOrderNumber() {
		Calendar cal = Calendar.getInstance();
		return "" + cal.get(Calendar.YEAR) + cal.get(Calendar.MONTH) + cal.get(Calendar.DATE)
				+ CommonUtils.getRandom(min, max);
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
