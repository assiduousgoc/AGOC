package com.ass.client;

import java.io.File;
import java.util.List;

import com.ass.smtfp.model.DueDto;
import com.ass.smtfp.model.TraineeDto;

public interface GMSTraineeClient {

	List<TraineeDto> get(String token) throws RuntimeException;

	TraineeDto get(String token, Integer id) throws RuntimeException;

	TraineeDto getByMob(String token, Long mob) throws RuntimeException;

	TraineeDto getEmail(String token, String email) throws RuntimeException;

	List<TraineeDto> getFirstName(String token, String f_name) throws RuntimeException;

	List<TraineeDto> getLastName(String token, String l_name) throws RuntimeException;

	List<TraineeDto> getByGym(String token, Integer id) throws RuntimeException;

	List<TraineeDto> getByBranch(String token, Integer id) throws RuntimeException;

	List<TraineeDto> getByTrainer(String token, Integer id) throws RuntimeException;

	List<DueDto> getDues(String token) throws RuntimeException;

	DueDto getDue(String token, Integer id) throws RuntimeException;

	TraineeDto upload(String token, Integer trainee_id, File file) throws RuntimeException;

	TraineeDto save(String token, TraineeDto dto) throws RuntimeException;

	TraineeDto update(String token, TraineeDto dto) throws RuntimeException;

	TraineeDto active(String token, Integer id) throws RuntimeException;

	TraineeDto deactive(String token, Integer id) throws RuntimeException;

	String delete(String token, Integer id) throws RuntimeException;

}
