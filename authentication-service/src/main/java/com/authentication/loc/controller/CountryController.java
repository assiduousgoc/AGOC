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
import com.authentication.loc.models.CountryDto;
import com.authentication.loc.service.CountryService;
import com.dcs.common.annotation.EnableSwagger;

@RestController
@RequestMapping(value = AuthConstant.Path.BASE + AuthConstant.Symbol.SLASH + AuthConstant.Path.COUNTRY)
@EnableSwagger
@CrossOrigin
public class CountryController {

	private CountryService service;

	public CountryController(CountryService service) {
		super();
		this.service = service;
	}

	@GetMapping
	public List<CountryDto> get(HttpServletRequest req) throws RuntimeException {
		return service.findAll();

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.ID
			+ AuthConstant.Symbol.CURLI_CLOSE)
	public CountryDto get(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req)
			throws RuntimeException {
		return service.findById(id);

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.PathVariable.CODE + AuthConstant.Symbol.SLASH
			+ AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.VALUE + AuthConstant.Symbol.CURLI_CLOSE)
	public CountryDto getByCode(@PathVariable(AuthConstant.PathVariable.VALUE) String code, HttpServletRequest req)
			throws RuntimeException {
		return service.findByCode(code);

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.PathVariable.NAME + AuthConstant.Symbol.SLASH
			+ AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.VALUE + AuthConstant.Symbol.CURLI_CLOSE)
	public CountryDto getByName(@PathVariable(AuthConstant.PathVariable.VALUE) String code, HttpServletRequest req)
			throws RuntimeException {
		return service.findByCode(code);

	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<CountryDto> save(@RequestBody CountryDto dto, HttpServletRequest req)
			throws RuntimeException {
		return new ResponseEntity<CountryDto>(service.save(dto), HttpStatus.CREATED);

	}

	@PostMapping(value = AuthConstant.Handler.ALL, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<CountryDto>> save(@RequestBody List<CountryDto> dto, HttpServletRequest req)
			throws RuntimeException {
		return new ResponseEntity<List<CountryDto>>(service.save(dto), HttpStatus.CREATED);

	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public CountryDto update(@RequestBody CountryDto dto, HttpServletRequest req) throws RuntimeException {
		return service.update(dto);

	}

	@PutMapping(value = AuthConstant.Handler.ALL, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public List<CountryDto> update(@RequestBody List<CountryDto> dto, HttpServletRequest req) throws RuntimeException {
		return service.update(dto);

	}

	@DeleteMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.ID
			+ AuthConstant.Symbol.CURLI_CLOSE)
	public ResponseEntity<Void> delete(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req)
			throws RuntimeException {
		service.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	}

}
