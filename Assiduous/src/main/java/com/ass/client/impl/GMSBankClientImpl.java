package com.ass.client.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ass.client.GMSBankClient;
import com.ass.client.config.RestClient;
import com.ass.smtfp.model.BankDto;
import com.ass.smtfp.model.CourseDto;

@Component
public class GMSBankClientImpl 	implements GMSBankClient {

		public static final String RESOURCE = "/banks/";

		public static final String GET = RESOURCE + "get";
		
		public static final String ACTIVE = RESOURCE + "active";

		public static final String DEACTIVE = RESOURCE + "deactive";

		public static final String SAVE = RESOURCE + "save";

		public static final String UPDATE = RESOURCE + "update";

		public static final String DELETE = RESOURCE + "delete";

		public static final String CODE = "code";

		public static final String NAME = "name";

		@SuppressWarnings("unchecked")
		@Override
		public List<BankDto> get(String token) throws RuntimeException {
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
		public BankDto get(String token, Integer id) throws RuntimeException {
			HttpHeaders headers = new HttpHeaders();
			headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
			headers.add(RestClient.AUTH_TOKEN, token);
			try {
				HttpEntity<String> http_entity = new HttpEntity<String>(headers);
				ResponseEntity<BankDto> response = RestClient.REST_CLIENT.exchange(
						RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + id, HttpMethod.GET, http_entity,
						BankDto.class);
				return response.getBody();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public BankDto get(String token, String code) throws RuntimeException {
			HttpHeaders headers = new HttpHeaders();
			headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
			headers.add(RestClient.AUTH_TOKEN, token);
			try {
				HttpEntity<String> http_entity = new HttpEntity<String>(headers);
				ResponseEntity<BankDto> response = RestClient.REST_CLIENT.exchange(
						RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + CODE + RestClient.SLASH + code,
						HttpMethod.GET, http_entity, BankDto.class);
				return response.getBody();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public BankDto getByName(String token, String name) throws RuntimeException {
			HttpHeaders headers = new HttpHeaders();
			headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
			headers.add(RestClient.AUTH_TOKEN, token);
			try {
				HttpEntity<String> http_entity = new HttpEntity<String>(headers);
				ResponseEntity<BankDto> response = RestClient.REST_CLIENT.exchange(
						RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + NAME + RestClient.SLASH + name,
						HttpMethod.GET, http_entity, BankDto.class);
				return response.getBody();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public BankDto save(String token, BankDto dto) throws RuntimeException {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
			headers.add(RestClient.AUTH_TOKEN, token);
			try {
				String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
				HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
				ResponseEntity<BankDto> response = RestClient.REST_CLIENT.exchange(
						RestClient.BASE_PATH + RestClient.GMS + SAVE, HttpMethod.POST, http_entity, BankDto.class);
				return response.getBody();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public BankDto update(String token, BankDto dto) throws RuntimeException {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
			headers.add(RestClient.AUTH_TOKEN, token);
			try {
				String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
				HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
				ResponseEntity<BankDto> response = RestClient.REST_CLIENT.exchange(
						RestClient.BASE_PATH + RestClient.GMS + UPDATE, HttpMethod.PUT, http_entity, BankDto.class);
				return response.getBody();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public String delete(String token, Integer id) throws RuntimeException {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
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

		@Override
		public String delete(String token, String code) throws RuntimeException {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
			headers.add(RestClient.AUTH_TOKEN, token);
			try {
				HttpEntity<String> http_entity = new HttpEntity<String>(headers);
				ResponseEntity<String> response = RestClient.REST_CLIENT.exchange(
						RestClient.BASE_PATH + RestClient.GMS + DELETE + RestClient.SLASH + CODE + RestClient.SLASH + code,
						HttpMethod.DELETE, http_entity, String.class);
				return response.getBody();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		@Override
		public BankDto active(String token, Integer id) throws RuntimeException {
			HttpHeaders headers = new HttpHeaders();
			headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.add(RestClient.AUTH_TOKEN, token);
			try {
				HttpEntity<String> http_entity = new HttpEntity<String>(headers);
				ResponseEntity<BankDto> response = RestClient.REST_CLIENT.exchange(
						RestClient.BASE_PATH + RestClient.GMS + ACTIVE + RestClient.SLASH + id, HttpMethod.PUT, http_entity,
						BankDto.class);
				return response.getBody();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public BankDto deactive(String token, Integer id) throws RuntimeException {
			HttpHeaders headers = new HttpHeaders();
			headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.add(RestClient.AUTH_TOKEN, token);
			try {
				HttpEntity<String> http_entity = new HttpEntity<String>(headers);
				ResponseEntity<BankDto> response = RestClient.REST_CLIENT.exchange(
						RestClient.BASE_PATH + RestClient.GMS + DEACTIVE + RestClient.SLASH + id, HttpMethod.PUT,
						http_entity, BankDto.class);
				return response.getBody();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

	}

