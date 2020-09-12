package com.ass.smtfp.model;

import java.io.Serializable;


import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "cr_ac")
public class CrAccountDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5629209644940265138L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("ac_name")
	@NotNull(message = "ac_name cannot be null")
	@NotEmpty(message = "ac_name cannot be null")
	private String acName;

	@JsonProperty("email")
	private String email;

	@JsonProperty("mob")
	private Long mob;

	@JsonProperty("desc")
	private String description;

	@JsonProperty("active")
	private boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
