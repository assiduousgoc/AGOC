package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.LocationDto;

public interface GMSLocationClient {

	List<LocationDto> get(String token) throws RuntimeException;

	LocationDto get(String token, Integer id) throws RuntimeException;

	LocationDto get(String token, String code) throws RuntimeException;

	LocationDto getByName(String token, String name) throws RuntimeException;

	LocationDto save(String token, LocationDto dto) throws RuntimeException;

	LocationDto update(String token, LocationDto dto) throws RuntimeException;

	LocationDto active(String token, Integer id) throws RuntimeException;

	LocationDto deactive(String token, Integer id) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

	String delete(String token, String code) throws RuntimeException;

}
