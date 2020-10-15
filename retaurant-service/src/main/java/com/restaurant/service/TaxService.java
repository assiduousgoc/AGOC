package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Tax;
import com.restaurant.models.TaxDto;

public interface TaxService {

	TaxDto findById(Integer id);

	List<TaxDto> findByName(String name);

	List<TaxDto> findAll();

	TaxDto save(TaxDto dto);

	TaxDto update(TaxDto dto);

	void delete(Integer id);

	static Tax mte(TaxDto dto) {
		return MapperInstance.getModelMapper().map(dto, Tax.class);
	}

	static TaxDto etm(Tax entity) {
		return MapperInstance.getModelMapper().map(entity, TaxDto.class);
	}

	Function<TaxDto, Tax> mte = (dto) -> {
		return mte(dto);
	};

	Function<Tax, TaxDto> etm = (en) -> {
		return etm(en);
	};

	Function<List<TaxDto>, List<Tax>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Tax>, List<TaxDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};
}
