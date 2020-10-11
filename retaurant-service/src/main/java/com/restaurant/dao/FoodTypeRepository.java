package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.FoodType;

public interface FoodTypeRepository extends CrudRepository<FoodType, Integer> {

	@Query("SELECT f from FoodType f WHERE f.id = :id")
	Optional<FoodType> findfyId(@Param("id") Integer id);

	@Query("SELECT f from FoodType f WHERE f.name = :name")
	List<FoodType> findByName(@Param("name") String name);

}
