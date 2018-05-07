package com.ubs.opsit.interviews.time;

public class HourFirstRow {
	
	private static final int TOTAL_HOUR_LIGHTS = 4;
	
	public StringBuilder display(Integer hour) {
		int redLightsToGlowinFirstRow = getRedLightToGlowInFirstRow(hour);
		StringBuilder hourDisplayFirstRow = new StringBuilder();
		for(int i=0; i<redLightsToGlowinFirstRow; i++) {
			hourDisplayFirstRow.append(Lamp.RED.getSign());
		}
		for(int j=0; j<getOffLightsInFirstRow(redLightsToGlowinFirstRow); j++) {
			hourDisplayFirstRow.append(Lamp.OFF.getSign());
		}
		return hourDisplayFirstRow;
	}

	private int getOffLightsInFirstRow(int redLightsToGlowinFirstRow) {
		return  TOTAL_HOUR_LIGHTS-redLightsToGlowinFirstRow;
	}

	private int getRedLightToGlowInFirstRow(Integer hour) {
		int redLightsToGlowinFirstRow = hour / 5;
		return redLightsToGlowinFirstRow;
	}

}
