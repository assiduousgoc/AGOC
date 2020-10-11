package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.FoodItem;
import com.restaurant.entities.Restaurant;
import com.restaurant.entities.Stock;
import com.restaurant.models.FoodItemDto;
import com.restaurant.models.RestaurantDto;
import com.restaurant.models.StockDto;

public interface StockService {

	StockDto findById(Integer id);

	List<StockDto> findByFood(Integer food_id);

	List<StockDto> findByRestaurant(Integer res_id);

	List<StockDto> findByFood(Integer food_id, boolean available);

	List<StockDto> findByRestaurant(Integer res_id, boolean available);

	List<StockDto> findAll();

	StockDto save(StockDto dto);

	StockDto update(StockDto dto);

	void delete(Integer id);

	static Stock toEntity(StockDto dto) {
		Stock entity = new Stock();
		entity.setFoodItem(MapperInstance.getModelMapper().map(dto.getFoodItem(), FoodItem.class));
		entity.setRestaurant(MapperInstance.getModelMapper().map(dto.getRestaurant(), Restaurant.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static StockDto toDto(Stock entity) {
		StockDto dto = new StockDto();
		dto.setFoodItem(MapperInstance.getModelMapper().map(entity.getFoodItem(), FoodItemDto.class));
		dto.setRestaurant(MapperInstance.getModelMapper().map(entity.getRestaurant(), RestaurantDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<StockDto, Stock> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Stock, StockDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<StockDto>, List<Stock>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Stock>, List<StockDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
