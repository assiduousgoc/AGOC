package com.authentication.loc.entities;

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
@Table(name = "address")
@DynamicUpdate
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2618298746616827225L;

	private Integer id;

	private String line1;

	private String line2;

	private String pincode;

	private City city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(Integer id) {
		super();
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "line1", nullable = false, length = 200)
	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	@Column(name = "line2", length = 200)
	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	@Column(name = "pincode", nullable = false, length = 6)
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@ManyToOne
	@JoinColumn(name = "city_id", nullable = false, referencedColumnName = "id")
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
