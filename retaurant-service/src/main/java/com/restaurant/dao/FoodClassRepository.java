package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.FoodClass;

public interface FoodClassRepository extends CrudRepository<FoodClass, Integer> {

	@Query("SELECT f from FoodClass f WHERE f.id = :id")
	Optional<FoodClass> findById(@Param("id") Integer id);

	@Query("SELECT f from FoodClass f WHERE f.name = :name")
	List<FoodClass> findByName(@Param("name") String name);

}
