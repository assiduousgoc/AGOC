package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	@Query("SELECT c from Customer c WHERE c.id = :id")
	Optional<Customer> findById(@Param("id") Integer id);

	@Query("SELECT c from Customer c WHERE c.mob = :mob")
	Optional<Customer> findByMob(@Param("mob") Long mob);

	@Query("SELECT c from Customer c WHERE c.name = :name")
	List<Customer> findByName(@Param("name") String name);

}
