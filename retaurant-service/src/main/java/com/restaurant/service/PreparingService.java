package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Chef;
import com.restaurant.entities.FoodItem;
import com.restaurant.entities.Preparing;
import com.restaurant.models.ChefDto;
import com.restaurant.models.FoodItemDto;
import com.restaurant.models.PreparingDto;

public interface PreparingService {

	PreparingDto findById(Integer id);

	List<PreparingDto> findByFood(Integer food_id);

	List<PreparingDto> findByChef(Integer chef_id);

	List<PreparingDto> findAll();

	PreparingDto save(PreparingDto dto);

	PreparingDto update(PreparingDto dto);

	void delete(Integer id);

	static Preparing toEntity(PreparingDto dto) {
		Preparing entity = new Preparing();
		entity.setChef(MapperInstance.getModelMapper().map(dto.getChef(), Chef.class));
		entity.setFoodItem(MapperInstance.getModelMapper().map(dto.getFoodItem(), FoodItem.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static PreparingDto toDto(Preparing entity) {
		PreparingDto dto = new PreparingDto();
		dto.setChef(MapperInstance.getModelMapper().map(entity.getChef(), ChefDto.class));
		dto.setFoodItem(MapperInstance.getModelMapper().map(entity.getFoodItem(), FoodItemDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<PreparingDto, Preparing> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Preparing, PreparingDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<PreparingDto>, List<Preparing>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Preparing>, List<PreparingDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
