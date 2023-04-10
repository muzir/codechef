package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PRGIFTTest {
	@Test
	public void test() {
		int[] params = {1, 2};
		assertEquals(PRGIFT.YES, PRGIFT.solution(1, params));
		assertEquals(PRGIFT.YES, PRGIFT.solution(0, params));
	}

	@Test
	public void test1() {
		int[] params = {2, 6, 5};
		assertEquals(PRGIFT.YES, PRGIFT.solution(2, params));
	}

	@Test
	public void test2() {
		int[] params = {2, 4, 5};
		assertEquals(PRGIFT.NO, PRGIFT.solution(3, params));
	}

	@Test
	public void test3() {
		int[] params = {1, 2, 4, 5};
		assertEquals(PRGIFT.YES, PRGIFT.solution(0, params));
	}

	@Test
	public void test4() {
		int[] params = {1, 2, 4, 5};
		assertEquals(PRGIFT.YES, PRGIFT.solution(0, params));
	}

	@Test
	public void test5() {
		int[] params = {1, 3, 7, 5};
		assertEquals(PRGIFT.YES, PRGIFT.solution(0, params));
	}

	@Test
	public void test6() {
		int[] params = {2, 4, 6, 8};
		assertEquals(PRGIFT.NO, PRGIFT.solution(0, params));
	}

	@Test
	public void test7() {
		int[] params = {1, 2, 4, 8, 5};
		assertEquals(PRGIFT.YES, PRGIFT.solution(0, params));
		assertEquals(PRGIFT.YES, PRGIFT.solution(1, params));
		assertEquals(PRGIFT.YES, PRGIFT.solution(2, params));
		assertEquals(PRGIFT.YES, PRGIFT.solution(3, params));
		assertEquals(PRGIFT.NO, PRGIFT.solution(4, params));
		assertEquals(PRGIFT.NO, PRGIFT.solution(5, params));
	}

	@Test
	public void test8() {
		int[] params = {1, 2, 4, 5, 8};
		assertEquals(PRGIFT.YES, PRGIFT.solution(0, params));
		assertEquals(PRGIFT.YES, PRGIFT.solution(1, params));
		assertEquals(PRGIFT.YES, PRGIFT.solution(2, params));
		assertEquals(PRGIFT.YES, PRGIFT.solution(3, params));
		assertEquals(PRGIFT.NO, PRGIFT.solution(4, params));
	}
}
