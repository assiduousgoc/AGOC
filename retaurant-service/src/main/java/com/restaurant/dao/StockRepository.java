package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Stock;

public interface StockRepository extends CrudRepository<Stock, Integer> {

	@Query("SELECT s from Stock s WHERE s.id = :id")
	Optional<Stock> findById(@Param("id") Integer id);

	@Query("SELECT s from Stock s WHERE s.foodItem.id = :food_id")
	List<Stock> findByFood(@Param("food_id") Integer food_id);

	@Query("SELECT s from Stock s WHERE s.restaurant.id = :res_id")
	List<Stock> findByRestaurant(@Param("res_id") Integer res_id);

	@Query("SELECT s from Stock s WHERE s.foodItem.id = :food_id AND s.available = :available")
	List<Stock> findByFood(@Param("food_id") Integer food_id, @Param("available") boolean available);

	@Query("SELECT s from Stock s WHERE s.restaurant.id = :res_id AND s.available = :available")
	List<Stock> findByRestaurant(@Param("res_id") Integer res_id, @Param("available") boolean available);

}
