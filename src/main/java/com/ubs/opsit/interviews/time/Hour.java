package com.ubs.opsit.interviews.time;

public class Hour {
	
	private static final int TOTAL_HOUR_LIGHTS = 4;
	private String hour;
	
	public void setHour(String hour) {
		this.hour = hour;
	}
	
	public StringBuilder display() {
		Integer hour = Integer.parseInt(this.hour);
		
		StringBuilder hourDisplay = new StringBuilder();
		
		int redLightsToGlowinFirstRow = hour / 5;
		int redLightsToGlowinSecondRow = hour % 5;
		
		for(int i=0; i<redLightsToGlowinFirstRow; i++) {
			hourDisplay.append(Lamp.RED.getSign());
		}
		
		for(int j=0; j<(TOTAL_HOUR_LIGHTS-redLightsToGlowinFirstRow); j++) {
			hourDisplay.append(Lamp.OFF.getSign());
		}
		
		hourDisplay.append("\n");
		
		for(int i=0; i<redLightsToGlowinSecondRow; i++) {
			hourDisplay.append(Lamp.RED.getSign());
		}
		
		for(int j=0; j<(TOTAL_HOUR_LIGHTS-redLightsToGlowinSecondRow); j++) {
			hourDisplay.append(Lamp.OFF.getSign());
		}
		
		hourDisplay.append("\n");
		
		
	
		
		return hourDisplay;
		
	}

}
