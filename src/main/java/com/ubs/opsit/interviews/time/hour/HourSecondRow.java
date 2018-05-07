package com.ubs.opsit.interviews.time.hour;


public class HourSecondRow extends HourRow {
	

	public int getNumberOfOnLights(Integer hour) {
		int redLightsToGlowinSecondRow = hour % 5;
		return redLightsToGlowinSecondRow;
	}
}
