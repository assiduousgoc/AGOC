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
import com.restaurant.enm.OrderStatusType;
import com.restaurant.models.CustomerOrder;
import com.restaurant.models.OrderDto;
import com.restaurant.service.OrderService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/orders")
public class OrderController {

	private OrderService service;

	public OrderController(OrderService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public OrderDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/order/{no}")
	public OrderDto findByOrderNo(@PathVariable("no") String order_no) {
		return service.findByOrderNo(order_no);
	}

	@GetMapping(value = "/cust/{id}")
	public List<OrderDto> findByCustomer(@PathVariable("id") Integer cust_id) {
		return service.findByCustomer(cust_id);
	}

	@GetMapping
	public List<OrderDto> findAll() {
		return service.findAll();
	}

	@PostMapping(value = "/{mob}", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<OrderDto> save(@PathVariable("mob") Long mob, @RequestBody CustomerOrder dto)
			throws Exception {
		return new ResponseEntity<OrderDto>(service.save(dto, mob), HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}/{status}")
	public OrderDto update(@PathVariable("id") Integer id, @PathVariable("status") OrderStatusType status) {
		return service.update_status(id, status);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
