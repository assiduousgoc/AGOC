package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.PaymentType;

public interface PaymentTypeRepository extends CrudRepository<PaymentType, Integer> {

	@Query("SELECT p from PaymentType p WHERE p.id = :id")
	Optional<PaymentType> findById(@Param("id") Integer id);

	@Query("SELECT p from PaymentType p WHERE p.name = :name")
	List<PaymentType> findByName(@Param("name") String name);

}
