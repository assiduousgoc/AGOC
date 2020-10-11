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
import com.restaurant.models.StockDto;
import com.restaurant.service.StockService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/stocks")
public class StockController {

	private StockService service;

	public StockController(StockService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public StockDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/food/{id}")
	public List<StockDto> findByFood(@PathVariable("id") Integer food_id) {
		return service.findByFood(food_id);
	}

	@GetMapping(value = "/restaurant/{id}")
	public List<StockDto> findByRestaurant(@PathVariable("id") Integer res_id) {
		return service.findByRestaurant(res_id);
	}

	@GetMapping(value = "/food/{id}/{available}")
	public List<StockDto> findByFood(@PathVariable("id") Integer food_id,
			@PathVariable("available") boolean available) {
		return service.findByFood(food_id, available);
	}

	@GetMapping(value = "/restaurant/{id}/{available}")
	public List<StockDto> findByRestaurant(@PathVariable("id") Integer res_id,
			@PathVariable("available") boolean available) {
		return service.findByRestaurant(res_id, available);
	}

	@GetMapping
	public List<StockDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<StockDto> save(@RequestBody StockDto dto) {
		return new ResponseEntity<StockDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public StockDto update(@RequestBody StockDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
