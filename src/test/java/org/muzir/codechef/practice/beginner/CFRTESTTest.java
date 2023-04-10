package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CFRTESTTest {
	@Test
	public void test() {
		int[] a = { 1, 1 };
		assertEquals(1, CFRTEST.solution(a));
	}

	@Test
	public void test1() {
		int[] a = { 3, 2 };
		assertEquals(2, CFRTEST.solution(a));
	}
}
