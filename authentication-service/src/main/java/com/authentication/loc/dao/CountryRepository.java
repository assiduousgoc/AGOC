package com.authentication.loc.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.authentication.loc.entities.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {

	@Query("SELECT c from Country c WHERE c.id = ?1")
	Optional<Country> findById(Integer id);

	@Query("SELECT c from Country c WHERE c.code = ?1")
	Optional<Country> findByCode(String code);

	@Query("SELECT c from Country c WHERE c.name = ?1")
	Optional<Country> findByName(String name);

	@Query("SELECT c from Country c WHERE c.stdCode = ?1")
	Optional<Country> findByStdCode(String stdCode);

	@Modifying
	@Query("DELETE FROM Country c WHERE c.code = ?1")
	void deleteByCode(String code);

	@Modifying
	@Query("DELETE FROM Country c WHERE c.name = ?1")
	void deleteByName(String name);

	@Modifying
	@Query("DELETE FROM Country c WHERE c.stdCode = ?1")
	void deleteByStdCode(String stdCode);

	@Modifying
	@Query("DELETE FROM Country c WHERE c.id = ?1")
	void deleteById(Integer id);
}
