package com.restaurant.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class OrderStatusDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3024156240804814431L;

	private Integer id;

	private StatusDto status;

	private OrderDto order;

	public OrderStatusDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderStatusDto(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public StatusDto getStatus() {
		return status;
	}

	public void setStatus(StatusDto status) {
		this.status = status;
	}

	public OrderDto getOrder() {
		return order;
	}

	public void setOrder(OrderDto order) {
		this.order = order;
	}

}
