package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Discount;

public interface DiscountRepository extends CrudRepository<Discount, Integer> {

	@Query("SELECT d from Discount d WHERE d.id = :id")
	Optional<Discount> findById(@Param("id") Integer id);

	@Query("SELECT d from Discount d WHERE d.foodItem.id = :food_id")
	List<Discount> findByFood(@Param("food_id") Integer food_id);

}
