package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.CrAccountDto;
import com.ass.smtfp.model.GstDto;

public interface GMSGSTClient {

	List<GstDto> get(String token) throws RuntimeException;

	GstDto get(String token, Integer id) throws RuntimeException;

	GstDto save(String token, GstDto dto) throws RuntimeException;
	
	GstDto getByName(String token, String name) throws RuntimeException;

	GstDto update(String token, GstDto dto) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;
	
}