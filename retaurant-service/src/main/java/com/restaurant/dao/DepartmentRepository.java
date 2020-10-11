package com.restaurant.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

	@Query("SELECT d from Department d WHERE d.id = :id")
	Optional<Department> findById(@Param("id") Integer id);

	@Query("SELECT d from Department d WHERE d.code = :code")
	Optional<Department> findByCode(@Param("code") String code);

}
