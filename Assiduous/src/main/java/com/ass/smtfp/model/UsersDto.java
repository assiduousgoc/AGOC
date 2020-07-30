package com.ass.smtfp.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.ass.smtfp.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "user")
public class UsersDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1552020654672640874L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("first_name")
	@NotNull
	private String firstName;

	@JsonProperty("last_name")
	@NotNull
	private String lastName;

	@JsonProperty("email")
	@NotNull
	private String email;

	@JsonProperty("password")
	@NotNull
	private String password;

	@JsonProperty("mob")
	@NotNull
	private Long mob;

	@JsonProperty("role")
	@NotNull
	private UserRole role = UserRole.ADMIN;

	@JsonProperty("address")
	@NotNull
	private AddressDto addressDto;

	@JsonProperty("branch")
	@NotNull
	private CommonDto branchDto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getMob() {
		return mob;
	}

	public void setMob(Long mob) {
		this.mob = mob;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public AddressDto getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(AddressDto addressDto) {
		this.addressDto = addressDto;
	}

	public CommonDto getBranchDto() {
		return branchDto;
	}

	public void setBranchDto(CommonDto branchDto) {
		this.branchDto = branchDto;
	}

}
