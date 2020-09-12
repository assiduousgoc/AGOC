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
@XmlRootElement(name = "course_schedule")
public class CourseScheduleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5289808056352305709L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("code")
	private String code;

	@JsonProperty("from")
	@NotNull
	private String from;

	@JsonProperty("to")
	@NotNull
	private String to;

	@JsonProperty("days")
	private String days;

	@JsonProperty("description")
	private String description;

	@JsonProperty("course")
	@NotNull
	private CommonDto courseDto;

	@JsonProperty("trainer")
	@NotNull
	private CommonDto trainerDto;

	@JsonProperty("room")
	@NotNull
	private CommonDto roomDto;

	@JsonProperty("active")
	private boolean active;

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

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CommonDto getCourseDto() {
		return courseDto;
	}

	public void setCourseDto(CommonDto courseDto) {
		this.courseDto = courseDto;
	}

	public CommonDto getTrainerDto() {
		return trainerDto;
	}

	public void setTrainerDto(CommonDto trainerDto) {
		this.trainerDto = trainerDto;
	}

	public CommonDto getRoomDto() {
		return roomDto;
	}

	public void setRoomDto(CommonDto roomDto) {
		this.roomDto = roomDto;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
