package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Menu;

public interface MenuRepository extends CrudRepository<Menu, Integer> {

	@Query("SELECT m from Menu m WHERE m.id = :id")
	Optional<Menu> findById(@Param("id") Integer id);

	@Query("SELECT m from Menu m WHERE m.foodItem.id = :food_id")
	List<Menu> findByFood(@Param("food_id") Integer food_id);

	@Query("SELECT m from Menu m WHERE m.name = :name")
	List<Menu> findByName(@Param("name") String name);

}
