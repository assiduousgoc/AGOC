package com.authentication.loc.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.authentication.loc.entities.City;

public interface CityRepository extends CrudRepository<City, Integer> {

	@Query("SELECT c from City c WHERE c.id = ?1")
	Optional<City> findById(Integer id);

	@Query("SELECT c from City c WHERE c.code = ?1")
	Optional<City> findByCode(String code);

	@Query("SELECT c from City c WHERE c.name = ?1")
	Optional<City> findByName(String name);

	@Query(value = "SELECT * FROM city c WHERE c.state_id = ?1", nativeQuery = true)
	List<City> findByState(Integer state_id);

	@Modifying
	@Query("DELETE FROM City c WHERE c.code = ?1")
	void deleteByCode(String code);

	@Modifying
	@Query("DELETE FROM City c WHERE c.name = ?1")
	void deleteByName(String name);

	@Modifying
	@Query("DELETE FROM City c WHERE c.id = ?1")
	void deleteById(Integer id);
}
