package com.ubs.opsit.interviews.time.hour;


public class Hour {
	
	private Integer hour;
	private HourFirstRow firstrow;
	private HourRow secondrow;
	
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
		hourDisplay.append(newLine());
		hourDisplay.append(secondrow.display(hour));
		hourDisplay.append(newLine());
		return hourDisplay;
	}

	private String newLine() {
		return "\n";
	}
}
