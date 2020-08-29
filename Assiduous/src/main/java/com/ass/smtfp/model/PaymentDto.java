package com.ass.smtfp.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.ass.client.config.DateDSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "payment")
public class PaymentDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1512546709528010450L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("trainee")
	private CommonDto traineeDto;

	@JsonProperty("total_due")
	private Double totalDue;

	@JsonProperty("total_received")
	private Double totalReceived;

	@JsonProperty("next_due")
	private Double nextDue;

	@JsonProperty("due_date")
	@JsonDeserialize(using = DateDSerializer.class)
	private Date dueDate;

	@JsonProperty("discount")
	private Double discount;

	@JsonProperty("branch")
	private CommonDto branchDto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CommonDto getTraineeDto() {
		return traineeDto;
	}

	public void setTraineeDto(CommonDto traineeDto) {
		this.traineeDto = traineeDto;
	}

	public Double getTotalDue() {
		return totalDue;
	}

	public void setTotalDue(Double totalDue) {
		this.totalDue = totalDue;
	}

	public Double getTotalReceived() {
		return totalReceived;
	}

	public void setTotalReceived(Double totalReceived) {
		this.totalReceived = totalReceived;
	}

	public Double getNextDue() {
		return nextDue;
	}

	public void setNextDue(Double nextDue) {
		this.nextDue = nextDue;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public CommonDto getBranchDto() {
		return branchDto;
	}

	public void setBranchDto(CommonDto branchDto) {
		this.branchDto = branchDto;
	}

}
