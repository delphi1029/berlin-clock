package com.ubs.opsit.interviews.time;

public class Hour {
	
	
	private Integer hour;
	
	public void setHour(String hourStr) {
		this.hour = Integer.parseInt(hourStr);
	}
	
	public StringBuilder display() {
		StringBuilder hourDisplay = new StringBuilder();
		HourFirstRow firstrow = new HourFirstRow();
		HourSecondRow secondrow = new HourSecondRow();
		
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
