package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.CourseDto;

public interface GMSCourseClient {

	List<CourseDto> get(String token) throws RuntimeException;

	CourseDto get(String token, Integer id) throws RuntimeException;

	CourseDto get(String token, String code) throws RuntimeException;

	CourseDto getByName(String token, String name) throws RuntimeException;

	List<CourseDto> getByBranch(String token, Integer id) throws RuntimeException;

	List<CourseDto> getByGym(String token, Integer id) throws RuntimeException;

	CourseDto save(String token, CourseDto dto) throws RuntimeException;

	CourseDto update(String token, CourseDto dto) throws RuntimeException;

	CourseDto active(String token, Integer id) throws RuntimeException;

	CourseDto deactive(String token, Integer id) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

	String delete(String token, String code) throws RuntimeException;

}
