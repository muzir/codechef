package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BIT2ATest {
	@Test
	public void test() {
		assertEquals("3 2 0 0", BIT2A.solution("1 2 4 4"));
		assertEquals("4 0 0 0 0", BIT2A.solution("1 2 2 2 2"));
		assertEquals("5 4 0 2 0 0", BIT2A.solution("1 2 4 4 5 5"));
		assertEquals("0 0 0 0 0 0", BIT2A.solution("1 1 1 1 1 1"));
	}
}
