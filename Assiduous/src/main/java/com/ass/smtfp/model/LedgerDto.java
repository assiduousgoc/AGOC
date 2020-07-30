package com.ass.smtfp.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.ass.smtfp.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "ledger")	
public class LedgerDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8770714054778958098L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("invoice_no")
	private String invoiceNo;

	@JsonProperty("trainee")
	private CommonDto traineeDto;

	@JsonProperty("account_no")
	private String accountNo;

	@JsonProperty("txn_type")
	private TransactionType type;

	@JsonProperty("account_name")
	private String accountName;

	@JsonProperty("amount")
	private Double amount;

	@JsonProperty("txn_date")
	private Date txnDate;

	@JsonProperty("branch")
	private CommonDto branchDto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public CommonDto getTraineeDto() {
		return traineeDto;
	}

	public void setTraineeDto(CommonDto traineeDto) {
		this.traineeDto = traineeDto;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	public CommonDto getBranchDto() {
		return branchDto;
	}

	public void setBranchDto(CommonDto branchDto) {
		this.branchDto = branchDto;
	}

}
