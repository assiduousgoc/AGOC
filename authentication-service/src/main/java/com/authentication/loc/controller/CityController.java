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
import com.authentication.loc.models.CityDto;
import com.authentication.loc.service.CityService;
import com.dcs.common.annotation.EnableSwagger;

@RestController
@RequestMapping(value = AuthConstant.Path.BASE + AuthConstant.Symbol.SLASH + AuthConstant.Path.CITY)
@EnableSwagger
@CrossOrigin
public class CityController {

	private CityService service;

	public CityController(CityService service) {
		super();
		this.service = service;
	}

	@GetMapping
	public List<CityDto> get(HttpServletRequest req) {
		return service.findAll();

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.ID
			+ AuthConstant.Symbol.CURLI_CLOSE)
	public CityDto get(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req) {
		return service.findById(id);

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.PathVariable.CODE + AuthConstant.Symbol.SLASH
			+ AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.VALUE + AuthConstant.Symbol.CURLI_CLOSE)
	public CityDto getByCode(@PathVariable(AuthConstant.PathVariable.VALUE) String code, HttpServletRequest req) {
		return service.findByCode(code);

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.PathVariable.NAME + AuthConstant.Symbol.SLASH
			+ AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.VALUE + AuthConstant.Symbol.CURLI_CLOSE)
	public CityDto getByName(@PathVariable(AuthConstant.PathVariable.VALUE) String name, HttpServletRequest req) {
		return service.findByName(name);

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.PathVariable.STATE_ID + AuthConstant.Symbol.SLASH
			+ AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.ID + AuthConstant.Symbol.CURLI_CLOSE)
	public List<CityDto> getByState(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req) {
		return service.findByState(id);

	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<CityDto> save(@RequestBody CityDto dto, HttpServletRequest req) {
		return new ResponseEntity<CityDto>(service.save(dto), HttpStatus.CREATED);

	}

	@PostMapping(value = AuthConstant.Handler.ALL, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<CityDto>> save(@RequestBody List<CityDto> dto, HttpServletRequest req) {
		return new ResponseEntity<List<CityDto>>(service.save(dto), HttpStatus.CREATED);

	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public CityDto update(@RequestBody CityDto dto, HttpServletRequest req) {
		return service.update(dto);

	}

	@PutMapping(value = AuthConstant.Handler.ALL, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public List<CityDto> update(@RequestBody List<CityDto> dto, HttpServletRequest req) {
		return service.update(dto);

	}

	@DeleteMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.ID
			+ AuthConstant.Symbol.CURLI_CLOSE)
	public ResponseEntity<Void> delete(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req) {
		service.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	}

}
