package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Employee;
import com.restaurant.entities.Order;
import com.restaurant.entities.OrderTrack;
import com.restaurant.models.EmployeeDto;
import com.restaurant.models.OrderDto;
import com.restaurant.models.OrderTrackDto;

public interface OrderTrackService {

	OrderTrackDto findById(Integer id);

	List<OrderTrackDto> findByOrder(Integer order_id);

	List<OrderTrackDto> findByAssignTo(Integer emp_id);

	List<OrderTrackDto> findAll();

	OrderTrackDto save(OrderTrackDto dto);

	OrderTrackDto update(OrderTrackDto dto);

	void delete(Integer id);

	static OrderTrack toEntity(OrderTrackDto dto) {
		OrderTrack entity = new OrderTrack();
		entity.setAssignTo(MapperInstance.getModelMapper().map(dto.getAssignTo(), Employee.class));
		entity.setOrder(MapperInstance.getModelMapper().map(dto.getOrder(), Order.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static OrderTrackDto toDto(OrderTrack entity) {
		OrderTrackDto dto = new OrderTrackDto();
		dto.setAssignTo(MapperInstance.getModelMapper().map(entity.getAssignTo(), EmployeeDto.class));
		dto.setOrder(MapperInstance.getModelMapper().map(entity.getOrder(), OrderDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<OrderTrackDto, OrderTrack> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<OrderTrack, OrderTrackDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<OrderTrackDto>, List<OrderTrack>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<OrderTrack>, List<OrderTrackDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
