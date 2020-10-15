package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

	@Query("SELECT o from Order o WHERE o.id = :id")
	Optional<Order> findById(@Param("id") Integer id);

	@Query("SELECT o from Order o WHERE o.orderNo = :order_no")
	Optional<Order> findByOrderNo(@Param("order_no") String order_no);

	@Query("SELECT o from Order o WHERE o.customer.id = :cust_id")
	List<Order> findByCustomer(@Param("cust_id") Integer cust_id);

}
