package com.xworkz.passport.constants;

public enum PassportPersonnelType {
	Regular("R"),Diplomatic("D");
	private String value;
	private PassportPersonnelType(String value) {
		this.value=value;
	}
	private String getPassportPersonnelType() {
		return value;
	}

}
