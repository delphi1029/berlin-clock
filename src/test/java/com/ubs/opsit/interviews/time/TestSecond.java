package com.ubs.opsit.interviews.time;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSecond {
	
	Second second;
	
	@Before
	public void init() {
		second = new Second();
	}
	
	@Test
	public void testDisplaySecondsLightOn() {
		second.setSecond("32");
		String expected = "Y\n";
		
		StringBuilder actual = second.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplaySecondsLightOff() {
		second.setSecond("07");
		String expected = "O\n";
		
		StringBuilder actual = second.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
	

}
