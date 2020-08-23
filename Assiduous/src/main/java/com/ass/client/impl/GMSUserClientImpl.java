package com.ass.client.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ass.client.GMSUserClient;
import com.ass.client.config.RestClient;
import com.ass.smtfp.enums.UserRole;
import com.ass.smtfp.model.UserData;
import com.ass.smtfp.model.UserLoginDto;
import com.ass.smtfp.model.UsersDto;

@Component
public class GMSUserClientImpl implements GMSUserClient {

	public static final String RESOURCE = "/users/";

	public static final String LOGIN = RESOURCE + "login";

	public static final String LOGOUT = RESOURCE + "logout";

	public static final String FORGOT_PASSWORD = RESOURCE + "forgot-password";

	public static final String RESET_PASSWORD = RESOURCE + "reset-password";

	public static final String GET = RESOURCE + "get";

	public static final String SAVE = RESOURCE + "save";

	public static final String UPDATE = RESOURCE + "update";

	public static final String DELETE = RESOURCE + "delete";

	public static final String GET_ROLES = RESOURCE + "get-roles";

	public static final String EMAIL = "email";

	public static final String MOB = "mob";

	public static final String ROLE = "role";

	public UserData login(UserLoginDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();//put, post 
		headers.setContentType(MediaType.APPLICATION_JSON);// get not allowed
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);// post and put 
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<UserData> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + LOGIN, HttpMethod.POST, http_entity, UserData.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean logout(String token) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<Boolean> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + LOGOUT, HttpMethod.PUT, http_entity, Boolean.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean forgotPassword(UserLoginDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<Boolean> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + FORGOT_PASSWORD, HttpMethod.PUT, http_entity,
					Boolean.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean resetPassword(UserLoginDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<Boolean> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + RESET_PASSWORD, HttpMethod.PUT, http_entity, Boolean.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UsersDto> get(String token) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<String> response = RestClient.REST_CLIENT
					.exchange(RestClient.BASE_PATH + RestClient.GMS + GET, HttpMethod.GET, http_entity, String.class);
			return RestClient.OBJECT_MAPPER.readValue(response.getBody(), ArrayList.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UsersDto get(String token, Integer user_id) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<UsersDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + user_id, HttpMethod.GET,
					http_entity, UsersDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UsersDto get(String token, String email) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<UsersDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + EMAIL + RestClient.SLASH + email,
					HttpMethod.GET, http_entity, UsersDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UsersDto get(String token, Long mob) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<UsersDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + MOB + RestClient.SLASH + mob,
					HttpMethod.GET, http_entity, UsersDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UsersDto> get(String token, UserRole role) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<String> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + ROLE + RestClient.SLASH + role,
					HttpMethod.GET, http_entity, String.class);
			return RestClient.OBJECT_MAPPER.readValue(response.getBody(), ArrayList.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, UserRole> getRoles(String token) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<String> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET_ROLES, HttpMethod.GET, http_entity, String.class);
			return RestClient.OBJECT_MAPPER.readValue(response.getBody(), HashMap.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UsersDto save(String token, UsersDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<UsersDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + SAVE, HttpMethod.POST, http_entity, UsersDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UsersDto update(String token, UsersDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<UsersDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + UPDATE, HttpMethod.PUT, http_entity, UsersDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String delete(String token, UsersDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<String> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + DELETE, HttpMethod.DELETE, http_entity, String.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String delete(String token, Integer user_id) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<String> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + DELETE + RestClient.SLASH + user_id, HttpMethod.DELETE,
					http_entity, String.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String delete(String token, String email) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<String> response = RestClient.REST_CLIENT.exchange(RestClient.BASE_PATH + RestClient.GMS
					+ DELETE + RestClient.SLASH + EMAIL + RestClient.SLASH + email, HttpMethod.DELETE, http_entity,
					String.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String delete(String token, Long mob) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<String> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + DELETE + RestClient.SLASH + MOB + RestClient.SLASH + mob,
					HttpMethod.DELETE, http_entity, String.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
