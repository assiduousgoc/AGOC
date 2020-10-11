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
import com.restaurant.dao.FoodItemRepository;
import com.restaurant.entities.FoodItem;
import com.restaurant.models.FoodItemDto;
import com.restaurant.service.FoodItemService;

@Service
@Transactional
public class FoodItemServiceImpl implements FoodItemService {

	private FoodItemRepository repo;

	private CommonFileStorageService fileStorageService;

	public FoodItemServiceImpl(FoodItemRepository repo, CommonFileStorageService fileStorageService) {
		super();
		this.repo = repo;
		this.fileStorageService = fileStorageService;
	}

	@Override
	public FoodItemDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<FoodItemDto> findByFoodType(Integer type_id) {
		return etm_col.apply(repo.findByFoodType(type_id));
	}

	@Override
	public List<FoodItemDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public FoodItemDto save(FoodItemDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public FoodItemDto update(FoodItemDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public FoodItemDto uploadImage(MultipartFile stream, Integer food_type_id, String download_uri) throws Exception {
		CommonFileUploadResponse response = fileStorageService.storeFile(stream.getOriginalFilename(),
				stream.getInputStream(), DOC_FOLDER, download_uri);
		Optional<FoodItem> tp = repo.findById(food_type_id);
		FoodItem t = tp.get();
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
