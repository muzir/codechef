package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WATSCORETest {
	@Test
	public void test() {
		assertEquals(135, WATSCORE.solution(5, "2 45", "9 100", "8 0", "2 15", "8 90"));
		assertEquals(100, WATSCORE.solution(2, "2 45", "2 100"));
		assertEquals(200, WATSCORE.solution(4, "1 40", "2 100", "3 50", "3 60"));
		assertEquals(0, WATSCORE.solution(4, "9 40", "10 100", "10 50", "11 60"));
	}
}
