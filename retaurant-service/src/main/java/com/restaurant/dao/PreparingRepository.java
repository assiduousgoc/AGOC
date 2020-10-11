package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Preparing;

public interface PreparingRepository extends CrudRepository<Preparing, Integer> {

	@Query("SELECT p from Preparing p WHERE p.id = :id")
	Optional<Preparing> findById(@Param("id") Integer id);

	@Query("SELECT p from Preparing p WHERE p.foodItem.id = :food_id")
	List<Preparing> findByFood(@Param("food_id") Integer food_id);

	@Query("SELECT p from Preparing p WHERE p.chef.id = :chef_id")
	List<Preparing> findByChef(@Param("chef_id") Integer chef_id);

}
