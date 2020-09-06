package com.assiduous.gym.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.assiduous.gym.enm.SubscriptionType;
import com.dcs.validation.json.DateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "dues")
public class DueDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4112450679232346092L;

	@JsonProperty("trainee")
	private CommonDto trainee;

	@JsonProperty("trainer")
	private List<CommonDto> trainer;

	@JsonProperty("email")
	private String email;

	@JsonProperty("mob")
	private Long mob;

	@JsonProperty("payment")
	private Double payment;

	@JsonProperty("discount")
	private Double discount;

	@JsonProperty("due_date")
	@JsonSerialize(using = DateSerializer.class)
	private Date dueDate;

	@JsonProperty("total_pay")
	private Double totalPay;

	@JsonProperty("subscription_type")
	private SubscriptionType subscriptionType;

	public CommonDto getTrainee() {
		return trainee;
	}

	public void setTrainee(CommonDto trainee) {
		this.trainee = trainee;
	}

	public List<CommonDto> getTrainer() {
		return trainer;
	}

	public void setTrainer(List<CommonDto> trainer) {
		this.trainer = trainer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMob() {
		return mob;
	}

	public void setMob(Long mob) {
		this.mob = mob;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(Double totalPay) {
		this.totalPay = totalPay;
	}

	public SubscriptionType getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(SubscriptionType subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

}
