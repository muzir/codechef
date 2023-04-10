package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EGRANDRTest {
	private static final String NO = "No";
	private static final String YES = "Yes";

	@Test
	public void test() {
		int[] a = { 3, 5, 4, 4, 3 };
		assertEquals(NO, EGRANDR.solution(a));
	}

	@Test
	public void test1() {
		int[] a = { 3, 4, 4, 4, 5 };
		assertEquals(YES, EGRANDR.solution(a));
	}

	@Test
	public void test3() {
		int[] a = { 5, 5, 5, 5, 2 };
		assertEquals(NO, EGRANDR.solution(a));
	}

	@Test
	public void test4() {
		int[] a = { 4, 4, 4, 4, 4 };
		assertEquals(NO, EGRANDR.solution(a));
	}

	@Test
	public void test5() {
		int[] a = {};
		assertEquals(NO, EGRANDR.solution(a));
	}

	@Test
	public void test6() {
		int[] a = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 3, 3, 3, 3 };
		assertEquals(YES, EGRANDR.solution(a));
	}
}
