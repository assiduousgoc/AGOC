package com.assiduous.gym.model;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.assiduous.gym.loc.model.AddressDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "gym")
public class GymDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3056505618783852286L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("code")
	private String code;

	@JsonProperty("name")
	@NotNull
	@NotEmpty
	private String name;

	@JsonProperty("licence")
	@NotNull
	@NotEmpty
	private String licence;

	@JsonProperty("email")
	@NotNull
	@NotEmpty
	@Email
	private String email;

	@JsonProperty("phone")
	@NotNull
	@NotEmpty
	private String phone;

	@JsonProperty("address")
	@NotNull
	@NotEmpty
	private AddressDto addressDto;

	@JsonProperty("loc")
	private CommonDto locDto;

	@JsonProperty("active")
	private boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public AddressDto getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(AddressDto addressDto) {
		this.addressDto = addressDto;
	}

	public CommonDto getLocDto() {
		return locDto;
	}

	public void setLocDto(CommonDto locDto) {
		this.locDto = locDto;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
