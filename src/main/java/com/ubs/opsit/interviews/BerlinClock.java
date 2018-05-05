package com.ubs.opsit.interviews;

import java.text.SimpleDateFormat;

public class BerlinClock implements TimeConverter {

	private static final String TIME_PATTERN_24HR = "([01]?[0-9]|2[0-3]):[0-5][0-9]";

	private static final String TIME_FORMAT = "hh:mm:ss";
	private Hour hour;
	private Minute minute;
	private Second second;
	
	public  BerlinClock() {
		this.hour = new Hour();
		this.minute = new Minute();
		this.second = new Second();
	}
	
	@Override
	public String convertTime(String aTime) {
		verifyandSplitTimeString(aTime);
		return displayBerlinClock();
	}

	
	
	private void verifyandSplitTimeString(String aTime) {
		
		SimpleDateFormat timeFormat = new SimpleDateFormat(TIME_FORMAT);
		String[] timeTokens = aTime.split(":");
		
		hour.setHour(timeTokens[0]);
		minute.setMinutes(timeTokens[1]);
		second.setSecond(timeTokens[2]);
	}

	
	private String displayBerlinClock() {
		StringBuilder convertedTime = new StringBuilder();
		convertedTime.append(second.display());
		convertedTime.append(hour.display());
		convertedTime.append(minute.display());
		return convertedTime.toString();
	}
	

}
