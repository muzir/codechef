package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EID2Test {
	@Test
	public void test() {
		assertEquals("FAIR", EID2.solution("5 7 10 10 20 50"));
		assertEquals("NOT FAIR", EID2.solution("5 5 5 20 10 20"));
		assertEquals("NOT FAIR", EID2.solution("10 1 17 5 10 15"));
		assertEquals("NOT FAIR", EID2.solution("3 6 3 8 10 9"));
		assertEquals("FAIR", EID2.solution("8 5 5 50 10 10"));
	}
}
