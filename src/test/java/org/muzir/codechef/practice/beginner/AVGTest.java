package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AVGTest {
	@Test
	public void test() {
		assertEquals(4, AVG.solution("3 3 4", "2 7 3"));
		assertEquals(-1, AVG.solution("4 4 4", "3 7 6 4"));
		//assertEquals(3, AVG.solution("4 4 4", "3 7 6 4"));
		assertEquals(-1, AVG.solution("3 1 4", "7 6 5"));
		assertEquals(-1, AVG.solution("3 3 4", "2 8 3"));
	}
}
