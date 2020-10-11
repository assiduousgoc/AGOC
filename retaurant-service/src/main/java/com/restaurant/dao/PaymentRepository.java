package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

	@Query("SELECT p from Payment p WHERE p.id = :id")
	Optional<Payment> findById(@Param("id") Integer id);

	@Query("SELECT p from Payment p WHERE p.order.id = :order_id")
	List<Payment> findByOrder(@Param("order_id") Integer order_id);

	@Query("SELECT p from Payment p WHERE p.bill.id = :bill_id")
	List<Payment> findByBilling(@Param("bill_id") Integer bill_id);

	@Query("SELECT p from Payment p WHERE p.customer.id = :cust_id")
	List<Payment> findByCustomer(@Param("cust_id") Integer cust_id);

}
