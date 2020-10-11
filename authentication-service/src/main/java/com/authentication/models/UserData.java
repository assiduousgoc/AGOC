package com.authentication.models;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.authentication.entities.Users;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "user_data")
public class UserData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7665448895137178131L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("first_name")
	@NotNull
	@NotBlank
	private String firstName;

	@JsonProperty("last_name")
	@NotNull
	@NotBlank
	private String lastName;

	@JsonProperty("email")
	@NotNull
	@NotBlank
	private String email;

	@JsonProperty("mob")
	@NotNull
	private Long mob;

	@JsonProperty("device_id")
	private String deviceId;

	@JsonProperty("imei_no")
	private String imeiNo;

	@JsonProperty("city")
	@NotNull
	private String city;

	@JsonProperty("pincode")
	@NotNull
	private String pincode;

	@JsonProperty("token")
	@NotNull
	private String token;

	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserData(Users user, String token) {
		this(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getMob(),
				user.getAddress().getCity().getName() + "-" + user.getAddress().getCity().getCode(),
				user.getAddress().getPincode(), token);
	}

	public UserData(Integer id, @NotNull @NotBlank String firstName, @NotNull @NotBlank String lastName,
			@NotNull @NotBlank String email, @NotNull Long mob, @NotNull String city, @NotNull String pincode,
			@NotNull String token) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mob = mob;
		this.city = city;
		this.pincode = pincode;
		this.token = token;
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

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getImeiNo() {
		return imeiNo;
	}

	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
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

}
