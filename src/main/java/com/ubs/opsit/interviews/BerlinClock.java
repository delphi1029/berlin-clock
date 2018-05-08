package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.exception.TimeFormatException;
import com.ubs.opsit.interviews.time.hour.Hour;
import com.ubs.opsit.interviews.time.minute.Minute;
import com.ubs.opsit.interviews.time.second.Seconds;
import com.ubs.opsit.interviews.time.utility.TimeFormatVerifier;
import com.ubs.opsit.interviews.time.utility.TimeFormatVerifier24Hours;

public class BerlinClock implements TimeConverter {

	private Hour hour;
	private Minute minute;
	private Seconds second;
	private TimeStringSplitter timeStringSplitter;
	private TimeFormatVerifier timeformatVerifier;

	public  BerlinClock() {
		this.hour = new Hour();
		this.minute = new Minute();
		this.second = new Seconds();
		this.timeformatVerifier = new TimeFormatVerifier24Hours();
		this.timeStringSplitter = new TimeStringSplitter();
	}
	
	@Override
	public String convertTime(String timeStr) {
		
		verifyTimeString(timeStr);
		String[] time = timeStringSplitter.splitTimeString(timeStr);
		setTime(time);
		return displayBerlinClock();
	}

	private void verifyTimeString(String timeStr) {
		if(!timeformatVerifier.isVerified(timeStr)) {
			throw new TimeFormatException("Time not in hh:mm:ss format");
		}
	}
	
	private void setTime(String[] time) {
		hour.setHour(time[0]);
		minute.setMinutes(time[1]);
		second.setSecond(time[2]);
	}

	private String displayBerlinClock() {
		StringBuilder convertedTime = new StringBuilder();
		convertedTime.append(second.display());
		convertedTime.append(hour.display());
		convertedTime.append(minute.display());
		
		return convertedTime.toString();
	}
	

}
