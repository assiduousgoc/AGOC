package com.ass.smtfp.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "address")
public class AddressDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4570000813444785802L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("address_line1")
	@NotNull
	private String line1;

	@JsonProperty("address_line2")
	private String line2;

	@JsonProperty("pincode")
	@NotNull
	private String pincode;

	@JsonProperty("city")
	@NotNull
	private CommonDto cityDto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public CommonDto getCityDto() {
		return cityDto;
	}

	public void setCityDto(CommonDto cityDto) {
		this.cityDto = cityDto;
	}

}
