package com.ubs.opsit.interviews.time.hour;

import com.ubs.opsit.interviews.time.Lamp;
import com.ubs.opsit.interviews.time.Row;

public abstract class HourRow implements Row {

	public static final int TOTAL_HOUR_LIGHTS = 4;


	public StringBuilder display(Integer hour) {
		int numberOfOnLights = getNumberOfOnLights(hour);
		StringBuilder hourDisplay = new StringBuilder();
		hourDisplay.append(displayOnLamps(numberOfOnLights));
		hourDisplay.append(displayOffLamps(getNumberOfOffLights(numberOfOnLights)));
		return hourDisplay;
	}
	
	
	public int getNumberOfOffLights(int numberOfOnLights) {
		return  TOTAL_HOUR_LIGHTS-numberOfOnLights;
	}
	
	@Override
	public StringBuilder displayOnLamps(int numberOfOnLights) {
		StringBuilder displayOnLamps = new StringBuilder();
		for(int i=0; i<numberOfOnLights; i++) {
			displayOnLamps.append(Lamp.RED.getSign());
		}
		return displayOnLamps;
	}

	@Override
	public StringBuilder displayOffLamps(int numberOfOffLights) {
		StringBuilder displayOffLamps = new StringBuilder();
		for(int j=0; j<numberOfOffLights; j++) {
			displayOffLamps.append(Lamp.OFF.getSign());
		}
		return displayOffLamps;
	}
	
}