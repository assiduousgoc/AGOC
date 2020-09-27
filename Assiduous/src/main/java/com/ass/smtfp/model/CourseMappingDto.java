package com.ass.smtfp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "course_mapping")
public class CourseMappingDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3127340486152950738L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("course")
	private CommonDto courseDto;

	@JsonProperty("branch")
	private CommonDto branchDto;

	@JsonProperty("price")
	private Double price;

	@JsonProperty("duration")
	private String duration;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CommonDto getCourseDto() {
		return courseDto;
	}

	public void setCourseDto(CommonDto courseDto) {
		this.courseDto = courseDto;
	}

	public CommonDto getBranchDto() {
		return branchDto;
	}

	public void setBranchDto(CommonDto branchDto) {
		this.branchDto = branchDto;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
