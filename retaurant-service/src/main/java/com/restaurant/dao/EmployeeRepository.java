package com.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	@Query("SELECT e from Employee e WHERE e.id = :id")
	Optional<Employee> findById(@Param("id") Integer id);

	@Query("SELECT e from Employee e WHERE e.mob = :mob")
	Optional<Employee> findByMob(@Param("mob") Long mob);

	@Query("SELECT e from Employee e WHERE e.email = :email")
	Optional<Employee> findByEmail(@Param("email") String email);

	@Query("SELECT e from Employee e WHERE e.dept.id = :dept_id")
	List<Employee> findByDept(@Param("dept_id") Integer dept_id);

}
