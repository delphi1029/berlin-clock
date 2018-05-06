package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.exception.TimeFormatException;
import com.ubs.opsit.interviews.time.Hour;
import com.ubs.opsit.interviews.time.Minute;
import com.ubs.opsit.interviews.time.Second;
import com.ubs.opsit.interviews.time.utility.TimeFormatVerifier;
import com.ubs.opsit.interviews.time.utility.TimeFormatVerifier24Hours;

public class BerlinClock implements TimeConverter {

	private static final String TIME_DELIMITER = ":";
	private TimeFormatVerifier timeformatVerifier;
	private Hour hour;
	private Minute minute;
	private Second second;
	
	public  BerlinClock() {
		this.hour = new Hour();
		this.minute = new Minute();
		this.second = new Second();
		this.timeformatVerifier = new TimeFormatVerifier24Hours();
	}
	
	@Override
	public String convertTime(String aTime) {
		if(!timeformatVerifier.isVerified(aTime)) {
			throw new TimeFormatException("Time not in correct hh:mm:ss format");
		}
		splitTimeString(aTime);
		return displayBerlinClock();
	}

	
	
	private void splitTimeString(String aTime) {
		String[] timeTokens = aTime.split(TIME_DELIMITER);
		hour.setHour(timeTokens[0]);
		minute.setMinutes(timeTokens[1]);
		second.setSecond(timeTokens[2]);
	}

	
	private String displayBerlinClock() {
		StringBuilder convertedTime = new StringBuilder();
		convertedTime.append(second.display());
		convertedTime.append(hour.display());
		convertedTime.append(minute.display());
		
		System.out.println("***********************");
		System.out.println(convertedTime);
		System.out.println("***********************");
		return convertedTime.toString();
	}
	

}
