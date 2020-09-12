package com.ass.smtfp.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

import com.ass.smtfp.model.AddressDto;
/*import com.dcs.common.constant.CommonConstant;
import com.dcs.validation.annotation.Validate;*/
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "bank")
public class BankDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5643183807201284477L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("bank_name")
	@NotNull(message = "bank_name cannot be null")
	@NotEmpty(message = "bank_name cannot be emplty")
	private String bankName;

	@JsonProperty("branch_name")
	@NotNull(message = "branch_name cannot be null")
	@NotEmpty(message = "branch_name cannot be emplty")
	private String branchName;

	@JsonProperty("ac_no")
	@NotNull(message = "ac_no cannot be null")
	@NotEmpty(message = "ac_no cannot be emplty")
	private String accountNo;

	@JsonProperty("ifsc_code")
	@NotNull(message = "ifsc_code cannot be null")
	@NotEmpty(message = "ifsc_code cannot be emplty")
	private String ifscCode;

	@JsonProperty("ac_type")
	@NotNull(message = "ac_type cannot be null")
	@NotEmpty(message = "ac_type cannot be emplty")
	private String accountType;

	@JsonProperty("pan_no")
	//@Validate(regex = CommonConstant.RegexPatternConstant.PAN_REGEX)
	private String panNo;

	@JsonProperty("tn_no")
	//@Validate(regex = CommonConstant.RegexPatternConstant.TAN_REGEX)
	private String tanNo;

	@JsonProperty("address")
	private AddressDto addressDto;

	@JsonProperty("gym")
	private CommonDto gymDto;

	@JsonProperty("active")
	private boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getTanNo() {
		return tanNo;
	}

	public void setTanNo(String tanNo) {
		this.tanNo = tanNo;
	}

	public AddressDto getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(AddressDto addressDto) {
		this.addressDto = addressDto;
	}

	public CommonDto getGymDto() {
		return gymDto;
	}

	public void setGymDto(CommonDto gymDto) {
		this.gymDto = gymDto;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
