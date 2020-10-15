package com.restaurant.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.restaurant.enm.PayType;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class CustomerOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6727192228135229600L;

	private List<CustomerOrderDetail> order;

	private Integer billTo;

	private Integer shipTo;

	private PayType payType;

	public List<CustomerOrderDetail> getOrder() {
		return order;
	}

	public void setOrder(List<CustomerOrderDetail> order) {
		this.order = order;
	}

	public Integer getBillTo() {
		return billTo;
	}

	public void setBillTo(Integer billTo) {
		this.billTo = billTo;
	}

	public Integer getShipTo() {
		return shipTo;
	}

	public void setShipTo(Integer shipTo) {
		this.shipTo = shipTo;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}

}
