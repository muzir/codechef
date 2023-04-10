package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class STICKSTest {

	@Test
	public void test() {
		int[] a = { 1, 2, 3, 1, 2 };
		assertEquals(2, STICKS.solution(a));
	}

	@Test
	public void test1() {
		int[] a = { 1, 2, 2, 3 };
		assertEquals(-1, STICKS.solution(a));
	}

	@Test
	public void test2() {
		int[] a = { 7, 1, 1, 9, 23, 2, 20, 9, 20 };
		assertEquals(180, STICKS.solution(a));
	}

	@Test
	public void test3() {
		int[] a = { 1, 1, 1, 1, 1, 1, 20, 9, 20 };
		assertEquals(20, STICKS.solution(a));
	}

	@Test
	public void test4() {
		int[] a = { 1, 1, 1, 1, 1, 1, 9, 9, 20 };
		assertEquals(9, STICKS.solution(a));
	}

	@Test
	public void test5() {
		int[] a = { 1, 1, 1, 1, 1, 1, 1, 9, 20 };
		assertEquals(1, STICKS.solution(a));
	}

}
