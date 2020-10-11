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
import com.restaurant.entities.RestaurantMenu;
import com.restaurant.models.FoodItemDto;
import com.restaurant.models.RestaurantDto;
import com.restaurant.models.RestaurantMenuDto;

public interface RestaurantMenuService {

	RestaurantMenuDto findById(Integer id);

	List<RestaurantMenuDto> findByRestaurant(Integer res_id);

	List<RestaurantMenuDto> findByFood(Integer food_id);

	List<RestaurantMenuDto> findByName(String name);

	List<RestaurantMenuDto> findAll();

	RestaurantMenuDto save(RestaurantMenuDto dto);

	RestaurantMenuDto update(RestaurantMenuDto dto);

	void delete(Integer id);

	static RestaurantMenu toEntity(RestaurantMenuDto dto) {
		RestaurantMenu entity = new RestaurantMenu();
		entity.setFoodItem(MapperInstance.getModelMapper().map(dto.getFoodItem(), FoodItem.class));
		entity.setRestaurant(MapperInstance.getModelMapper().map(dto.getRestaurant(), Restaurant.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static RestaurantMenuDto toDto(RestaurantMenu entity) {
		RestaurantMenuDto dto = new RestaurantMenuDto();
		dto.setFoodItem(MapperInstance.getModelMapper().map(entity.getFoodItem(), FoodItemDto.class));
		dto.setRestaurant(MapperInstance.getModelMapper().map(entity.getRestaurant(), RestaurantDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<RestaurantMenuDto, RestaurantMenu> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<RestaurantMenu, RestaurantMenuDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<RestaurantMenuDto>, List<RestaurantMenu>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<RestaurantMenu>, List<RestaurantMenuDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
