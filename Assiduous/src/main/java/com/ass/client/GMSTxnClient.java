package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.TxnDto;

public interface GMSTxnClient {

	List<TxnDto> get(String token) throws RuntimeException;

	TxnDto get(String token, Integer id) throws RuntimeException;

	TxnDto save(String token, TxnDto dto) throws RuntimeException;
	
	TxnDto getByTrainee(String token, Integer id) throws RuntimeException;

	TxnDto update(String token, TxnDto dto) throws RuntimeException;
	
	/*LedgerDto pay(String token, TxnDto dto) throws RuntimeException;
	
	LedgerDto receive(String token,TxnDto dto) throws RuntimeException;*/

	String delete(String token, Integer id) throws RuntimeException;
	
}