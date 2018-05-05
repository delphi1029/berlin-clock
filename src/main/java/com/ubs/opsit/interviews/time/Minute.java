package com.ubs.opsit.interviews.time;

public class Minute {
	
	private String minutesStr;

	public void setMinutes(String minutes) {
		this.minutesStr = minutes;
	}
	
	public StringBuilder display() {
		StringBuilder minuteDisplay = new StringBuilder();
		Integer minutes = Integer.valueOf(minutesStr);
		int numberOfYellowLightsInThirdRowToGlow = minutes/5;
		int numberOfYellowLightsInFourthRowToGlow = minutes%5;
		
		for(int i=1; i<=numberOfYellowLightsInThirdRowToGlow; i++) {
			if(i%3 == 0) {
				minuteDisplay.append(Lamp.RED.getSign());
			} else {
				minuteDisplay.append(Lamp.YELLOW.getSign());
			}
		}
		
		for(int j=0; j<(11-numberOfYellowLightsInThirdRowToGlow); j++) {
			minuteDisplay.append(Lamp.OFF.getSign());
		}
		
		minuteDisplay.append("\n");
		
		for(int i=0; i<numberOfYellowLightsInFourthRowToGlow; i++) {
			minuteDisplay.append(Lamp.YELLOW.getSign());
		}
		
		for(int j=0; j<(4-numberOfYellowLightsInFourthRowToGlow); j++) {
			minuteDisplay.append(Lamp.OFF.getSign());
		}
		
		return minuteDisplay;
		
	}

}
