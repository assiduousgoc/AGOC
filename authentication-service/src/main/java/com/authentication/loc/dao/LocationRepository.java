package com.authentication.loc.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.authentication.loc.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

	@Query("SELECT l from Location l WHERE l.id = ?1")
	Optional<Location> findById(Integer id);

	@Query("SELECT l from Location l WHERE l.code = ?1")
	Optional<Location> findByCode(String code);

	@Query("SELECT l from Location l WHERE l.name = ?1")
	Optional<Location> findByName(String name);

	@Modifying
	@Query("DELETE FROM Location l WHERE l.code = ?1")
	void deleteByCode(String code);

	@Modifying
	@Query("DELETE FROM Location l WHERE l.name = ?1")
	void deleteByName(String name);

	@Modifying
	@Query("DELETE FROM Location l WHERE l.id = ?1")
	void deleteById(Integer id);
}
