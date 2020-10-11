package com.authentication.service;

import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.authentication.enm.ModuleType;
import com.authentication.entities.Module;
import com.authentication.models.ModuleDto;
import com.dcs.common.util.MapperInstance;

public interface ModuleService {

	ModuleDto findById(Integer id);

	ModuleDto findByName(ModuleType name);

	List<ModuleDto> findAll();

	Set<ModuleType> findAll(List<Integer> ids);

	ModuleDto save(ModuleDto dto);

	ModuleDto update(ModuleDto dto);

	void delete(Integer id);

	static Module toEntity(ModuleDto dto) {
		Module entity = new Module();
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static ModuleDto toDto(Module entity) {
		ModuleDto dto = new ModuleDto();
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<ModuleDto, Module> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Module, ModuleDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<ModuleDto>, List<Module>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Module>, List<ModuleDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};
}
