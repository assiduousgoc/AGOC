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
import com.restaurant.models.OrderTrackDto;
import com.restaurant.service.OrderTrackService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/order-tracks")
public class OrderTrackController {

	private OrderTrackService service;

	public OrderTrackController(OrderTrackService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public OrderTrackDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/order/{id}")
	public List<OrderTrackDto> findByOrder(@PathVariable("id") Integer order_id) {
		return service.findByOrder(order_id);
	}

	@GetMapping(value = "/emp/{id}")
	public List<OrderTrackDto> findByAssignTo(@PathVariable("id") Integer emp_id) {
		return service.findByAssignTo(emp_id);
	}

	@GetMapping
	public List<OrderTrackDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<OrderTrackDto> save(@RequestBody OrderTrackDto dto) {
		return new ResponseEntity<OrderTrackDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public OrderTrackDto update(@RequestBody OrderTrackDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
