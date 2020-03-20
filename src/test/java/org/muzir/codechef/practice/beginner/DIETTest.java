package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DIETTest {
	@Test
	public void testYes() {
		assertEquals("YES", DIET.solution(5, "7 3 6 5"));
	}

	@Test
	public void testNo() {
		assertEquals("NO 1", DIET.solution(4, "3 10 10"));
		assertEquals("NO 3", DIET.solution(4, "8 1 1"));
	}
}
