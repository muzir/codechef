package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RPDTest {
	@Test
	public void test() {
		assertEquals(7, RPD.solution("2 8"));
		assertEquals(10, RPD.solution("8 2 8"));
		assertEquals(18, RPD.solution("9 10 11"));
		assertEquals(1, RPD.solution("10000 10000"));
	}
}
