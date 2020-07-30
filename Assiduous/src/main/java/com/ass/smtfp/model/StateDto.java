package com.ass.smtfp.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "state")
public class StateDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9143785821962969516L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("code")
	@NotNull
	private String code;

	@JsonProperty("name")
	@NotNull
	private String name;

	@JsonProperty("country")
	@NotNull
	private CommonDto countryDto;

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

	public CommonDto getCountryDto() {
		return countryDto;
	}

	public void setCountryDto(CommonDto countryDto) {
		this.countryDto = countryDto;
	}

}
