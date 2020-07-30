package com.ass.client.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ass.client.GMSUserClient;
import com.ass.client.config.RestClient;
import com.ass.smtfp.model.UserData;
import com.ass.smtfp.model.UserLoginDto;

@Component
public class GMSUserClientImpl implements GMSUserClient {

	public static final String LOGIN = "/users/login";

	@Override
	public UserData login(UserLoginDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<UserData> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + LOGIN, HttpMethod.POST, http_entity, UserData.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
