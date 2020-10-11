package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Status;

public interface StatusRepository extends CrudRepository<Status, Integer> {

	@Query("SELECT s from Status s WHERE s.id = :id")
	Optional<Status> findById(@Param("id") Integer id);

	@Query("SELECT s from Status s WHERE s.name = :name")
	List<Status> findByName(@Param("name") String name);

}
