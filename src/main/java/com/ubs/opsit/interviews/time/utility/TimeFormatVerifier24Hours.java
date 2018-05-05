package com.ubs.opsit.interviews.time.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeFormatVerifier24Hours implements TimeFormatVerifier{

	private static final String TIME_PATTERN_24HR = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
	
	@Override
	public boolean isVerified(String aTime) {
		Pattern pattern = Pattern.compile(TIME_PATTERN_24HR);
		Matcher matcher = pattern.matcher(aTime);
		return matcher.matches();
	}

}
