package com.ass.smtfp.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.ass.client.config.DateDSerializer;
import com.ass.smtfp.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "ledger")
public class LedgerDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1726623968924010533L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("invoice_no")
	private String invoiceNo;

	@JsonProperty("cr_ac")
	private CommonDto crAc;

	@JsonProperty("dr_ac")
	private CommonDto drAc;

	@JsonProperty("back")
	private CommonDto bankDto;

	@JsonProperty("txn_type")
	private TransactionType type;

	@JsonProperty("amount")
	private Double amount;

	@JsonProperty("narration")
	private String narration;

	@JsonProperty("txn_date")
	@JsonDeserialize(using = DateDSerializer.class)
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

	public CommonDto getCrAc() {
		return crAc;
	}

	public void setCrAc(CommonDto crAc) {
		this.crAc = crAc;
	}

	public CommonDto getDrAc() {
		return drAc;
	}

	public void setDrAc(CommonDto drAc) {
		this.drAc = drAc;
	}

	public CommonDto getBankDto() {
		return bankDto;
	}

	public void setBankDto(CommonDto bankDto) {
		this.bankDto = bankDto;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
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
