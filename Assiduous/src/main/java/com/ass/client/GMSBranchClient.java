package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.BranchDto;

public interface GMSBranchClient {

	List<BranchDto> get(String token) throws RuntimeException;

	BranchDto get(String token, Integer id) throws RuntimeException;

	BranchDto get(String token, String code) throws RuntimeException;

	BranchDto getByName(String token, String name) throws RuntimeException;

	BranchDto getByEmail(String token, String email) throws RuntimeException;

	List<BranchDto> getByLoc(String token, Integer id) throws RuntimeException;

	BranchDto save(String token, BranchDto dto) throws RuntimeException;

	BranchDto update(String token, BranchDto dto) throws RuntimeException;

	BranchDto active(String token, Integer id) throws RuntimeException;

	BranchDto deactive(String token, Integer id) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

	String delete(String token, String code) throws RuntimeException;

}
