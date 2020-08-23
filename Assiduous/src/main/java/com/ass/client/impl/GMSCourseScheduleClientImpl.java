package com.ass.client.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ass.client.GMSCourseScheduleClient;
import com.ass.client.config.RestClient;
import com.ass.smtfp.model.CourseScheduleDto;

@Component
public class GMSCourseScheduleClientImpl implements GMSCourseScheduleClient {

	public static final String RESOURCE = "/course-schedules/";

	public static final String GET = RESOURCE + "get";

	public static final String ACTIVE = RESOURCE + "active";

	public static final String DEACTIVE = RESOURCE + "deactive";

	public static final String SAVE = RESOURCE + "save";

	public static final String UPDATE = RESOURCE + "update";

	public static final String DELETE = RESOURCE + "delete";

	public static final String CODE = "code";

	public static final String NAME = "name";

	public static final String COURSE = "course";

	public static final String TRAINER = "trainer";

	@SuppressWarnings("unchecked")
	@Override
	public List<CourseScheduleDto> get(String token) throws RuntimeException {
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
	public CourseScheduleDto get(String token, Integer id) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<CourseScheduleDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + id, HttpMethod.GET, http_entity,
					CourseScheduleDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CourseScheduleDto get(String token, String code) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<CourseScheduleDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + CODE + RestClient.SLASH + code,
					HttpMethod.GET, http_entity, CourseScheduleDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CourseScheduleDto> getByCourse(String token, Integer id) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<String> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + COURSE + RestClient.SLASH + id,
					HttpMethod.GET, http_entity, String.class);
			return RestClient.OBJECT_MAPPER.readValue(response.getBody(), ArrayList.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CourseScheduleDto> getByTrainer(String token, Integer id) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<String> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + GET + RestClient.SLASH + TRAINER + RestClient.SLASH + id,
					HttpMethod.GET, http_entity, String.class);
			return RestClient.OBJECT_MAPPER.readValue(response.getBody(), ArrayList.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CourseScheduleDto save(String token, CourseScheduleDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<CourseScheduleDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + SAVE, HttpMethod.POST, http_entity,
					CourseScheduleDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CourseScheduleDto update(String token, CourseScheduleDto dto) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			String body = RestClient.OBJECT_MAPPER.writeValueAsString(dto);
			HttpEntity<String> http_entity = new HttpEntity<String>(body, headers);
			ResponseEntity<CourseScheduleDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + UPDATE, HttpMethod.PUT, http_entity,
					CourseScheduleDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CourseScheduleDto active(String token, Integer id) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<CourseScheduleDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + ACTIVE + RestClient.SLASH + id, HttpMethod.PUT, http_entity,
					CourseScheduleDto.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CourseScheduleDto deactive(String token, Integer id) throws RuntimeException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add(RestClient.AUTH_TOKEN, token);
		try {
			HttpEntity<String> http_entity = new HttpEntity<String>(headers);
			ResponseEntity<CourseScheduleDto> response = RestClient.REST_CLIENT.exchange(
					RestClient.BASE_PATH + RestClient.GMS + DEACTIVE + RestClient.SLASH + id, HttpMethod.PUT,
					http_entity, CourseScheduleDto.class);
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

}
