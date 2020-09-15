package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.CourseMappingDto;

public interface GMSCourseMappingClient {
	
	List<CourseMappingDto> get(String token) throws RuntimeException;

	CourseMappingDto get(String token, Integer id) throws RuntimeException;

	CourseMappingDto save(String token, CourseMappingDto dto) throws RuntimeException;

	CourseMappingDto update(String token, CourseMappingDto dto) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;
	
}