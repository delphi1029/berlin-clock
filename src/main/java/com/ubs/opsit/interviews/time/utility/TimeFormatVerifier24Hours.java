package com.ubs.opsit.interviews.time.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeFormatVerifier24Hours implements TimeFormatVerifier{

	private static final String TIME_PATTERN_24HR = "([01]?[0-9]|2[0-3]|24(?=:00?:00?$)):([0-5][0-9]):([0-5][0-9])";
	private Pattern pattern;
	
	public TimeFormatVerifier24Hours() {
		super();
		pattern = Pattern.compile(TIME_PATTERN_24HR);
	}


	@Override
	public boolean isVerified(String aTime) {
		Matcher matcher = pattern.matcher(aTime);
		return matcher.matches();
	}

}
