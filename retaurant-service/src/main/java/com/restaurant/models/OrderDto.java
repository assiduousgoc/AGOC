package com.restaurant.models;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.restaurant.enm.OrderStatusType;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class OrderDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5872550036164304927L;

	private Integer id;

	private String orderNo;

	private Date orderDate;

	private OrderStatusType status;

	private CustomerDto customer;

	public OrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDto(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public OrderStatusType getStatus() {
		return status;
	}

	public void setStatus(OrderStatusType status) {
		this.status = status;
	}

	public CustomerDto getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}

}
