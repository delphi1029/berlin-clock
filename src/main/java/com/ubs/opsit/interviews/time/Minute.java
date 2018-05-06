package com.ubs.opsit.interviews.time;

public class Minute {
	
	private String minutesStr;

	public void setMinutes(String minutes) {
		this.minutesStr = minutes;
	}
	
	public StringBuilder display() {
		StringBuilder minuteDisplay = new StringBuilder();
		Integer minutes = Integer.valueOf(minutesStr);
		
		minuteDisplay.append(displayFirstMinuteRow(minutes));
		minuteDisplay.append(newLine());
		minuteDisplay.append(displaySecondMinuteRow(minutes));	
		return minuteDisplay;
		
	}
	
	private String newLine() {
		return "\n";
	}

	private StringBuilder displaySecondMinuteRow(Integer minutes) {
		int numberOfYellowLightsInFourthRowToGlow = minutes%5;
		StringBuilder minuteDisplaySecondRow = new StringBuilder();
		for(int i=0; i<numberOfYellowLightsInFourthRowToGlow; i++) {
			minuteDisplaySecondRow.append(Lamp.YELLOW.getSign());
		}
		
		for(int j=0; j<(4-numberOfYellowLightsInFourthRowToGlow); j++) {
			minuteDisplaySecondRow.append(Lamp.OFF.getSign());
		}
		return minuteDisplaySecondRow;
	}

	private StringBuilder displayFirstMinuteRow(Integer minutes) {
		int numberOfYellowLightsInThirdRowToGlow = minutes/5;
		StringBuilder minuteDisplayFirstRow = new StringBuilder();
		for(int i=1; i<=numberOfYellowLightsInThirdRowToGlow; i++) {
			if(i%3 == 0) {
				minuteDisplayFirstRow.append(Lamp.RED.getSign());
			} else {
				minuteDisplayFirstRow.append(Lamp.YELLOW.getSign());
			}
		}
		
		for(int j=0; j<(11-numberOfYellowLightsInThirdRowToGlow); j++) {
			minuteDisplayFirstRow.append(Lamp.OFF.getSign());
		}
		return minuteDisplayFirstRow;
	}

}
