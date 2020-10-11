package com.authentication.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.authentication.enm.ModuleType;
import com.authentication.entities.Module;

public interface ModuleRepository extends CrudRepository<Module, Integer> {

	@Query("SELECT m from Module m WHERE m.id = :id")
	Optional<Module> findById(@Param("id") Integer id);

	@Query("SELECT m from Module m WHERE m.name = :name")
	Optional<Module> findByName(@Param("name") ModuleType name);

}
