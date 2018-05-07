package com.ubs.opsit.interviews.time;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.time.minute.Minute;

public class TestMinute {
	
	Minute minute;
	
	@Before
	public void init() {
		minute = new Minute();
	}
	
	@Test
	public void testDisplayMidnight() {
		minute.setMinutes("00");
		String expected = "OOOOOOOOOOO\nOOOO";
		
		StringBuilder actual = minute.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	
	@Test
	public void testDisplayJustBeforeMidnight() {
		minute.setMinutes("59");
		String expected = "YYRYYRYYRYY\nYYYY";
		
		StringBuilder actual = minute.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplayMid() {
		minute.setMinutes("17");
		String expected = "YYROOOOOOOO\nYYOO";
		
		StringBuilder actual = minute.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
}
