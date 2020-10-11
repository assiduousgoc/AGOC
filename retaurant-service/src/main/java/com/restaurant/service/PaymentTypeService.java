package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.PaymentType;
import com.restaurant.models.PaymentTypeDto;

public interface PaymentTypeService {

	PaymentTypeDto findById(Integer id);

	List<PaymentTypeDto> findByName(String name);

	List<PaymentTypeDto> findAll();

	PaymentTypeDto save(PaymentTypeDto dto);

	PaymentTypeDto update(PaymentTypeDto dto);

	void delete(Integer id);

	static PaymentType toEntity(PaymentTypeDto dto) {
		return MapperInstance.getModelMapper().map(dto, PaymentType.class);
	}

	static PaymentTypeDto toDto(PaymentType entity) {
		return MapperInstance.getModelMapper().map(entity, PaymentTypeDto.class);
	}

	Function<PaymentTypeDto, PaymentType> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<PaymentType, PaymentTypeDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<PaymentTypeDto>, List<PaymentType>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<PaymentType>, List<PaymentTypeDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
