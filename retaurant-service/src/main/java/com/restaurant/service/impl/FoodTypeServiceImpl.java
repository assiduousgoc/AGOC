package com.restaurant.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.dcs.common.file.response.CommonFileUploadResponse;
import com.dcs.common.file.response.ResourceResult;
import com.dcs.common.file.service.CommonFileStorageService;
import com.restaurant.dao.FoodTypeRepository;
import com.restaurant.entities.FoodType;
import com.restaurant.models.FoodTypeDto;
import com.restaurant.service.FoodTypeService;

@Service
@Transactional
public class FoodTypeServiceImpl implements FoodTypeService {

	private FoodTypeRepository repo;

	private CommonFileStorageService fileStorageService;

	public FoodTypeServiceImpl(FoodTypeRepository repo, CommonFileStorageService fileStorageService) {
		super();
		this.repo = repo;
		this.fileStorageService = fileStorageService;
	}

	@Override
	public FoodTypeDto findfyId(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<FoodTypeDto> findByName(String name) {
		return etm_col.apply(repo.findByName(name));
	}

	@Override
	public List<FoodTypeDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public FoodTypeDto save(FoodTypeDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public FoodTypeDto update(FoodTypeDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public FoodTypeDto uploadImage(MultipartFile stream, Integer food_type_id, String download_uri) throws Exception {
		CommonFileUploadResponse response = fileStorageService.storeFile(stream.getOriginalFilename(),
				stream.getInputStream(), DOC_FOLDER, download_uri);
		Optional<FoodType> tp = repo.findById(food_type_id);
		FoodType t = tp.get();
		t.setUri(response.getFileDownloadUri());
		return etm.apply(repo.save(t));
	}

	@Override
	public ResourceResult getDoc(String key) throws Exception {
		Resource resource = fileStorageService.getFile(key, DOC_FOLDER);
		return new ResourceResult(resource.getInputStream(), resource.getFilename());
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
