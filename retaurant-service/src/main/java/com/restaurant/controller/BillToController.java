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
import com.restaurant.models.BillToDto;
import com.restaurant.service.BillToService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/bill-to")
public class BillToController {

	private BillToService service;

	public BillToController(BillToService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public BillToDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/bill/{id}")
	public List<BillToDto> findByBilling(@PathVariable("id") Integer id) {
		return service.findByBilling(id);
	}

	@GetMapping(value = "/order/{no}")
	public List<BillToDto> findByOrderNo(@PathVariable("no") String order_no) {
		return service.findByOrderNo(order_no);
	}

	@GetMapping
	public List<BillToDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<BillToDto> save(@RequestBody BillToDto dto) {
		return new ResponseEntity<BillToDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public BillToDto update(@RequestBody BillToDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
