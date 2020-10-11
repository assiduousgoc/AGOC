package com.authentication.controller;

import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.constants.AuthConstant;
import com.authentication.models.UserData;
import com.authentication.models.UserLoginDto;
import com.authentication.service.UserService;
import com.dcs.common.annotation.EnableSwagger;

@RestController
@RequestMapping(value = AuthConstant.Path.BASE + AuthConstant.Symbol.SLASH + AuthConstant.Path.TOKEN)
@EnableSwagger
@CrossOrigin
public class AuthController {

	private UserService service;

	public AuthController(UserService service) {
		super();
		this.service = service;
	}

	@PostMapping(value = AuthConstant.Handler.LOGIN)
	public UserData login(@RequestBody UserLoginDto dto) throws AuthenticationException {
		return service.login(dto);
	}

}
