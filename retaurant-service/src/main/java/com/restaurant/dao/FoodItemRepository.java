package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.FoodItem;

public interface FoodItemRepository extends CrudRepository<FoodItem, Integer> {

	@Query("SELECT f from FoodItem f WHERE f.id = :id")
	Optional<FoodItem> findById(@Param("id") Integer id);

	@Query("SELECT f from FoodItem f WHERE f.foodType.id = :type_id")
	List<FoodItem> findByFoodType(@Param("type_id") Integer type_id);

}
