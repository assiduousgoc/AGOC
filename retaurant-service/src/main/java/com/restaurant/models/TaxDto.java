package com.restaurant.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.restaurant.enm.TaxApplicationType;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class TaxDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4383980508710076876L;

	private Integer id;

	private String name;

	private TaxApplicationType applicationType;

	private Float value;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TaxApplicationType getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(TaxApplicationType applicationType) {
		this.applicationType = applicationType;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

}
