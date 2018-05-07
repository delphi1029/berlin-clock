package com.ubs.opsit.interviews.time;

public interface Row {
	
	public StringBuilder display(Integer hour);
	
	public int getNumberOfOffLights(int redLightsToGlowinSecondRow);
	
	public int getNumberOfOnLights(Integer hour);

}
