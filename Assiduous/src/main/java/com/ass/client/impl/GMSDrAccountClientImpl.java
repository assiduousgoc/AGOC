package com.ass.client.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.ass.client.GMSCourseMappingClient;
import com.ass.client.GMSCrAccountClient;
import com.ass.client.GMSDrAccountClient;
import com.ass.client.config.RestClient;
import com.ass.smtfp.model.CourseDto;
import com.ass.smtfp.model.CourseMappingDto;
import com.ass.smtfp.model.CrAccountDto;
import com.ass.smtfp.model.DrAccountDto;

public class GMSDrAccountClientImpl implements GMSDrAccountClient {

	public static final String RESOURCE = "/drs/";

	public static final String GET = RESOURCE + "get";

	public static final String SAVE = RESOURCE + "save";

	public static final String UPDATE = RESOURCE + "update";
	
	public static final String NAME = "name";

	public static final String DELETE = RESOURCE + "delete";

	@SuppressWarnings("unchecked")
	@Override
	public List<DrAccountDto> get(String token) throws RuntimeException {
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
	public DrAccountDto get(String token, Integer id) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<DrAccountDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + id, HttpMethod.GET, http_entity,
					DrAccountDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public DrAccountDto save(String token, DrAccountDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<DrAccountDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + SAVE, HttpMethod.POST, http_entity, DrAccountDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public DrAccountDto update(String token, DrAccountDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<DrAccountDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + UPDATE, HttpMethod.PUT, http_entity, DrAccountDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public DrAccountDto getByName(String token, String name) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<DrAccountDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + NAME + RestClient.SLASH + name,
					HttpMethod.GET, http_entity, DrAccountDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String delete(String token, Integer id) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<String> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + DELETE + RestClient.SLASH + id, HttpMethod.DELETE,
					http_entity, String.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
