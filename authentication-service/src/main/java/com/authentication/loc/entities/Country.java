package com.authentication.loc.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "country", uniqueConstraints = { @UniqueConstraint(columnNames = { "code", "name", "std_code" }) })
@DynamicUpdate
public class Country implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8983270120567743832L;

	private Integer id;

	private String code;

	private String name;

	private String stdCode;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(Integer id) {
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

	@Column(name = "code", nullable = false, length = 5)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "name", nullable = false, length = 50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "std_code", nullable = false, length = 10)
	public String getStdCode() {
		return stdCode;
	}

	public void setStdCode(String stdCode) {
		this.stdCode = stdCode;
	}

}
