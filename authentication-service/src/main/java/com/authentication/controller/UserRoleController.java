package com.authentication.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
import com.authentication.models.UserRoleDto;
import com.authentication.service.UserRoleService;
import com.dcs.common.annotation.EnableSwagger;

@RestController
@RequestMapping(value = AuthConstant.Path.BASE + AuthConstant.Symbol.SLASH + AuthConstant.Path.ROLE)
@EnableSwagger
@CrossOrigin
public class UserRoleController {

	private UserRoleService service;

	public UserRoleController(UserRoleService service) {
		super();
		this.service = service;
	}

	@PreAuthorize("hasRole('SUPERADMIN')")
	@GetMapping
	public List<UserRoleDto> get(HttpServletRequest req) {
		return service.findAll();

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.ID
			+ AuthConstant.Symbol.CURLI_CLOSE)
	public UserRoleDto get(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req) {
		return service.findById(id);

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.PathVariable.NAME + AuthConstant.Symbol.SLASH
			+ AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.VALUE + AuthConstant.Symbol.CURLI_CLOSE)
	public UserRoleDto getByRolename(@PathVariable(AuthConstant.PathVariable.VALUE) String role_name,
			HttpServletRequest req) {
		return service.findByRoleName(role_name);

	}

	@PreAuthorize("hasRole('SUPERADMIN')")
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<UserRoleDto> save(@Valid @RequestBody UserRoleDto dto, HttpServletRequest req) {
		return new ResponseEntity<UserRoleDto>(service.save(dto), HttpStatus.CREATED);

	}

	@PreAuthorize("hasRole('SUPERADMIN')")
	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public UserRoleDto update(@Valid @RequestBody UserRoleDto dto, HttpServletRequest req) {
		return service.update(dto);

	}

	@PreAuthorize("hasAnyRole('SUPERADMIN')")
	@DeleteMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.ID
			+ AuthConstant.Symbol.CURLI_CLOSE)
	public ResponseEntity<Void> delete(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	}

}
