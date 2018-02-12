package org.muzir.codechef.longContest.feb18;

import org.junit.Assert;
import org.junit.Test;

public class CARPTUNTest {
	@Test
	public void testInitialCases() {
		Assert.assertEquals("4.0", CARPTUN.calculateDelay(3, 3, "2 2 2"));
		Assert.assertEquals("3.0", CARPTUN.calculateDelay(2, 2, "3 2"));
		Assert.assertEquals("9.0", CARPTUN.calculateDelay(2, 3, "4 5 9"));
		Assert.assertEquals("8.0", CARPTUN.calculateDelay(2, 3, "3 8 2"));
		Assert.assertEquals("8.653433545", CARPTUN.calculateDelay(2, 3, "3.23443553 8.653433545 2.76453423"));
		Assert.assertEquals("800.0", CARPTUN.calculateDelay(2, 3, "30 800 600"));
		Assert.assertEquals("800.0", CARPTUN.calculateDelay(2, 3, "30 800 600"));
	}

	@Test
	public void testTwoCarCornerCases() {
		Assert.assertEquals("100.0", CARPTUN.calculateDelay(2, 100, "100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100"));
	}

	@Test
	public void testTwoCarCornerCases_1() {
		Assert.assertEquals("1000.0", CARPTUN.calculateDelay(2, 100, "100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 1000"));
	}

	@Test
	public void testTwoCarCornerCases_2() {
		Assert.assertEquals("1.0E9", CARPTUN.calculateDelay(2, 100, "100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 1000000000"));
	}

	@Test
	public void testTwoCarCornerCases_3() {
		Assert.assertEquals("1.0E9", CARPTUN.calculateDelay(2, 1, "1000000000"));
	}

	@Test
	public void testCornerCases_4() {
		Assert.assertEquals("8.653433545", CARPTUN.calculateDelay(2, 3, "3.23443553 8.653433545 2.76453423"));
	}

}
