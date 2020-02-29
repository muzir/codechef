package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CSUMTest {
	@Test
	public void test() {
		assertEquals("Yes", CSUM.solution("1 2 1 3", 3));
		assertEquals("No", CSUM.solution("1 2 1 3", 6));
		assertEquals("No", CSUM.solution("5 4 1 2 3", 1));
		assertEquals("Yes", CSUM.solution("5 4 1 2 16", 18));
		assertEquals("No", CSUM.solution("5 4 1 9 18", 18));
		assertEquals("Yes", CSUM.solution("1000000000 1000000000", 2000000000));
	}
}
