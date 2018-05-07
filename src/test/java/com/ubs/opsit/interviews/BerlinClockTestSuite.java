package com.ubs.opsit.interviews;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ubs.opsit.interviews.time.TestHour;
import com.ubs.opsit.interviews.time.TestHourFirstRow;
import com.ubs.opsit.interviews.time.TestHourSecondRow;
import com.ubs.opsit.interviews.time.TestMinute;
import com.ubs.opsit.interviews.time.TestSecond;

@RunWith(Suite.class)
@SuiteClasses({BerlinClockFixture.class,TestHour.class,TestMinute.class,TestSecond.class,TestHourFirstRow.class,
	TestHourSecondRow.class})
public class BerlinClockTestSuite {

}
