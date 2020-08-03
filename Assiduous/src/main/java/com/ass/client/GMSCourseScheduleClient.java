package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.CourseScheduleDto;

public interface GMSCourseScheduleClient {

	List<CourseScheduleDto> get(String token) throws RuntimeException;

	CourseScheduleDto get(String token, Integer id) throws RuntimeException;

	CourseScheduleDto get(String token, String code) throws RuntimeException;

	List<CourseScheduleDto> getByCourse(String token, Integer id) throws RuntimeException;

	List<CourseScheduleDto> getByTrainer(String token, Integer id) throws RuntimeException;

	CourseScheduleDto save(String token, CourseScheduleDto dto) throws RuntimeException;

	CourseScheduleDto update(String token, CourseScheduleDto dto) throws RuntimeException;

	CourseScheduleDto active(String token, Integer id) throws RuntimeException;

	CourseScheduleDto deactive(String token, Integer id) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

	String delete(String token, String code) throws RuntimeException;

}
