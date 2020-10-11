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
import com.restaurant.models.RestaurantMenuDto;
import com.restaurant.service.RestaurantMenuService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/restaurant-menus")
public class RestaurantMenuController {

	private RestaurantMenuService service;

	public RestaurantMenuController(RestaurantMenuService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public RestaurantMenuDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/restaurant/{id}")
	public List<RestaurantMenuDto> findByRestaurant(@PathVariable("id") Integer res_id) {
		return service.findByRestaurant(res_id);
	}

	@GetMapping(value = "/food/{id}")
	public List<RestaurantMenuDto> findByFood(@PathVariable("id") Integer food_id) {
		return service.findByFood(food_id);
	}

	@GetMapping(value = "/name/{value}")
	public List<RestaurantMenuDto> findByName(@PathVariable("value") String name) {
		return service.findByName(name);
	}

	@GetMapping
	public List<RestaurantMenuDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<RestaurantMenuDto> save(@RequestBody RestaurantMenuDto dto) {
		return new ResponseEntity<RestaurantMenuDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public RestaurantMenuDto update(@RequestBody RestaurantMenuDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
