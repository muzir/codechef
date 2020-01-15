package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CHSERVETest {
	@Test
	public void test() {
		assertEquals(CHSERVE.CHEF, CHSERVE.solution("1 3 2"));
	}

	@Test
	public void test1() {
		assertEquals(CHSERVE.COOK, CHSERVE.solution("0 3 2"));
	}

	@Test
	public void test2() {
		assertEquals(CHSERVE.CHEF, CHSERVE.solution("34 55 2"));
	}
}
