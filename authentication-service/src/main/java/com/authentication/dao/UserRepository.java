package com.authentication.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.authentication.entities.Users;

public interface UserRepository extends CrudRepository<Users, Integer> {

	@Query("SELECT u from Users u WHERE u.id = :id")
	Optional<Users> findById(@Param("id") Integer id);

	@Query("SELECT u from Users u WHERE u.userName = :user_name")
	Optional<Users> findByUsername(@Param("user_name") String user_name);

	@Query("SELECT u from Users u WHERE u.email = :email")
	Optional<Users> findByEmail(@Param("email") String email);

	@Query("SELECT u from Users u WHERE u.mob = :mob")
	Optional<Users> findByMob(@Param("mob") Long mob);

	@Modifying
	@Query("DELETE FROM Users u WHERE u.id = ?1")
	void deleteById(Integer id);
}
