package com.restaurant.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class ShipToDto {

	private Integer id;

	private String shipingAddress;

	private BillingDto billing;

	public ShipToDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShipToDto(Integer id) {
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

	public BillingDto getBilling() {
		return billing;
	}

	public void setBilling(BillingDto billing) {
		this.billing = billing;
	}

}
