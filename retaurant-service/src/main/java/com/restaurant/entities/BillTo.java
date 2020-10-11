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
@Table(name = "bill_to")
@DynamicUpdate
public class BillTo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8509411494398001777L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "billing_address", nullable = false, length = 200)
	private String billingAddress;

	@ManyToOne
	@JoinColumn(name = "billing_id", nullable = false, referencedColumnName = "id")
	private Billing billing;

	public BillTo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillTo(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

}
