package com.authentication.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.authentication.entities.UserRole;

public interface UserRoleRepository extends CrudRepository<UserRole, Integer> {

	@Query("SELECT ur from UserRole ur WHERE ur.id = :id")
	Optional<UserRole> findById(@Param("id") Integer id);

	@Query("SELECT ur from UserRole ur WHERE ur.roleName = :roleName")
	Optional<UserRole> findByRolename(@Param("roleName") String roleName);
	
	@Modifying
	@Query("DELETE FROM UserRole ur WHERE ur.id = ?1")
	void deleteById(Integer id);
}
