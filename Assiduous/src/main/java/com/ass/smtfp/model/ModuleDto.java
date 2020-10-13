package com.ass.smtfp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.ass.smtfp.enums.ModuleType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "module")
public class ModuleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3801376343559232934L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("module_name")
	private ModuleType name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ModuleType getName() {
		return name;
	}

	public void setName(ModuleType name) {
		this.name = name;
	}

}
