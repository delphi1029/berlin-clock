package com.ubs.opsit.interviews.time.minute;

import com.ubs.opsit.interviews.time.Lamp;

public class MinuteFirstRow extends MinuteRow {
	
	private static final int TOTAL_LIGHTS_IN_ROW = 11;

	

	public int getNumberOfOffLights(int numberOfLightsToGlow) {
		return TOTAL_LIGHTS_IN_ROW-numberOfLightsToGlow;
	}

	public int getNumberOfOnLights(Integer minutes) {
		int numberOfLightsToGlow = minutes/5;
		return numberOfLightsToGlow;
	}

	@Override
	public StringBuilder displayOnLamps(int numberOfOnLights) {
		StringBuilder displayOnLamps = new StringBuilder();
		for(int i=1; i<=numberOfOnLights; i++) {
			if(i%3 == 0) {
				displayOnLamps.append(Lamp.RED.getSign());
			} else {
				displayOnLamps.append(Lamp.YELLOW.getSign());
			}
		}
		return displayOnLamps;
	}

	

}
