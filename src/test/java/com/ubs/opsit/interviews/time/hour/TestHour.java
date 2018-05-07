package com.ubs.opsit.interviews.time.hour;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.time.hour.Hour;

public class TestHour {
	
	Hour hour;
	
	@Before
	public void init() {
		hour = new Hour();
	}
	
	
	@Test
	public void testDisplayMidnight() {
		hour.setHour("00");
		String expected = "OOOO\nOOOO\n";
		
		StringBuilder actual = hour.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplayMidAfternoon() {
		hour.setHour("13");
		String expected = "RROO\nRRRO\n";
		
		StringBuilder actual = hour.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplayJustBeforeMidnight() {
		hour.setHour("23");
		
		String expected = "RRRR\nRRRO\n";
		
		StringBuilder actual = hour.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplayOnMidnight() {
		hour.setHour("24");
		
		String expected = "RRRR\nRRRR\n";
		
		StringBuilder actual = hour.display();
		
		Assert.assertEquals(expected, actual.toString());
	}

}
