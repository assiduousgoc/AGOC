package com.authentication.loc.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.authentication.loc.entities.State;

public interface StateRepository extends CrudRepository<State, Integer> {

	@Query("SELECT s from State s WHERE s.id = ?1")
	Optional<State> findById(Integer id);

	@Query("SELECT s from State s WHERE s.code = ?1")
	Optional<State> findByCode(String code);

	@Query("SELECT s from State s WHERE s.name = ?1")
	Optional<State> findByName(String name);

	@Query(value = "SELECT * FROM state s WHERE s.country_id = ?1", nativeQuery = true)
	List<State> findByCountry(Integer country_id);

	@Modifying
	@Query("DELETE FROM State s WHERE s.code = ?1")
	void deleteByCode(String code);

	@Modifying
	@Query("DELETE FROM State s WHERE s.name = ?1")
	void deleteByName(String name);

	@Modifying
	@Query("DELETE FROM State s WHERE s.id = ?1")
	void deleteById(Integer id);
}
