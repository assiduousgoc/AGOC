package com.ass.retaurant.client;

import java.util.List;
import java.util.Map;

import com.ass.smtfp.enums.UserRole;
import com.ass.smtfp.model.UserData;
import com.ass.smtfp.model.UserLoginDto;
import com.ass.smtfp.model.UsersDto;

public interface CommonUserClient {

	UserData login(UserLoginDto dto) throws RuntimeException;

	boolean logout(String token) throws RuntimeException;

	boolean forgotPassword(UserLoginDto dto) throws RuntimeException;

	boolean resetPassword(UserLoginDto dto) throws RuntimeException;

	List<UsersDto> get(String token) throws RuntimeException;

	UsersDto get(String token, Integer user_id) throws RuntimeException;

	UsersDto get(String token, String email) throws RuntimeException;

	UsersDto get(String token, Long mob) throws RuntimeException;

	List<UsersDto> get(String token, UserRole role) throws RuntimeException;

	Map<String, UserRole> getRoles(String token) throws RuntimeException;

	UsersDto save(String token, UsersDto dto) throws RuntimeException;

	UsersDto update(String token, UsersDto dto) throws RuntimeException;

	String delete(String token, UsersDto dto) throws RuntimeException;

	String delete(String token, Integer user_id) throws RuntimeException;

	String delete(String token, String email) throws RuntimeException;

	String delete(String token, Long mob) throws RuntimeException;

}
