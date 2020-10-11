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
import com.restaurant.entities.FoodClass;
import com.restaurant.models.FoodClassDto;

public interface FoodClassService {

	String DOC_FOLDER = "/FOOD_CLASS_PIC";

	FoodClassDto findById(Integer id);

	List<FoodClassDto> findByName(String name);

	List<FoodClassDto> findAll();

	FoodClassDto save(FoodClassDto dto);

	FoodClassDto update(FoodClassDto dto);

	FoodClassDto uploadImage(MultipartFile stream, Integer food_type_id, String download_uri) throws Exception;

	ResourceResult getDoc(String key) throws Exception;

	void delete(Integer id);

	static FoodClass toEntity(FoodClassDto dto) {
		return MapperInstance.getModelMapper().map(dto, FoodClass.class);
	}

	static FoodClassDto toDto(FoodClass entity) {
		return MapperInstance.getModelMapper().map(entity, FoodClassDto.class);
	}

	Function<FoodClassDto, FoodClass> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<FoodClass, FoodClassDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<FoodClassDto>, List<FoodClass>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<FoodClass>, List<FoodClassDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
