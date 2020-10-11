package com.authentication.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.DynamicUpdate;

import com.authentication.enm.ModuleType;

@Entity
@Table(name = "modules", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" }) })
@DynamicUpdate
public class Module implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 733917292698060417L;

	private Integer id;

	private ModuleType name;

	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Module(Integer id) {
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

	@Enumerated(EnumType.STRING)
	@Column(name = "name", nullable = false)
	public ModuleType getName() {
		return name;
	}

	public void setName(ModuleType name) {
		this.name = name;
	}

}
