package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.LedgerDto;

public interface GMSLedgerClient {

	List<LedgerDto> get(String token) throws RuntimeException;

	LedgerDto get(String token, Integer id) throws RuntimeException;

	List<LedgerDto> getAcName(String token, String ac_name) throws RuntimeException;

	List<LedgerDto> getAcNo(String token, String ac_no) throws RuntimeException;

	List<LedgerDto> getByBranch(String token, Integer id) throws RuntimeException;

	List<LedgerDto> getByRange(String token, Long from_date, Long to_date) throws RuntimeException;

	List<LedgerDto> getByTrainee(String token, Integer id) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

}
