package com.restaurant.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class BillToDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8509411494398001777L;

	private Integer id;

	private String billingAddress;

	private BillingDto billing;

	public BillToDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillToDto(Integer id) {
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

	public BillingDto getBilling() {
		return billing;
	}

	public void setBilling(BillingDto billing) {
		this.billing = billing;
	}

}
