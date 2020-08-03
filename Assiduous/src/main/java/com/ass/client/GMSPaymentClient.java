package com.ass.client;

import java.util.List;

import com.ass.smtfp.model.LedgerDto;
import com.ass.smtfp.model.PayDto;
import com.ass.smtfp.model.PaymentDto;

public interface GMSPaymentClient {

	List<PaymentDto> get(String token) throws RuntimeException;

	PaymentDto get(String token, Integer id) throws RuntimeException;

	List<PaymentDto> getByBranch(String token, Integer id) throws RuntimeException;

	List<PaymentDto> getByRange(String token, Long from_date, Long to_date) throws RuntimeException;

	List<PaymentDto> getByDue(String token, Long from_date, Long to_date) throws RuntimeException;

	List<PaymentDto> getByTrainee(String token, Integer id) throws RuntimeException;

	LedgerDto pay(String token, PayDto dto) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

}
