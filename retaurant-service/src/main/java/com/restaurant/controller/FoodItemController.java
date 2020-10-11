package com.restaurant.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dcs.common.annotation.EnableSwagger;
import com.dcs.common.file.response.ResourceResult;
import com.restaurant.models.FoodItemDto;
import com.restaurant.service.FoodItemService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/food-items")
public class FoodItemController {

	private FoodItemService service;

	public FoodItemController(FoodItemService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public FoodItemDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/food-type/{id}")
	public List<FoodItemDto> findByFoodType(@PathVariable("id") Integer type_id) {
		return service.findByFoodType(type_id);
	}

	@GetMapping
	public List<FoodItemDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<FoodItemDto> save(@RequestBody FoodItemDto dto) {
		return new ResponseEntity<FoodItemDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public FoodItemDto update(@RequestBody FoodItemDto dto) {
		return service.update(dto);
	}

	@PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public FoodItemDto upload(@RequestParam("food-item-id") Integer food_item_id,
			@RequestPart("file") MultipartFile file, HttpServletRequest req) throws Exception {
		RequestMapping mapping = this.getClass().getAnnotation(RequestMapping.class);
		String download_uri = mapping != null ? mapping.value()[0] : null;
		return service.uploadImage(file, food_item_id, download_uri);
	}

	@GetMapping(value = "/get-file/{key}", produces = { MediaType.ALL_VALUE })
	public ResponseEntity<InputStreamResource> getDoc(@PathVariable("key") String key, HttpServletRequest req)
			throws Exception {
		ResourceResult result = service.getDoc(key);
		HttpHeaders headers = new HttpHeaders();
		headers.setCacheControl(CacheControl.noCache().getHeaderValue());
		headers.add("Content-Disposition", "attachment; filename=" + result.getResourceName());
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(result.getResource()));
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
