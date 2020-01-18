package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TSTROBOTTest {
	@Test
	public void test() {
		TSTROBOT.Robot robot = new TSTROBOT.Robot(10, "RRLLLL");
		assertEquals(5, robot.calculateUniqueVisitedNodes());
	}
}
