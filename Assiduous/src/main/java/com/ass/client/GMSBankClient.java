package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.BankDto;

public interface GMSBankClient {

	List<BankDto> get(String token) throws RuntimeException;

	BankDto get(String token, Integer id) throws RuntimeException;

	BankDto get(String token, String code) throws RuntimeException;

	BankDto getByName(String token, String name) throws RuntimeException;

	BankDto save(String token, BankDto dto) throws RuntimeException;

	BankDto update(String token, BankDto dto) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

	String delete(String token, String code) throws RuntimeException;
	
	BankDto active(String token, Integer id) throws RuntimeException;

	BankDto deactive(String token, Integer id) throws RuntimeException;

}
