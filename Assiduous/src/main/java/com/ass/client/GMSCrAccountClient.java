package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.CrAccountDto;

public interface GMSCrAccountClient {

	List<CrAccountDto> get(String token) throws RuntimeException;

	CrAccountDto get(String token, Integer id) throws RuntimeException;

	CrAccountDto save(String token, CrAccountDto dto) throws RuntimeException;
	
	CrAccountDto getByName(String token, String name) throws RuntimeException;

	CrAccountDto update(String token, CrAccountDto dto) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;
	
}