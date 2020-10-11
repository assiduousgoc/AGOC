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
import com.restaurant.models.PaymentTypeDto;
import com.restaurant.service.PaymentTypeService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/payment-types")
public class PaymentTypeController {

	private PaymentTypeService service;

	public PaymentTypeController(PaymentTypeService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public PaymentTypeDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/name/{value}")
	public List<PaymentTypeDto> findByName(@PathVariable("value") String name) {
		return service.findByName(name);
	}

	@GetMapping
	public List<PaymentTypeDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<PaymentTypeDto> save(@RequestBody PaymentTypeDto dto) {
		return new ResponseEntity<PaymentTypeDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public PaymentTypeDto update(@RequestBody PaymentTypeDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
