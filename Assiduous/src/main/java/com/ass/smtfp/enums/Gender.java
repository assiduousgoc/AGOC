package com.ass.smtfp.enums;

public enum Gender {

	M("Male"), F("Female"), T("Transgender"), O("Other");

	String type;

	private Gender(String type) {
		this.type = type;
	}

	public String type() {
		return this.type;
	}
}
