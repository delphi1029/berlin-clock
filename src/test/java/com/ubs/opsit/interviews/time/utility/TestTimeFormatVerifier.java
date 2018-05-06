package com.ubs.opsit.interviews.time.utility;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTimeFormatVerifier {
	
	TimeFormatVerifier  verifier;
	
	@Before
	public void init() {
		verifier = new TimeFormatVerifier24Hours();
	}
	
	@Test
	public void testVerify24HourTimeFormat() {
	Assert.assertEquals(true,verifier.isVerified("13:00:01"));
	Assert.assertEquals(true,verifier.isVerified("24:00:00"));
	Assert.assertEquals(false,verifier.isVerified("24:02:00"));
	Assert.assertEquals(true,verifier.isVerified("23:59:59"));
	Assert.assertEquals(true,verifier.isVerified("00:00:00"));
	}

}
