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
@Table(name = "payments")
@DynamicUpdate
public class Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4720490322062877687L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "pay_date", nullable = false)
	private Date payDate;

	@Column(name = "amount", nullable = false)
	private Float amount;

	@ManyToOne
	@JoinColumn(name = "pay_type_id", nullable = false, referencedColumnName = "id")
	private PaymentType payType;

	@ManyToOne
	@JoinColumn(name = "billing_id", nullable = false, referencedColumnName = "id")
	private Billing bill;

	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false, referencedColumnName = "id")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false, referencedColumnName = "id")
	private Customer customer;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public PaymentType getPayType() {
		return payType;
	}

	public void setPayType(PaymentType payType) {
		this.payType = payType;
	}

	public Billing getBill() {
		return bill;
	}

	public void setBill(Billing bill) {
		this.bill = bill;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
