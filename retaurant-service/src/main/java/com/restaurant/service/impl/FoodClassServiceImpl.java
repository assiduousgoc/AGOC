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
import com.restaurant.dao.FoodClassRepository;
import com.restaurant.entities.FoodClass;
import com.restaurant.models.FoodClassDto;
import com.restaurant.service.FoodClassService;

@Service
@Transactional
public class FoodClassServiceImpl implements FoodClassService {

	private FoodClassRepository repo;

	private CommonFileStorageService fileStorageService;

	public FoodClassServiceImpl(FoodClassRepository repo, CommonFileStorageService fileStorageService) {
		super();
		this.repo = repo;
		this.fileStorageService = fileStorageService;
	}

	@Override
	public FoodClassDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<FoodClassDto> findByName(String name) {
		return etm_col.apply(repo.findByName(name));
	}

	@Override
	public List<FoodClassDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public FoodClassDto save(FoodClassDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public FoodClassDto update(FoodClassDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public FoodClassDto uploadImage(MultipartFile stream, Integer food_type_id, String download_uri) throws Exception {
		CommonFileUploadResponse response = fileStorageService.storeFile(stream.getOriginalFilename(),
				stream.getInputStream(), DOC_FOLDER, download_uri);
		Optional<FoodClass> tp = repo.findById(food_type_id);
		FoodClass t = tp.get();
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
