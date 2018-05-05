package com.ubs.opsit.interviews;

public class Second {

	private String secondStr;

	public void setSecond(String second) {
		this.secondStr = second;
	}
	
	public StringBuilder display() {
		
		StringBuilder secondDisplay = new StringBuilder();
		Integer second = Integer.valueOf(secondStr);
		
		boolean secondsLightToGlow = second % 2 == 0 ?true:false;
		
		if(secondsLightToGlow)
			secondDisplay.append(Lamp.YELLOW);
		else
			secondDisplay.append(Lamp.OFF);
		
		secondDisplay.append("\n");
		
		return secondDisplay;
		
	}
}
