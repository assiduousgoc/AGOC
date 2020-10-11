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
import com.restaurant.models.EmployeeDto;
import com.restaurant.service.EmployeeService;

@RestController
@CrossOrigin
@EnableSwagger
@RequestMapping(value = "/food-express/employees")
public class EmployeeController {

	private EmployeeService service;

	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/{id}")
	public EmployeeDto findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping(value = "/mob/{value}")
	public EmployeeDto findByMob(@PathVariable("value") Long mob) {
		return service.findByMob(mob);
	}

	@GetMapping(value = "/email/{value}")
	public EmployeeDto findByEmail(@PathVariable("value") String email) {
		return service.findByEmail(email);
	}

	@GetMapping(value = "/dept/{id}")
	public List<EmployeeDto> findByDept(@PathVariable("id") Integer dept_id) {
		return service.findByDept(dept_id);
	}

	@GetMapping
	public List<EmployeeDto> findAll() {
		return service.findAll();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<EmployeeDto> save(@RequestBody EmployeeDto dto) {
		return new ResponseEntity<EmployeeDto>(service.save(dto), HttpStatus.CREATED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public EmployeeDto update(@RequestBody EmployeeDto dto) {
		return service.update(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
