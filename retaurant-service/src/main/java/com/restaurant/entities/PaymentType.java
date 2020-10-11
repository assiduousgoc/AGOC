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
@Table(name = "payment_type")
@DynamicUpdate
public class PaymentType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2668668429655095621L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Column(name = "payment_url", length = 200)
	private String url;

	@Column(name = "api_key", length = 200)
	private String key;

	@Column(name = "api_secret", length = 100)
	private String secret;

	public PaymentType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentType(Integer id) {
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

}
