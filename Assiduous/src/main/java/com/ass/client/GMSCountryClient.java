package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.CountryDto;

public interface GMSCountryClient {

	List<CountryDto> get(String token) throws RuntimeException;

	CountryDto get(String token, Integer id) throws RuntimeException;

	CountryDto get(String token, String code) throws RuntimeException;

	CountryDto getByName(String token, String name) throws RuntimeException;

	CountryDto getByStdCode(String token, String std_code) throws RuntimeException;

	CountryDto save(String token, CountryDto dto) throws RuntimeException;

	CountryDto update(String token, CountryDto dto) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

	String delete(String token, String code) throws RuntimeException;

}
