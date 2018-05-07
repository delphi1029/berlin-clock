package com.ubs.opsit.interviews.time.hour;


public class HourFirstRow extends HourRow{
	
	
	public int getNumberOfOnLights(Integer hour) {
		int lightsToGlow = hour / 5;
		return lightsToGlow;
	}

}
