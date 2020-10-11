package com.authentication.models;

import java.io.Serializable;
import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.authentication.enm.UserType;
import com.authentication.loc.models.AddressDto;
import com.authentication.loc.models.LocationDto;
import com.dcs.common.constant.CommonConstant;
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

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("email")
	@Validate(nullable = false, column = "email", max = 100, min = 5, message = "Invalid email.", regex = CommonConstant.RegexPatternConstant.EMAIL_REGEX)
	private String email;

	@JsonProperty("password")
	@NotNull
	@NotEmpty
	private String password;

	@JsonProperty("mob")
	@NotNull
	private Long mob;

	@JsonProperty("roles")
	private Set<CommonDto> role_dtos;

	@JsonProperty("user_modules")
	private Set<ModuleDto> modules;

	@JsonProperty("address")
	private AddressDto address_dto;

	@JsonProperty("user_location")
	private LocationDto loc_dto;

	@JsonProperty("user_type")
	private UserType userType;

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

	public Set<CommonDto> getRole_dtos() {
		return role_dtos;
	}

	public void setRole_dtos(Set<CommonDto> role_dtos) {
		this.role_dtos = role_dtos;
	}

	public Set<ModuleDto> getModules() {
		return modules;
	}

	public void setModules(Set<ModuleDto> modules) {
		this.modules = modules;
	}

	public AddressDto getAddress_dto() {
		return address_dto;
	}

	public void setAddress_dto(AddressDto address_dto) {
		this.address_dto = address_dto;
	}

	public LocationDto getLoc_dto() {
		return loc_dto;
	}

	public void setLoc_dto(LocationDto loc_dto) {
		this.loc_dto = loc_dto;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
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
