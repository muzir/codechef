package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BUGCALTest {

	@Test
	public void initialTest() {
		assertEquals(11, BUGCAL.calculateBugyCalculator("12", "9"));
		assertEquals(40, BUGCAL.calculateBugyCalculator("25", "25"));
		assertEquals(0, BUGCAL.calculateBugyCalculator("120", "980"));
		assertEquals(0, BUGCAL.calculateBugyCalculator("980", "120"));
		assertEquals(900, BUGCAL.calculateBugyCalculator("880", "120"));
		assertEquals(130, BUGCAL.calculateBugyCalculator("129", "11"));
	}
}
