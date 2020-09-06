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
@XmlRootElement(name = "branch")
public class BranchDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -931558620458480179L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("code")
	private String code;

	@JsonProperty("name")
	@NotNull
	@NotEmpty
	private String name;

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

	@JsonProperty("gym")
	@NotNull
	@NotEmpty
	private CommonDto gymDto;

	@JsonProperty("loc")
	@NotNull
	@NotEmpty
	private CommonDto locDto;

	@JsonProperty("active")
	private boolean active;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public CommonDto getGymDto() {
		return gymDto;
	}

	public void setGymDto(CommonDto gymDto) {
		this.gymDto = gymDto;
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
