package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.GymDto;

public interface GMSGymClient {

	List<GymDto> get(String token) throws RuntimeException;

	GymDto get(String token, Integer id) throws RuntimeException;

	GymDto get(String token, String code) throws RuntimeException;

	GymDto getByName(String token, String name) throws RuntimeException;

	GymDto getByPhone(String token, String phone) throws RuntimeException;

	GymDto getByEmail(String token, String email) throws RuntimeException;

	List<GymDto> getByLoc(String token, Integer id) throws RuntimeException;

	GymDto save(String token, GymDto dto) throws RuntimeException;

	GymDto update(String token, GymDto dto) throws RuntimeException;

	GymDto active(String token, Integer id) throws RuntimeException;

	GymDto deactive(String token, Integer id) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

	String delete(String token, String code) throws RuntimeException;

}
