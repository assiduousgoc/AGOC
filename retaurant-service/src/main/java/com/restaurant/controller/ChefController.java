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
import com.restaurant.models.ChefDto;
import com.restaurant.service.ChefService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/chefs")
public class ChefController {

	private ChefService service;

	public ChefController(ChefService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public ChefDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/name/{value}")
	public List<ChefDto> findByName(@PathVariable("value") String name) {
		return service.findByName(name);
	}

	@GetMapping(value = "/restaurant/{id}")
	public List<ChefDto> findByRestaurant(@PathVariable("id") String res_id) {
		return service.findByRestaurant(res_id);
	}

	@GetMapping
	public List<ChefDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<ChefDto> save(@RequestBody ChefDto dto) {
		return new ResponseEntity<ChefDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ChefDto update(@RequestBody ChefDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
