package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.DrAccountDto;

public interface GMSDrAccountClient {

	List<DrAccountDto> get(String token) throws RuntimeException;

	DrAccountDto get(String token, Integer id) throws RuntimeException;

	DrAccountDto save(String token, DrAccountDto dto) throws RuntimeException;
	
	DrAccountDto getByName(String token, String name) throws RuntimeException;

	DrAccountDto update(String token, DrAccountDto dto) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;
}
