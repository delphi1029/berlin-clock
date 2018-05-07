package com.ubs.opsit.interviews.time.hour;


public class HourSecondRow extends HourRow {
	
	

	public int getNumberOfOffLights(int redLightsToGlowinSecondRow) {
		return TOTAL_HOUR_LIGHTS-redLightsToGlowinSecondRow;
	}

	public int getNumberOfOnLights(Integer hour) {
		int redLightsToGlowinSecondRow = hour % 5;
		return redLightsToGlowinSecondRow;
	}
}
