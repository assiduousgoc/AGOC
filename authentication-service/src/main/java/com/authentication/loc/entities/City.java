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
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "city", uniqueConstraints = { @UniqueConstraint(columnNames = { "code", "name" }) })
@DynamicUpdate
public class City implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8603937114894116914L;

	private Integer id;

	private String code;

	private String name;

	private State state;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(Integer id) {
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

	@ManyToOne
	@JoinColumn(name = "state_id", nullable = false, referencedColumnName = "id")
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
