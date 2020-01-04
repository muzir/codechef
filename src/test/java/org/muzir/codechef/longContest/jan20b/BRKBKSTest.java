package org.muzir.codechef.longContest.jan20b;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BRKBKSTest {
	@Test
	public void test() {
		assertEquals(2, BRKBKS.solution("3 1 2 2"));
		assertEquals(2, BRKBKS.solution("2 1 1 1"));
		assertEquals(2, BRKBKS.solution("3 2 2 1"));
	}
}
