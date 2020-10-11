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
import com.restaurant.models.OrderStatusDto;
import com.restaurant.service.OrderStatusService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/order-statuses")
public class OrderStatusController {

	private OrderStatusService service;

	public OrderStatusController(OrderStatusService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public OrderStatusDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/order/{id}")
	public List<OrderStatusDto> findByOrder(@PathVariable("id") Integer order_id) {
		return service.findByOrder(order_id);
	}

	@GetMapping(value = "/status/{id}")
	public List<OrderStatusDto> findByStatus(@PathVariable("id") Integer status_id) {
		return service.findByStatus(status_id);
	}

	@GetMapping
	public List<OrderStatusDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<OrderStatusDto> save(@RequestBody OrderStatusDto dto) {
		return new ResponseEntity<OrderStatusDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public OrderStatusDto update(@RequestBody OrderStatusDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
