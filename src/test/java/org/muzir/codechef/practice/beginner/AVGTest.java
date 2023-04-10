package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AVGTest {
	@Test
	public void test() {
		assertEquals(4, AVG.solution("3 3 4", "2 7 3"));
		assertEquals(-1, AVG.solution("4 4 4", "3 7 6 4"));
		assertEquals(-1, AVG.solution("3 1 4", "7 6 5"));
		assertEquals(-1, AVG.solution("3 3 4", "2 8 3"));
		// 0 case; 0 is not positive integer
		// assertEquals(0, AVG.solution("3 3 4", "12 10 2"));
		assertEquals(-1, AVG.solution("3 3 4", "12 10 2"));
	}
}
