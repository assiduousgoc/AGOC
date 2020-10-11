package com.restaurant.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "departments")
@DynamicUpdate
public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5334905377212417711L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "code", nullable = false, length = 20, unique = true)
	private String code;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
