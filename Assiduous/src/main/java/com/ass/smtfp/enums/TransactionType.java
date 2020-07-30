package com.ass.smtfp.enums;

public enum TransactionType {
	DR("Debit"), CR("Credit");

	String type;

	private TransactionType(String type) {
		this.type = type;
	}

	public String type() {
		return this.type;
	}
}
