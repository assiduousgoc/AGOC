package com.authentication.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class CustomerDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6600489337871981801L;

	private Integer id;

	private String name;

	private String address1;

	private String address2;

	private Long mob;

	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDto(Integer id) {
		super();
		this.id = id;
	}

	public CustomerDto(UsersDto dto) {
		this.name = dto.getFirstName() + " " + dto.getLastName();
		this.address1 = dto.getAddress_dto().getLine1();
		this.address2 = dto.getAddress_dto().getLine2();
		this.mob = dto.getMob();

	}

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

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Long getMob() {
		return mob;
	}

	public void setMob(Long mob) {
		this.mob = mob;
	}

}
