package com.ass.smtfp.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotBlank;

import com.ass.smtfp.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "user_login")
public class UserData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7665448895137178131L;

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

	@JsonProperty("mob")
	@NotNull
	private Long mob;

	@JsonProperty("role")
	@NotNull
	private UserRole role;

	@JsonProperty("city")
	@NotNull
	private String city;

	@JsonProperty("pincode")
	@NotNull
	private String pincode;

	@JsonProperty("token")
	@NotNull
	private String token;

	@JsonProperty("branch")
	@NotNull
	private CommonDto branch;

	@JsonProperty("gym")
	@NotNull
	private CommonDto gym;

	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserData(Integer id, @NotNull @NotBlank String firstName, @NotNull @NotBlank String lastName,
			@NotNull @NotBlank String email, @NotNull Long mob, @NotNull UserRole role, @NotNull String city,
			@NotNull String pincode, @NotNull String token, CommonDto branch, CommonDto gym) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mob = mob;
		this.role = role;
		this.city = city;
		this.pincode = pincode;
		this.token = token;
		this.branch = branch;
		this.gym = gym;
	}

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public CommonDto getBranch() {
		return branch;
	}

	public void setBranch(CommonDto branch) {
		this.branch = branch;
	}

	public CommonDto getGym() {
		return gym;
	}

	public void setGym(CommonDto gym) {
		this.gym = gym;
	}

}
