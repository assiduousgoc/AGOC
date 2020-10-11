package com.authentication.loc.models;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.authentication.models.CommonDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "city")
public class CityDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4842162580923571971L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("code")
	@NotNull
	@NotEmpty
	private String code;

	@JsonProperty("name")
	@NotNull
	@NotEmpty
	private String name;

	@JsonProperty("state")
	@NotNull
	private CommonDto stateDto;

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

	public CommonDto getStateDto() {
		return stateDto;
	}

	public void setStateDto(CommonDto stateDto) {
		this.stateDto = stateDto;
	}

}
