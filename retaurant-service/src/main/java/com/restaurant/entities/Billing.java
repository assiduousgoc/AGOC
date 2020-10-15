package com.restaurant.entities;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "billings")
@DynamicUpdate
public class Billing implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6977637268565630496L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "amount", nullable = false)
	private Float amount;

	@Column(name = "discount")
	private Integer discount;

	@Column(name = "bill_date", nullable = false)
	private Date billDate;

	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false, referencedColumnName = "id")
	private Order order;

	public Billing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Billing(Integer id) {
		super();
		this.id = id;
	}

	public Billing(Float amount, Integer discount, Date billDate, Order order) {
		super();
		this.amount = amount;
		this.discount = discount;
		this.billDate = billDate;
		this.order = order;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
