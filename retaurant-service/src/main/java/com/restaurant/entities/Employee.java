package com.restaurant.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "employees")
@DynamicUpdate
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4866679843094490167L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "address_1", nullable = false, length = 100)
	private String address1;

	@Column(name = "address_2", nullable = false, length = 100)
	private String address2;

	@Column(name = "mob", length = 10, unique = true)
	private Long mob;

	@Column(name = "email", length = 50, unique = true)
	private String email;

	@ManyToOne
	@JoinColumn(name = "dept_id", nullable = false, referencedColumnName = "id")
	private Department dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Long getMob() {
		return mob;
	}

	public void setMob(Long mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

}
