package org.muzir.codechef.longContest.feb18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BROCLKTest {
	@Test
	public void testInitialAngles() {
		assertEquals(60.0, BROCLK.calculateDegrees(4, 2, 1), 0.0000000000001);
		assertEquals(120.0, BROCLK.calculateDegrees(4, 2, 2), 0.0000000000001);
	}

	@Test
	public void testInitalBroclkValue() {
		assertEquals(2, BROCLK.calculateBrokenClockValue(4, 2, 1), 0.0000000000001);
		assertEquals(1000000005, BROCLK.calculateBrokenClockValue(4, 2, 2), 0.0000000000001);
		assertEquals(1000000003, BROCLK.calculateBrokenClockValue(4, 2, 3), 0.0000000000001);
	}
}
