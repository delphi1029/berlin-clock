package com.ubs.opsit.interviews.time;

public class HourSecondRow {
	
	private static final int TOTAL_HOUR_LIGHTS = 4;
	
	public StringBuilder displaySecondHourRow(Integer hour) {
		int redLightsToGlowinSecondRow = getRedLightsToGlowInSecondRow(hour);
		StringBuilder hourDisplaySecondRow = new StringBuilder();
		for(int i=0; i<redLightsToGlowinSecondRow; i++) {
			hourDisplaySecondRow.append(Lamp.RED.getSign());
		}
		
		for(int j=0; j<getOffLightsInSecondRow(redLightsToGlowinSecondRow); j++) {
			hourDisplaySecondRow.append(Lamp.OFF.getSign());
		}
		return hourDisplaySecondRow;
	}

	private int getOffLightsInSecondRow(int redLightsToGlowinSecondRow) {
		return TOTAL_HOUR_LIGHTS-redLightsToGlowinSecondRow;
	}

	private int getRedLightsToGlowInSecondRow(Integer hour) {
		int redLightsToGlowinSecondRow = hour % 5;
		return redLightsToGlowinSecondRow;
	}

}
