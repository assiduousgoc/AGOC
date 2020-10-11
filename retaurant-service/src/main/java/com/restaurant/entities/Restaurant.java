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
@Table(name = "restaurants")
@DynamicUpdate
public class Restaurant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -647093129224162348L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "address", nullable = false, length = 200)
	private String address;

	@Column(name = "phone", length = 15, unique = true)
	private String phone;

	@Column(name = "mob", nullable = false, length = 10, unique = true)
	private Long mobile;

	@Column(name = "email", length = 100, unique = true)
	private String email;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(Integer id) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
