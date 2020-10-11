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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcs.common.annotation.EnableSwagger;
import com.restaurant.models.BillingDto;
import com.restaurant.service.BillingService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/billings")
public class BillingController {

	private BillingService service;

	public BillingController(BillingService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public BillingDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/order/{id}")
	public List<BillingDto> findByOrderId(@PathVariable("id") Integer id) {
		return service.findByOrderId(id);
	}

	@GetMapping(value = "/{order-no}")
	public List<BillingDto> findByOrderNo(@PathVariable("order-no") String order_no) {
		return service.findByOrderNo(order_no);
	}

	@GetMapping
	public List<BillingDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<BillingDto> save(@RequestBody BillingDto dto) {
		return new ResponseEntity<BillingDto>(service.save(dto), HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
