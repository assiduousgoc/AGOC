package com.restaurant.models;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class BillingDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6977637268565630496L;

	private Integer id;

	private Float amount;

	private Float discount;

	private Date billDate;

	private OrderDto order;

	public BillingDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillingDto(Integer id) {
		super();
		this.id = id;
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

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public OrderDto getOrder() {
		return order;
	}

	public void setOrder(OrderDto order) {
		this.order = order;
	}

}
