package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.BillTo;

public interface BillToRepository extends CrudRepository<BillTo, Integer> {

	@Query("SELECT b from BillTo b WHERE b.id = :id")
	Optional<BillTo> findById(@Param("id") Integer id);

	@Query("SELECT b from BillTo b WHERE b.billing.id = :billing_id")
	List<BillTo> findByBilling(@Param("billing_id") Integer billing_id);

	@Query("SELECT b from BillTo b WHERE b.billing.order.orderNo = :order_no")
	List<BillTo> findByOrderNo(@Param("order_no") String order_no);

}
