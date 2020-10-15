package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.OrderDetail;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Integer> {

	@Query("SELECT o from OrderDetail o WHERE o.id = :id")
	Optional<OrderDetail> findById(@Param("id") Integer id);

	@Query("SELECT o from OrderDetail o WHERE o.foodItem.id = :food_id")
	List<OrderDetail> findByFood(@Param("food_id") Integer food_id);

	@Query("SELECT o from OrderDetail o WHERE o.order.id = :order_id")
	List<OrderDetail> findByOrder(@Param("order_id") Integer order_id);

	@Query("SELECT o from OrderDetail o WHERE o.order.orderNo = :order_no")
	List<OrderDetail> findByOrder(@Param("order_no") String order_no);

	@Query("SELECT o from OrderDetail o WHERE o.restaurant.id = :res_id")
	List<OrderDetail> findByRestaurant(@Param("res_id") Integer res_id);
}
