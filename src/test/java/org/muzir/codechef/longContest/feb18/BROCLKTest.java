package org.muzir.codechef.longContest.feb18;

import org.junit.Assert;
import org.junit.Test;

public class BROCLKTest {
	@Test
	public void testInitialAngles() {
		Assert.assertEquals(60.0, BROCLK.calculateDegrees(4, 2, 1), 0.0000000000001);
		Assert.assertEquals(120.0, BROCLK.calculateDegrees(4, 2, 2), 0.0000000000001);
	}

	@Test
	public void testInitalBroclkValue() {
		Assert.assertEquals(2, BROCLK.calculateBrokenClockValue(4, 2, 1), 0.0000000000001);
		Assert.assertEquals(1000000005, BROCLK.calculateBrokenClockValue(4, 2, 2), 0.0000000000001);
		Assert.assertEquals(1000000003, BROCLK.calculateBrokenClockValue(4, 2, 3), 0.0000000000001);
	}
}
