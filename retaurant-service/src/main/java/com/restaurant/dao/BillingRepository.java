package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Billing;

public interface BillingRepository extends CrudRepository<Billing, Integer> {

	@Query("SELECT b from Billing b WHERE b.id = :id")
	Optional<Billing> findById(@Param("id") Integer id);

	@Query("SELECT b from Billing b WHERE b.order.id = :order_id")
	List<Billing> findByOrderId(@Param("order_id") Integer order_id);

	@Query("SELECT b from Billing b WHERE b.order.orderNo = :order_no")
	List<Billing> findByOrderNo(@Param("order_no") String order_no);

}
