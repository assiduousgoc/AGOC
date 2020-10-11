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
import com.authentication.enm.UserType;
import com.authentication.models.CustomerDto;
import com.authentication.models.UsersDto;
import com.authentication.service.UserService;
import com.dcs.common.annotation.EnableSwagger;

@RestController
@RequestMapping(value = AuthConstant.Path.BASE + AuthConstant.Symbol.SLASH + AuthConstant.Path.USER)
@EnableSwagger
@CrossOrigin
public class UserController {

	private UserService service;

	public UserController(UserService service) {
		super();
		this.service = service;
	}

	@PreAuthorize("hasAnyRole('ADMIN', 'SUPERADMIN')")
	@GetMapping
	public List<UsersDto> get(HttpServletRequest req) {
		return service.findAll();

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.ID
			+ AuthConstant.Symbol.CURLI_CLOSE)
	public UsersDto get(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req) {
		return service.findById(id);

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.PathVariable.USER_NAME + AuthConstant.Symbol.SLASH
			+ AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.VALUE + AuthConstant.Symbol.CURLI_CLOSE)
	public UsersDto getByUsername(@PathVariable(AuthConstant.PathVariable.VALUE) String user_name,
			HttpServletRequest req) {
		return service.findByUsersname(user_name);

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.PathVariable.EMAIL + AuthConstant.Symbol.SLASH
			+ AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.VALUE + AuthConstant.Symbol.CURLI_CLOSE)
	public UsersDto getByEmail(@PathVariable(AuthConstant.PathVariable.VALUE) String email, HttpServletRequest req) {
		return service.findByEmail(email);

	}

	@GetMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.PathVariable.PHONE + AuthConstant.Symbol.SLASH
			+ AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.VALUE + AuthConstant.Symbol.CURLI_CLOSE)
	public UsersDto getByMob(@PathVariable(AuthConstant.PathVariable.VALUE) Long mob, HttpServletRequest req) {
		return service.findByMob(mob);

	}

	@PostMapping(value = AuthConstant.Handler.SIGNUP, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<UsersDto> signup(@Valid @RequestBody UsersDto dto, HttpServletRequest req) {
		dto.setUserType(UserType.INDIVISUAL);
		if (dto.getRole_dtos() != null)
			dto.setRole_dtos(null);
		if (dto.getModules() != null)
			dto.setModules(null);
		UsersDto res = service.save(dto);
		service.postToRestaurant(new CustomerDto(res));
		return new ResponseEntity<UsersDto>(res, HttpStatus.CREATED);

	}

	@PostMapping(value = AuthConstant.Handler.LOGOUT)
	public ResponseEntity<Void> logout() {
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	}

	@PreAuthorize("hasAnyRole('ADMIN', 'SUPERADMIN')")
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<UsersDto> save(@Valid @RequestBody UsersDto dto, HttpServletRequest req) {
		return new ResponseEntity<UsersDto>(service.save(dto), HttpStatus.CREATED);

	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public UsersDto update(@Valid @RequestBody UsersDto dto, HttpServletRequest req) {
		return service.update(dto);

	}

	@PreAuthorize("hasAnyRole('ADMIN', 'SUPERADMIN')")
	@PutMapping(value = AuthConstant.Handler.ACTIVE + AuthConstant.Symbol.SLASH + AuthConstant.Symbol.CURLI_OPEN
			+ AuthConstant.PathVariable.ID + AuthConstant.Symbol.CURLI_CLOSE)
	public UsersDto active(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req) {
		return service.active(true, id);

	}

	@PreAuthorize("hasAnyRole('ADMIN', 'SUPERADMIN')")
	@PutMapping(value = AuthConstant.Handler.DEACTIVE + AuthConstant.Symbol.SLASH + AuthConstant.Symbol.CURLI_OPEN
			+ AuthConstant.PathVariable.ID + AuthConstant.Symbol.CURLI_CLOSE)
	public UsersDto deactive(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req) {
		return service.active(false, id);

	}

	@PreAuthorize("hasRole('SUPERADMIN')")
	@DeleteMapping(value = AuthConstant.Symbol.SLASH + AuthConstant.Symbol.CURLI_OPEN + AuthConstant.PathVariable.ID
			+ AuthConstant.Symbol.CURLI_CLOSE)
	public ResponseEntity<Void> delete(@PathVariable(AuthConstant.PathVariable.ID) Integer id, HttpServletRequest req) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	}

}
