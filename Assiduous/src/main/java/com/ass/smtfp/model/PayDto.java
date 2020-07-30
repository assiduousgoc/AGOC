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
@XmlRootElement(name = "pay")
public class PayDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3318039885059044112L;

	@JsonProperty("trainee_id")
	@NotNull
	private Integer trainee_id;

	@JsonProperty("amount")
	@NotNull
	private Double amount;

	@JsonProperty("account_no")
	private String accountNo;

	@JsonProperty("account_name")
	private String accountName;

	public Integer getTrainee_id() {
		return trainee_id;
	}

	public void setTrainee_id(Integer trainee_id) {
		this.trainee_id = trainee_id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

}
