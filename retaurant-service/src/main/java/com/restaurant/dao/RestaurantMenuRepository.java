package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.RestaurantMenu;

public interface RestaurantMenuRepository extends CrudRepository<RestaurantMenu, Integer> {

	@Query("SELECT r from RestaurantMenu r WHERE r.id = :id")
	Optional<RestaurantMenu> findById(@Param("id") Integer id);

	@Query("SELECT r from RestaurantMenu r WHERE r.restaurant.id = :res_id")
	List<RestaurantMenu> findByRestaurant(@Param("res_id") Integer res_id);

	@Query("SELECT r from RestaurantMenu r WHERE r.foodItem.id = :food_id")
	List<RestaurantMenu> findByFood(@Param("food_id") Integer food_id);

	@Query("SELECT r from RestaurantMenu r WHERE r.name = :name")
	List<RestaurantMenu> findByName(@Param("name") String name);

}
