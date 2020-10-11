package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.ShipTo;

public interface ShipToRepository extends CrudRepository<ShipTo, Integer> {

	@Query("SELECT s from ShipTo s WHERE s.id = :id")
	Optional<ShipTo> findById(@Param("id") Integer id);

	@Query("SELECT s from ShipTo s WHERE s.billing.id = :billing_id")
	List<ShipTo> findByBilling(@Param("billing_id") Integer billing_id);

}
