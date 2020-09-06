package com.assiduous.gym.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "receipt")
public class TxnDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7454240836844271049L;

	@JsonProperty("trainee_id")
	private Integer trainee_id;

	@JsonProperty("amount")
	@NotNull
	private Double amount;

	@JsonProperty("bank_id")
	private Integer bank_id;

	@JsonProperty("cr_id")
	private Integer crId;

	@JsonProperty("dr_id")
	private Integer drId;

	@JsonProperty("narration")
	private String narration;

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

	public Integer getBank_id() {
		return bank_id;
	}

	public void setBank_id(Integer bank_id) {
		this.bank_id = bank_id;
	}

	public Integer getCrId() {
		return crId;
	}

	public void setCrId(Integer crId) {
		this.crId = crId;
	}

	public Integer getDrId() {
		return drId;
	}

	public void setDrId(Integer drId) {
		this.drId = drId;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

}
