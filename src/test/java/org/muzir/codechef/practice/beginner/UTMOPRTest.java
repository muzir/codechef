package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UTMOPRTest {

	@Test
	public void test() {
		int[] a = { 1, 3, 4 };
		assertEquals("odd", UTMOPR.solution(a, 1));
	}

	@Test
	public void test1() {
		int[] a = { 1, 3, 4 };
		assertEquals("even", UTMOPR.solution(a, 2));
	}

	@Test
	public void test2() {
		int[] a = { 1, 3, 4 };
		assertEquals("even", UTMOPR.solution(a, 3));
	}

	@Test
	public void test3() {
		int[] a = { 1, 3, 4 };
		assertEquals("even", UTMOPR.solution(a, 100000));
	}

}
