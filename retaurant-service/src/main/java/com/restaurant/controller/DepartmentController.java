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
import com.restaurant.models.DepartmentDto;
import com.restaurant.service.DepartmentService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/departments")
public class DepartmentController {

	private DepartmentService service;

	public DepartmentController(DepartmentService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public DepartmentDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/code/{value}")
	public DepartmentDto findByCode(@PathVariable("value") String code) {
		return service.findByCode(code);
	}

	@GetMapping
	public List<DepartmentDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<DepartmentDto> save(@RequestBody DepartmentDto dto) {
		return new ResponseEntity<DepartmentDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public DepartmentDto update(@RequestBody DepartmentDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
