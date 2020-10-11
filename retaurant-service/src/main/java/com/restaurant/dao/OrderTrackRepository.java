package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.OrderTrack;

public interface OrderTrackRepository extends CrudRepository<OrderTrack, Integer> {

	@Query("SELECT o from OrderTrack o WHERE o.id = :id")
	Optional<OrderTrack> findById(@Param("id") Integer id);

	@Query("SELECT o from OrderTrack o WHERE o.order.id = :order_id")
	List<OrderTrack> findByOrder(@Param("order_id") Integer order_id);

	@Query("SELECT o from OrderTrack o WHERE o.assignTo.id = :emp_id")
	List<OrderTrack> findByAssignTo(@Param("emp_id") Integer emp_id);

}
