package com.authentication.loc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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

import com.authentication.constants.AuthConstant;
import com.authentication.loc.models.StateDto;
import com.authentication.loc.service.StateService;
import com.dcs.common.annotation.EnableSwagger;

@RestController
@RequestMapping(value = AuthConstant.Path.BASE + AuthConstant.Symbol.SLASH + AuthConstant.Path.STATE)
@EnableSwagger
@CrossOrigin
public class StateController {

	private StateService service;

	public StateController(StateService service) {
		super();
		this.service = service;
	}

	@GetMapping
	public List<StateDto> get(HttpServletRequest req) {
		return service.findAll();

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.ID
			+ AuthConstant.Symbol.CURLI_CLOSE)
	public StateDto get(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req) {
		return service.findById(id);

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.PathVariable.CODE + AuthConstant.Symbol.SLASH
			+ AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.VALUE + AuthConstant.Symbol.CURLI_CLOSE)
	public StateDto getByCode(@PathVariable(AuthConstant.PathVariable.VALUE) String code, HttpServletRequest req) {
		return service.findByCode(code);

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.PathVariable.NAME + AuthConstant.Symbol.SLASH
			+ AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.VALUE + AuthConstant.Symbol.CURLI_CLOSE)
	public StateDto getByName(@PathVariable(AuthConstant.PathVariable.VALUE) String name, HttpServletRequest req) {
		return service.findByName(name);

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.PathVariable.COUNTRY_ID + AuthConstant.Symbol.SLASH
			+ AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.ID + AuthConstant.Symbol.CURLI_CLOSE)
	public List<StateDto> getByState(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req) {
		return service.findByCountry(id);

	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<StateDto> save(@RequestBody StateDto dto, HttpServletRequest req) {
		return new ResponseEntity<StateDto>(service.save(dto), HttpStatus.CREATED);

	}

	@PostMapping(value = AuthConstant.Handler.ALL, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<StateDto>> save(@RequestBody List<StateDto> dto, HttpServletRequest req) {
		return new ResponseEntity<List<StateDto>>(service.save(dto), HttpStatus.CREATED);

	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public StateDto update(@RequestBody StateDto dto, HttpServletRequest req) {
		return service.update(dto);

	}

	@PutMapping(value = AuthConstant.Handler.ALL, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public List<StateDto> update(@RequestBody List<StateDto> dto, HttpServletRequest req) {
		return service.update(dto);

	}

	@DeleteMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.ID
			+ AuthConstant.Symbol.CURLI_CLOSE)
	public ResponseEntity<Void> delete(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req) {
		service.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	}

}
