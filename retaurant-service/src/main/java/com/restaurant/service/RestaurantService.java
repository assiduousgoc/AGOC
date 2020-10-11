package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Restaurant;
import com.restaurant.models.RestaurantDto;

public interface RestaurantService {

	RestaurantDto findById(Integer id);

	RestaurantDto findByPhone(String phone);

	RestaurantDto findByMob(Long mob);

	RestaurantDto findByEmail(String email);

	List<RestaurantDto> findByName(String name);

	List<RestaurantDto> findAll();

	RestaurantDto save(RestaurantDto dto);

	RestaurantDto update(RestaurantDto dto);

	void delete(Integer id);

	static Restaurant toEntity(RestaurantDto dto) {
		return MapperInstance.getModelMapper().map(dto, Restaurant.class);
	}

	static RestaurantDto toDto(Restaurant entity) {
		return MapperInstance.getModelMapper().map(entity, RestaurantDto.class);
	}

	Function<RestaurantDto, Restaurant> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Restaurant, RestaurantDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<RestaurantDto>, List<Restaurant>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Restaurant>, List<RestaurantDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
