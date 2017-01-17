package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import java.security.SecureRandom;

import org.junit.Test;

public class SIMPSTATTest {

	@Test
	public void test() {
		long start = System.currentTimeMillis();
		int[] a = new int[10000];
		SecureRandom sr = new SecureRandom();
		for (int i = 0; i < 10000; i++) {
			a[i] = sr.nextInt(100);
		}
		System.out.println(SIMPSTAT.solution(a, 0));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	@Test
	public void test1() {
		int[] a = { 2, 9, -10, 25, 1 };
		System.out.println(SIMPSTAT.solution(a, 0));
	}

	@Test
	public void test2() {
		int[] a = { 2, 9, -10, 25, 1 };
		assertEquals("4.000000", SIMPSTAT.solution(a, 1));
	}

	@Test
	public void test3() {
		int[] a = { 2, 9, -10, 25, 1 };
		assertEquals("5.400000", SIMPSTAT.solution(a, 0));
	}

	@Test
	public void test4() {
		int[] a = { 1, 1, 1 };
		assertEquals("1.000000", SIMPSTAT.solution(a, 1));
	}

	@Test
	public void test5() {
		int[] a = { 3, 3, -5, 0, 0, 2, -10, -9, 3, 10 };
		// -10 -9 -5 0 0 2 0 3 3 10
		assertEquals("-0.750000", SIMPSTAT.solution(a, 4));
	}

	@Test
	public void test6() {
		int[] a = { 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000 };
		assertEquals("100000.000000", SIMPSTAT.solution(a, 0));
	}

	@Test
	public void test7() {
		int[] a = { 2000000000, 2000000000, 2000000000, 2000000000, 2000000000 };
		assertEquals("2000000000.000000", SIMPSTAT.solution(a, 0));
	}
}
