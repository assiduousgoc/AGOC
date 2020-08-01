package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.StateDto;

public interface GMSStateClient {

	List<StateDto> get(String token) throws RuntimeException;

	StateDto get(String token, Integer id) throws RuntimeException;

	StateDto get(String token, String code) throws RuntimeException;

	StateDto getByName(String token, String name) throws RuntimeException;

	List<StateDto> getByCountry(String token, Integer id) throws RuntimeException;

	StateDto save(String token, StateDto dto) throws RuntimeException;

	StateDto update(String token, StateDto dto) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

	String delete(String token, String code) throws RuntimeException;

}
