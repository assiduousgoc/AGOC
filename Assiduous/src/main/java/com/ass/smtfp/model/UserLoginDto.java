package com.ass.smtfp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.ass.smtfp.enums.ModuleType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "user_login")
public class UserLoginDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 637952432393141873L;

	@JsonProperty("user_name")
	private String userName;

	@JsonProperty("password")
	private String password;

	@JsonProperty("module")
	private ModuleType module;

	public UserLoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLoginDto(String userName, String password, ModuleType module) {
		super();
		this.userName = userName;
		this.password = password;
		this.module = module;
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

	public ModuleType getModule() {
		return module;
	}

	public void setModule(ModuleType module) {
		this.module = module;
	}

}
