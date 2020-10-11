package com.restaurant.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "ship_to")
@DynamicUpdate
public class ShipTo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "shipping_address", nullable = false, length = 200)
	private String shipingAddress;

	@OneToOne
	@JoinColumn(name = "billing_id", nullable = false, referencedColumnName = "id", unique = true)
	private Billing billing;

	public ShipTo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShipTo(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShipingAddress() {
		return shipingAddress;
	}

	public void setShipingAddress(String shipingAddress) {
		this.shipingAddress = shipingAddress;
	}

	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

}
