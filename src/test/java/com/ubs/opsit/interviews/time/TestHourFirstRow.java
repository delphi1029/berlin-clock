package com.ubs.opsit.interviews.time;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.time.hour.HourFirstRow;

public class TestHourFirstRow {
	
	HourFirstRow hourFirstRow;
	
	@Before
	public void init() {
		hourFirstRow = new HourFirstRow();
	}
	
	@Test
	public void testDisplayMidnight() {
		String expected = "OOOO";
		
		StringBuilder actual = hourFirstRow.display(00);
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplayMidAfternoon() {
		String expected = "RROO";
		
		StringBuilder actual = hourFirstRow.display(13);
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplayJustBeforeMidnight() {
		String expected = "RRRR";
		
		StringBuilder actual = hourFirstRow.display(23);
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplayOnMidnight() {
		String expected = "RRRR";
		
		StringBuilder actual = hourFirstRow.display(24);
		
		Assert.assertEquals(expected, actual.toString());
	}


}
