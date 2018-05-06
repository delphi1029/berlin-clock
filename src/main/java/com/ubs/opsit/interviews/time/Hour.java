package com.ubs.opsit.interviews.time;

public class Hour {
	
	private static final int TOTAL_HOUR_LIGHTS = 4;
	private String hourStr;
	
	public void setHour(String hour) {
		this.hourStr = hour;
	}
	
	public StringBuilder display() {
		Integer hour = Integer.parseInt(this.hourStr);
		StringBuilder hourDisplay = new StringBuilder();
		
		hourDisplay.append(displayFirstHourRow(hour));
		hourDisplay.append(newLine());
		hourDisplay.append(displaySecondHourRow(hour));
		hourDisplay.append(newLine());
		return hourDisplay;
		
	}

	private String newLine() {
		return "\n";
	}

	private StringBuilder displaySecondHourRow(Integer hour) {
		int redLightsToGlowinSecondRow = hour % 5;
		StringBuilder hourDisplaySecondRow = new StringBuilder();
		for(int i=0; i<redLightsToGlowinSecondRow; i++) {
			hourDisplaySecondRow.append(Lamp.RED.getSign());
		}
		
		for(int j=0; j<(TOTAL_HOUR_LIGHTS-redLightsToGlowinSecondRow); j++) {
			hourDisplaySecondRow.append(Lamp.OFF.getSign());
		}
		return hourDisplaySecondRow;
	}

	private StringBuilder displayFirstHourRow(Integer hour) {
		int redLightsToGlowinFirstRow = hour / 5;
		StringBuilder hourDisplayFirstRow = new StringBuilder();
		for(int i=0; i<redLightsToGlowinFirstRow; i++) {
			hourDisplayFirstRow.append(Lamp.RED.getSign());
		}
		for(int j=0; j<(TOTAL_HOUR_LIGHTS-redLightsToGlowinFirstRow); j++) {
			hourDisplayFirstRow.append(Lamp.OFF.getSign());
		}
		return hourDisplayFirstRow;
	}

}
