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
import com.restaurant.models.PaymentDto;
import com.restaurant.service.PaymentService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/payments")
public class PaymentController {

	private PaymentService service;

	public PaymentController(PaymentService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public PaymentDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/order/{id}")
	public List<PaymentDto> findByOrder(@PathVariable("id") Integer order_id) {
		return service.findByOrder(order_id);
	}

	@GetMapping(value = "/bill/{id}")
	public List<PaymentDto> findByBilling(@PathVariable("id") Integer bill_id) {
		return service.findByBilling(bill_id);
	}

	@GetMapping(value = "/cust/{id}")
	public List<PaymentDto> findByCustomer(@PathVariable("id") Integer cust_id) {
		return service.findByCustomer(cust_id);
	}

	@GetMapping
	public List<PaymentDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<PaymentDto> save(@RequestBody PaymentDto dto) {
		return new ResponseEntity<PaymentDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public PaymentDto update(@RequestBody PaymentDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
