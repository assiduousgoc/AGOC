package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Discount;
import com.restaurant.entities.FoodItem;
import com.restaurant.models.DiscountDto;
import com.restaurant.models.FoodItemDto;

public interface DiscountService {

	DiscountDto findById(Integer id);

	List<DiscountDto> findByFood(Integer food_id);

	List<DiscountDto> findAll();

	DiscountDto save(DiscountDto dto);

	DiscountDto update(DiscountDto dto);

	void delete(Integer id);

	static Discount toEntity(DiscountDto dto) {
		Discount entity = new Discount();
		entity.setFoodItem(MapperInstance.getModelMapper().map(dto.getFoodItem(), FoodItem.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static DiscountDto toDto(Discount entity) {
		DiscountDto dto = new DiscountDto();
		dto.setFoodItem(MapperInstance.getModelMapper().map(entity.getFoodItem(), FoodItemDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<DiscountDto, Discount> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Discount, DiscountDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<DiscountDto>, List<Discount>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Discount>, List<DiscountDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
