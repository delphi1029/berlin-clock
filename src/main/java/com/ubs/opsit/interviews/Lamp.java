package com.ubs.opsit.interviews;

public enum Lamp {
	
	YELLOW("Y"),
	RED("R"),
	OFF("O");
	
	private String sign;

	private Lamp(String sign) {
		this.sign = sign;
	}
	
	public String getSign() {
		return sign;
	}

}
