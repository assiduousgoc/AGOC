package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Chef;

public interface ChefRepository extends CrudRepository<Chef, Integer> {

	@Query("SELECT c from Chef c WHERE c.id = :id")
	Optional<Chef> findById(@Param("id") Integer id);

	@Query("SELECT c from Chef c WHERE c.name = :name")
	List<Chef> findByName(@Param("name") String name);

	@Query("SELECT c from Chef c WHERE c.restaurant.id = :res_id")
	List<Chef> findByRestaurant(@Param("res_id") String res_id);

}
