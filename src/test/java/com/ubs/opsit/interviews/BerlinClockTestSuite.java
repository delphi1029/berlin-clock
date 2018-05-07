package com.ubs.opsit.interviews;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ubs.opsit.interviews.time.hour.TestHour;
import com.ubs.opsit.interviews.time.hour.TestHourFirstRow;
import com.ubs.opsit.interviews.time.hour.TestHourSecondRow;
import com.ubs.opsit.interviews.time.minute.TestMinute;
import com.ubs.opsit.interviews.time.second.TestSecond;

@RunWith(Suite.class)
@SuiteClasses({BerlinClockFixture.class,TestHour.class,TestMinute.class,TestSecond.class,TestHourFirstRow.class,
	TestHourSecondRow.class})
public class BerlinClockTestSuite {

}
