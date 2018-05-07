package com.ubs.opsit.interviews.time.minute;

import com.ubs.opsit.interviews.time.Lamp;

public class MinuteSecondRow extends MinuteRow{

	private static final int TOTAL_LIGHTS_IN_ROW = 4;

	public int getNumberOfOffLights(int numberOfYellowLightsInFourthRowToGlow) {
		return TOTAL_LIGHTS_IN_ROW-numberOfYellowLightsInFourthRowToGlow;
	}


	public int getNumberOfOnLights(Integer minutes) {
		int numberOfOnLights = minutes%5;
		return numberOfOnLights;
	}


	@Override
	public StringBuilder displayOnLamps(int numberOfOnLights) {
		StringBuilder displayOnLamps = new StringBuilder();
		for(int i=0; i<numberOfOnLights; i++) {
			displayOnLamps.append(Lamp.YELLOW.getSign());
		}
		return displayOnLamps;
	}


}
