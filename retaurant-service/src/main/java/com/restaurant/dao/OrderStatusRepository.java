package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.OrderStatus;

public interface OrderStatusRepository extends CrudRepository<OrderStatus, Integer> {

	@Query("SELECT o from OrderStatus o WHERE o.id = :id")
	Optional<OrderStatus> findById(@Param("id") Integer id);

	@Query("SELECT o from OrderStatus o WHERE o.order.id = :order_id")
	List<OrderStatus> findByOrder(@Param("order_id") Integer order_id);

	@Query("SELECT o from OrderStatus o WHERE o.status.id = :status_id")
	List<OrderStatus> findByStatus(@Param("status_id") Integer status_id);

}
