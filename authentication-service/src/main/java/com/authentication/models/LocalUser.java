package com.authentication.models;

import java.util.Collection;

public class LocalUser {

	private Collection<?> roles;

	private Integer user_id;

	public LocalUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalUser(Collection<?> roles, Integer user_id) {
		super();
		this.roles = roles;
		this.user_id = user_id;
	}

	public Collection<?> getRoles() {
		return roles;
	}

	public void setRoles(Collection<?> roles) {
		this.roles = roles;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

}
