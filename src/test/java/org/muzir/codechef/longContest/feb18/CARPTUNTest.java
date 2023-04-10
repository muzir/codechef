package org.muzir.codechef.longContest.feb18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CARPTUNTest {
	@Test
	public void testInitialCases() {
		assertEquals("4.0", CARPTUN.calculateDelay(3, 3, "2 2 2"));
		assertEquals("3.0", CARPTUN.calculateDelay(2, 2, "3 2"));
		assertEquals("9.0", CARPTUN.calculateDelay(2, 3, "4 5 9"));
		assertEquals("8.0", CARPTUN.calculateDelay(2, 3, "3 8 2"));
		assertEquals("8.653433545", CARPTUN.calculateDelay(2, 3, "3.23443553 8.653433545 2.76453423"));
		assertEquals("800.0", CARPTUN.calculateDelay(2, 3, "30 800 600"));
		assertEquals("800.0", CARPTUN.calculateDelay(2, 3, "30 800 600"));
	}

	@Test
	public void testTwoCarCornerCases() {
		assertEquals("100.0", CARPTUN.calculateDelay(2, 100, "100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100"));
	}

	@Test
	public void testTwoCarCornerCases_1() {
		assertEquals("1000.0", CARPTUN.calculateDelay(2, 100, "100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 1000"));
	}

	@Test
	public void testTwoCarCornerCases_2() {
		assertEquals("1.0E9", CARPTUN.calculateDelay(2, 100, "100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 1000000000"));
	}

	@Test
	public void testTwoCarCornerCases_3() {
		assertEquals("1.0E9", CARPTUN.calculateDelay(2, 1, "1000000000"));
	}

	@Test
	public void testCornerCases_4() {
		assertEquals("8.653433545", CARPTUN.calculateDelay(2, 3, "3.23443553 8.653433545 2.76453423"));
	}

}
