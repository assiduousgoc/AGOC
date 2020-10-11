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
import com.restaurant.entities.FoodType;
import com.restaurant.models.FoodTypeDto;

public interface FoodTypeService {

	String DOC_FOLDER = "/FOOD_TYPE_PIC";

	FoodTypeDto findfyId(Integer id);

	List<FoodTypeDto> findByName(String name);

	List<FoodTypeDto> findAll();

	FoodTypeDto save(FoodTypeDto dto);

	FoodTypeDto update(FoodTypeDto dto);

	FoodTypeDto uploadImage(MultipartFile stream, Integer food_type_id, String download_uri) throws Exception;

	ResourceResult getDoc(String key) throws Exception;

	void delete(Integer id);

	static FoodType toEntity(FoodTypeDto dto) {
		return MapperInstance.getModelMapper().map(dto, FoodType.class);
	}

	static FoodTypeDto toDto(FoodType entity) {
		return MapperInstance.getModelMapper().map(entity, FoodTypeDto.class);
	}

	Function<FoodTypeDto, FoodType> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<FoodType, FoodTypeDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<FoodTypeDto>, List<FoodType>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<FoodType>, List<FoodTypeDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
