package com.ass.smtfp.restaurant.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class PaymentDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4720490322062877687L;

	private Integer id;

	private Date payDate;

	private Float amount;

	private PaymentTypeDto payType;

	private BillingDto bill;

	private OrderDto order;

	private CustomerDto customer;

	public PaymentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentDto(Integer id) {
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

	public PaymentTypeDto getPayType() {
		return payType;
	}

	public void setPayType(PaymentTypeDto payType) {
		this.payType = payType;
	}

	public BillingDto getBill() {
		return bill;
	}

	public void setBill(BillingDto bill) {
		this.bill = bill;
	}

	public OrderDto getOrder() {
		return order;
	}

	public void setOrder(OrderDto order) {
		this.order = order;
	}

	public CustomerDto getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}

}
