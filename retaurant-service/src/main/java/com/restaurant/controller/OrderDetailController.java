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
import com.restaurant.models.OrderDetailDto;
import com.restaurant.service.OrderDetailService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/order-details")
public class OrderDetailController {

	private OrderDetailService service;

	public OrderDetailController(OrderDetailService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public OrderDetailDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/food/{id}")
	public List<OrderDetailDto> findByFood(@PathVariable("id") Integer food_id) {
		return service.findByFood(food_id);
	}

	@GetMapping(value = "/order/{id}")
	public List<OrderDetailDto> findByOrder(@PathVariable("id") Integer order_id) {
		return service.findByOrder(order_id);
	}

	@GetMapping(value = "/order-no/{value}")
	public List<OrderDetailDto> findByOrder(@PathVariable("value") String order_no) {
		return service.findByOrder(order_no);
	}

	@GetMapping
	public List<OrderDetailDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<OrderDetailDto> save(@RequestBody OrderDetailDto dto) {
		return new ResponseEntity<OrderDetailDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public OrderDetailDto update(@RequestBody OrderDetailDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
