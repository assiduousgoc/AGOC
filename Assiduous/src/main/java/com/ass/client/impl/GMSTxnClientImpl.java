package com.ass.client.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import com.ass.client.GMSTxnClient;
import com.ass.client.config.RestClient;
import com.ass.smtfp.model.LedgerDto;
import com.ass.smtfp.model.TxnDto;

public class GMSTxnClientImpl implements GMSTxnClient {

	public static final String RESOURCE = "/txns/";

	public static final String GET = RESOURCE + "get";

	public static final String SAVE = RESOURCE + "save";

	public static final String UPDATE = RESOURCE + "update";
	
	public static final String TRAINEE = "trainee";

	public static final String DELETE = RESOURCE + "delete";

	@SuppressWarnings("unchecked")
	@Override
	public List<TxnDto> get(String token) throws RuntimeException {
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
	public TxnDto get(String token, Integer id) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<TxnDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + id, HttpMethod.GET, http_entity,
					TxnDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public TxnDto save(String token, TxnDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<TxnDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + SAVE, HttpMethod.POST, http_entity, TxnDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public TxnDto update(String token, TxnDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<TxnDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + UPDATE, HttpMethod.PUT, http_entity, TxnDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public TxnDto getByTrainee(String token, Integer id) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<TxnDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET +  RestClient.SLASH +TRAINEE+  RestClient.SLASH + id,
					HttpMethod.GET, http_entity, TxnDto.class);
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

	/*@Override
	public LedgerDto pay(String token, TxnDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<TxnDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + UPDATE, HttpMethod.PUT, http_entity, TxnDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}*/

	/*@Override
	public LedgerDto receive(String token, TxnDto dto) throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}*/

}
