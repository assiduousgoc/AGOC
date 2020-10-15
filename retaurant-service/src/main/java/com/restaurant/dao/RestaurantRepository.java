package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

	@Query("SELECT r from Restaurant r WHERE r.id = :id")
	Optional<Restaurant> findById(@Param("id") Integer id);

	@Query("SELECT r from Restaurant r WHERE r.phone = :phone")
	Optional<Restaurant> findByPhone(@Param("phone") String phone);

	@Query("SELECT r from Restaurant r WHERE r.mobile = :mob")
	Optional<Restaurant> findByMob(@Param("mob") Long mob);

	@Query("SELECT r from Restaurant r WHERE r.email = :email")
	Optional<Restaurant> findByEmail(@Param("email") String email);

	@Query("SELECT r from Restaurant r WHERE r.name = :name")
	List<Restaurant> findByName(@Param("name") String name);

	@Query("SELECT r from Restaurant r WHERE r.address like %:pincode%")
	List<Restaurant> findByPincode(@Param("pincode") String pincode);

}
