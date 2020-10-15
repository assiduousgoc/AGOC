package com.restaurant.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Tax;

public interface TaxRepository extends CrudRepository<Tax, Integer> {

	@Query("SELECT t from Tax t WHERE t.name = :name")
	List<Tax> findByName(@Param("name") String name);

}
