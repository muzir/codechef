package org.muzir.codechef.longContest.jan20b;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BRKBKSTest {
	@Test
	public void test() {
		assertEquals(2, BRKBKS.solution("3 1 2 2"));
		assertEquals(2, BRKBKS.solution("2 1 1 1"));
		assertEquals(2, BRKBKS.solution("3 2 2 1"));
		assertEquals(3, BRKBKS.solution("2 2 2 2"));
		assertEquals(2, BRKBKS.solution("5 2 2 2"));
		assertEquals(1, BRKBKS.solution("6 2 2 2"));
		assertEquals(1, BRKBKS.solution("8 2 2 2"));
		assertEquals(1, BRKBKS.solution("5 2 2 1"));
		assertEquals(2, BRKBKS.solution("3 1 1 2"));
		assertEquals(1, BRKBKS.solution("8 2 1 1"));
	}

	@Test
	public void test1() {
		assertEquals(3, BRKBKS.solution("1 1 1 1"));
		assertEquals(2, BRKBKS.solution("2 1 1 1"));
		assertEquals(1, BRKBKS.solution("3 1 1 1"));
		assertEquals(1, BRKBKS.solution("4 1 1 1"));
		assertEquals(1, BRKBKS.solution("5 1 1 1"));
		assertEquals(1, BRKBKS.solution("6 1 1 1"));
		assertEquals(1, BRKBKS.solution("7 1 1 1"));
		assertEquals(1, BRKBKS.solution("8 1 1 1"));
	}

	@Test
	public void test2() {
		assertEquals(3, BRKBKS.solution("2 2 2 2"));
		assertEquals(3, BRKBKS.solution("3 2 2 2"));
		assertEquals(2, BRKBKS.solution("4 2 2 2"));
		assertEquals(2, BRKBKS.solution("5 2 2 2"));
		assertEquals(1, BRKBKS.solution("6 2 2 2"));
		assertEquals(1, BRKBKS.solution("7 2 2 2"));
		assertEquals(1, BRKBKS.solution("8 2 2 2"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testExceptions() {
		assertEquals(3, BRKBKS.solution("1 2 2 2"));
	}
}
