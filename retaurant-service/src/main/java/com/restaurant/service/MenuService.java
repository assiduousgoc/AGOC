package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.FoodItem;
import com.restaurant.entities.Menu;
import com.restaurant.models.FoodItemDto;
import com.restaurant.models.MenuDto;

public interface MenuService {

	MenuDto findById(Integer id);

	List<MenuDto> findByFood(Integer food_id);

	List<MenuDto> findByName(String name);

	List<MenuDto> findAll();

	MenuDto save(MenuDto dto);

	MenuDto update(MenuDto dto);

	void delete(Integer id);

	static Menu toEntity(MenuDto dto) {
		Menu entity = new Menu();
		entity.setFoodItem(MapperInstance.getModelMapper().map(dto.getFoodItem(), FoodItem.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static MenuDto toDto(Menu entity) {
		MenuDto dto = new MenuDto();
		dto.setFoodItem(MapperInstance.getModelMapper().map(entity.getFoodItem(), FoodItemDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<MenuDto, Menu> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Menu, MenuDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<MenuDto>, List<Menu>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Menu>, List<MenuDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
