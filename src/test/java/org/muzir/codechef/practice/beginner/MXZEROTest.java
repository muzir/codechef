package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MXZEROTest {

	@Test
	public void test() {
		int[] a = { 1, 0, 0, 0, 0 };
		assertEquals(1, MXZERO.solution(a));
	}

	@Test
	public void test1() {
		int[] a = { 1, 1, 1, 1, 1 };
		assertEquals(5, MXZERO.solution(a));
	}

}
