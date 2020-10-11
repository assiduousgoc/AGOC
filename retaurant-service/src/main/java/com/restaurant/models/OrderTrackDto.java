package com.restaurant.models;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class OrderTrackDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6595685729416889663L;

	private Integer id;

	private Date estimatedTime;

	private OrderDto order;

	private EmployeeDto assignTo;

	public OrderTrackDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderTrackDto(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(Date estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public OrderDto getOrder() {
		return order;
	}

	public void setOrder(OrderDto order) {
		this.order = order;
	}

	public EmployeeDto getAssignTo() {
		return assignTo;
	}

	public void setAssignTo(EmployeeDto assignTo) {
		this.assignTo = assignTo;
	}

}
