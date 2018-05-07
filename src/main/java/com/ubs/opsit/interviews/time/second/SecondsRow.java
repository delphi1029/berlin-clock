package com.ubs.opsit.interviews.time.second;

import com.ubs.opsit.interviews.time.Lamp;
import com.ubs.opsit.interviews.time.Row;

public class SecondsRow implements Row {

	@Override
	public StringBuilder display(Integer seconds) {
		
		StringBuilder secondsDisplay = new StringBuilder();
		boolean secondsLightToGlow = seconds % 2 == 0 ?true:false;
		if(secondsLightToGlow)
			secondsDisplay.append(displayOnLamps(1));
		else
			secondsDisplay.append(displayOffLamps(1));
		return secondsDisplay;
	}

	@Override
	public int getNumberOfOffLights(int redLightsToGlowinSecondRow) {
		return 0;
	}

	@Override
	public int getNumberOfOnLights(Integer hour) {
		return 0;
	}

	@Override
	public StringBuilder displayOnLamps(int numberOfOnLights) {
		StringBuilder display = new StringBuilder();
		display.append(Lamp.YELLOW.getSign());
		return display;
	}

	@Override
	public StringBuilder displayOffLamps(int numberOfOnLights) {
		StringBuilder display = new StringBuilder();
		display.append(Lamp.OFF.getSign());
		return display;
	}

}
