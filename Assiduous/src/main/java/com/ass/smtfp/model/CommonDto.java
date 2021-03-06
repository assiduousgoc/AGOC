package com.ass.smtfp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement
public class CommonDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6520631882020160053L;

	private Integer id;

	private String code;

	private String name;

	public CommonDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommonDto(Integer id) {
		super();
		this.id = id;
	}

	public CommonDto(Integer id, String code, String name) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
