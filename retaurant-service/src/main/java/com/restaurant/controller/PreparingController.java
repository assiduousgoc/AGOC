package com.restaurant.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.dcs.common.annotation.EnableSwagger;
import com.restaurant.models.PreparingDto;
import com.restaurant.service.PreparingService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/preparings")
public class PreparingController {

	private PreparingService service;

	public PreparingController(PreparingService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public PreparingDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/food/{id}")
	public List<PreparingDto> findByFood(@PathVariable("id") Integer food_id) {
		return service.findByFood(food_id);
	}

	@GetMapping(value = "/chef/{id}")
	public List<PreparingDto> findByChef(@PathVariable("id") Integer chef_id) {
		return service.findByChef(chef_id);
	}

	@GetMapping
	public List<PreparingDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<PreparingDto> save(@RequestBody PreparingDto dto) {
		return new ResponseEntity<PreparingDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public PreparingDto update(@RequestBody PreparingDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
