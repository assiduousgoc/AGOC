package com.ass.smtfp.enums;

public enum SubscriptionType {

	M("Monthy"), QTR("Quaterly"), HY("Half Yearly"), YR("Yearly");

	String type;

	private SubscriptionType(String type) {
		this.type = type;
	}

	public String type() {
		return this.type;
	}
}
