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
import com.restaurant.models.CustomerDto;
import com.restaurant.service.CustomerService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/customers")
public class CustomerController {

	private CustomerService service;

	public CustomerController(CustomerService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public CustomerDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/mob/{value}")
	public CustomerDto findByMob(@PathVariable("value") Long mob) {
		return service.findByMob(mob);
	}

	@GetMapping(value = "/name/{value}")
	public List<CustomerDto> findByName(@PathVariable("value") String name) {
		return service.findByName(name);
	}

	@GetMapping
	public List<CustomerDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<CustomerDto> save(@RequestBody CustomerDto dto) {
		return new ResponseEntity<CustomerDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public CustomerDto update(@RequestBody CustomerDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
