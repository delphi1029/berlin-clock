package com.ubs.opsit.interviews.time.hour;

import com.ubs.opsit.interviews.time.Lamp;
import com.ubs.opsit.interviews.time.Row;

public abstract class HourRow implements Row {

	public static final int TOTAL_HOUR_LIGHTS = 4;


	public StringBuilder display(Integer hour) {
		int redLightsToGlowinSecondRow = getNumberOfOnLights(hour);
		StringBuilder hourDisplaySecondRow = new StringBuilder();
		for(int i=0; i<redLightsToGlowinSecondRow; i++) {
			hourDisplaySecondRow.append(Lamp.RED.getSign());
		}
		
		for(int j=0; j<getNumberOfOffLights(redLightsToGlowinSecondRow); j++) {
			hourDisplaySecondRow.append(Lamp.OFF.getSign());
		}
		return hourDisplaySecondRow;
	}
	
}