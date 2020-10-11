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
import com.restaurant.models.RestaurantDto;
import com.restaurant.service.RestaurantService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/restaurants")
public class RestaurantController {

	private RestaurantService service;

	public RestaurantController(RestaurantService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public RestaurantDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/phone/{value}")
	public RestaurantDto findByPhone(@PathVariable("value") String phone) {
		return service.findByPhone(phone);
	}

	@GetMapping(value = "/mob/{value}")
	public RestaurantDto findByMob(@PathVariable("value") Long mob) {
		return service.findByMob(mob);
	}

	@GetMapping(value = "/email/{value}")
	public RestaurantDto findByEmail(@PathVariable("value") String email) {
		return service.findByEmail(email);
	}

	@GetMapping(value = "/name/{value}")
	public List<RestaurantDto> findByName(@PathVariable("value") String name) {
		return service.findByName(name);
	}

	@GetMapping
	public List<RestaurantDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<RestaurantDto> save(@RequestBody RestaurantDto dto) {
		return new ResponseEntity<RestaurantDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public RestaurantDto update(@RequestBody RestaurantDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
