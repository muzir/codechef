package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DSTAPLSTest {
	@Test
	public void test() {
		assertEquals("NO", DSTAPLS.solution("5 1"));
		assertEquals("NO", DSTAPLS.solution("4 2"));
		assertEquals("YES", DSTAPLS.solution("10 10"));
	}
}
