package com.restaurant.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.restaurant.enm.TaxApplicationType;

@Entity
@Table(name = "taxes")
@DynamicUpdate
public class Tax implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8246908144297947702L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Enumerated(EnumType.STRING)
	@Column(name = "application_type", nullable = false, length = 50)
	private TaxApplicationType applicationType;

	@Column(name = "value", nullable = false, length = 50)
	private Float value;

	public Tax() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tax(Integer id) {
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

	public TaxApplicationType getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(TaxApplicationType applicationType) {
		this.applicationType = applicationType;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

}
