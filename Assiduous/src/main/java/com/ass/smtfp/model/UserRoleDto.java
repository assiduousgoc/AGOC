package com.ass.smtfp.model;

import java.io.Serializable;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "user_role")
public class UserRoleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5192178198155024294L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("role_name")
	private String roleName;

	@JsonProperty("desc")
	private String description;

	@JsonProperty("users")
	private Set<UsersDto> user_dtos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<UsersDto> getUser_dtos() {
		return user_dtos;
	}

	public void setUser_dtos(Set<UsersDto> user_dtos) {
		this.user_dtos = user_dtos;
	}

}
