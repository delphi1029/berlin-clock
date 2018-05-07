package com.ubs.opsit.interviews.time.hour;

import com.ubs.opsit.interviews.time.Row;


public class Hour {
	
	private Integer hour;
	private Row firstrow;
	private Row secondrow;
	
	public Hour() {
		super();
		firstrow = new HourFirstRow();
		secondrow = new HourSecondRow();
	}

	public Hour(HourFirstRow firstrow, HourRow secondrow) {
		super();
		this.firstrow = firstrow;
		this.secondrow = secondrow;
	}

	public void setHour(String hourStr) {
		this.hour = Integer.parseInt(hourStr);
	}
		
	public StringBuilder display() {
		StringBuilder hourDisplay = new StringBuilder();	
		hourDisplay.append(firstrow.display(hour));
		hourDisplay.append(firstrow.newLine());
		hourDisplay.append(secondrow.display(hour));
		hourDisplay.append(secondrow.newLine());
		return hourDisplay;
	}
}
