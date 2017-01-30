package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.*;

import org.junit.Test;

public class STUDVOTETest {

	@Test
	public void test() {
		int[] a = { 2, 1, 2 };
		assertEquals(1, STUDVOTE.solution(a, 2));
	}

	@Test
	public void test1() {
		int[] a = { 1, 2 };
		assertEquals(0, STUDVOTE.solution(a, 1));
	}

	@Test
	public void test2() {
		int[] a = { 1, 2, 10, 4, 4, 4, 4, 4, 4, 4 };
		assertEquals(1, STUDVOTE.solution(a, 1));
	}

	@Test
	public void test3() {
		int[] a = { 5, 6, 10, 4, 4, 4, 4, 4, 4, 4 };
		assertEquals(3, STUDVOTE.solution(a, 1));
	}

	@Test
	public void test4() {
		int[] a = { 5, 6, 10, 4, 4, 4, 4, 4, 4, 4 };
		assertEquals(0, STUDVOTE.solution(a, 4));
	}

	@Test
	public void test5() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(0, STUDVOTE.solution(a, 1));
	}

}
