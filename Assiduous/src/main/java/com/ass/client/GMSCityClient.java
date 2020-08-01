package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.CityDto;

public interface GMSCityClient {

	List<CityDto> get(String token) throws RuntimeException;

	CityDto get(String token, Integer id) throws RuntimeException;

	CityDto get(String token, String code) throws RuntimeException;

	CityDto getByName(String token, String name) throws RuntimeException;

	List<CityDto> getByState(String token, Integer id) throws RuntimeException;

	CityDto save(String token, CityDto dto) throws RuntimeException;

	CityDto update(String token, CityDto dto) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

	String delete(String token, String code) throws RuntimeException;

}
