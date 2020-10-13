package com.ass.client.config;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestClient {

	public static final String BASE_PATH = "http://103.133.214.226:8000/";

	public static final String GMS = "gym";

	public static final RestTemplate REST_CLIENT = new RestTemplate();

	public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	public static final String AUTH_TOKEN = "AUTH-TOKEN";

	public static final String SLASH = "/";

	public static final String BASE_PATH_AUTH = "http://103.133.214.226:8187/auth";

	public static final String BASE_PATH_RESTAURANT = "http://103.133.214.226:8184/food-express";

	public static final String TOKEN_PREFIX = "Bearer ";

}
