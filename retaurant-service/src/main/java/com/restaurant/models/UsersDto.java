package com.restaurant.models;

import java.io.Serializable;
import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.dcs.validation.annotation.Validate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "user")
public class UsersDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4351188619440407417L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("user_name")
	@Validate(column = "user_name", max = 50, min = 5, message = "Invalid username.")
	private String userName;

	@JsonProperty("password")
	@NotNull
	@NotEmpty
	private String password;

	@JsonProperty("mob")
	@NotNull
	private Long mob;

	@JsonProperty("roles")
	private Set<CommonDto> role_dtos;

	@JsonProperty("device_id")
	private String deviceId;

	@JsonProperty("imei_no")
	private String imeiNo;

	@JsonProperty("active")
	private boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public Set<CommonDto> getRole_dtos() {
		return role_dtos;
	}

	public void setRole_dtos(Set<CommonDto> role_dtos) {
		this.role_dtos = role_dtos;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
