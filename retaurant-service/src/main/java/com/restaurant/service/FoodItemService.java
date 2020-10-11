package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.web.multipart.MultipartFile;

import com.dcs.common.file.response.ResourceResult;
import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.FoodItem;
import com.restaurant.entities.FoodType;
import com.restaurant.models.FoodItemDto;
import com.restaurant.models.FoodTypeDto;

public interface FoodItemService {

	String DOC_FOLDER = "/FOOD_ITEM_PIC";

	FoodItemDto findById(Integer id);

	List<FoodItemDto> findByFoodType(Integer type_id);

	List<FoodItemDto> findAll();

	FoodItemDto save(FoodItemDto dto);

	FoodItemDto update(FoodItemDto dto);

	FoodItemDto uploadImage(MultipartFile stream, Integer food_type_id, String download_uri) throws Exception;

	ResourceResult getDoc(String key) throws Exception;

	void delete(Integer id);

	static FoodItem toEntity(FoodItemDto dto) {
		FoodItem entity = new FoodItem();
		entity.setFoodType(MapperInstance.getModelMapper().map(dto.getFoodType(), FoodType.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static FoodItemDto toDto(FoodItem entity) {
		FoodItemDto dto = new FoodItemDto();
		dto.setFoodType(MapperInstance.getModelMapper().map(entity.getFoodType(), FoodTypeDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<FoodItemDto, FoodItem> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<FoodItem, FoodItemDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<FoodItemDto>, List<FoodItem>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<FoodItem>, List<FoodItemDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
