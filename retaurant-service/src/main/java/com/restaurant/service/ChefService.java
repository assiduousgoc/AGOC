package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Chef;
import com.restaurant.entities.Restaurant;
import com.restaurant.models.ChefDto;
import com.restaurant.models.RestaurantDto;

public interface ChefService {

	ChefDto findById(Integer id);

	List<ChefDto> findByName(String name);

	List<ChefDto> findByRestaurant(String res_id);

	List<ChefDto> findAll();

	ChefDto save(ChefDto dto);

	ChefDto update(ChefDto dto);

	void delete(Integer id);

	static Chef toEntity(ChefDto dto) {
		Chef entity = new Chef();
		entity.setRestaurant(MapperInstance.getModelMapper().map(dto.getRestaurant(), Restaurant.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return null;
	}

	static ChefDto toDto(Chef entity) {
		ChefDto dto = new ChefDto();
		dto.setRestaurant(MapperInstance.getModelMapper().map(entity.getRestaurant(), RestaurantDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<ChefDto, Chef> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Chef, ChefDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<ChefDto>, List<Chef>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Chef>, List<ChefDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
