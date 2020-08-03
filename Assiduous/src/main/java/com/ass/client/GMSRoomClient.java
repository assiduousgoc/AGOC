package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.RoomDto;

public interface GMSRoomClient {

	List<RoomDto> get(String token) throws RuntimeException;

	RoomDto get(String token, Integer id) throws RuntimeException;

	RoomDto get(String token, String code) throws RuntimeException;

	RoomDto getByName(String token, String name) throws RuntimeException;

	RoomDto save(String token, RoomDto dto) throws RuntimeException;

	RoomDto update(String token, RoomDto dto) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

	String delete(String token, String code) throws RuntimeException;

}
