package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ALTARAYTest {

	@Test
	public void test() {
		int[] a = { 1, 2, 3, 4 };
		assertEquals("1 1 1 1", ALTARAY.solution(a));
	}

	@Test
	public void test1() {
		int[] a = { 1, -5, 1, -5 };
		assertEquals("4 3 2 1", ALTARAY.solution(a));
	}

	@Test
	public void test2() {
		int[] a = { -5, -1, -1, 2, -2, -3 };
		assertEquals("1 1 3 2 1 1", ALTARAY.solution(a));
	}

	@Test
	public void test3() {
		int[] a = { -10, 1, -10, 1, -10, 1, -10, 1, -10, 1, -10, 1 };
		assertEquals("12 11 10 9 8 7 6 5 4 3 2 1", ALTARAY.solution(a));
	}

	@Test
	public void test4() {
		int[] a = new int[100000];
		for (int i = 0; i < 100000; i++) {
			if (i % 2 == 0) {
				a[i] = -1;
			} else {
				a[i] = 1;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 100000; 0 < i; i--) {
			sb.append(i);
			if (i != 1) {
				sb.append(" ");
			}
		}
		long first = System.currentTimeMillis();
		assertEquals(sb.toString(), ALTARAY.solution(a));
		long second = System.currentTimeMillis();
		System.out.println("Milis:" + (second - first));
	}

	@Test
	public void test5() {
		int[] a = new int[100000];
		for (int i = 0; i < 100000; i++) {
			if (i % 2 == 0) {
				a[i] = -1;
			} else {
				a[i] = 1;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 100000; 0 < i; i--) {
			sb.append(i);
			if (i != 1) {
				sb.append(" ");
			}
		}
		long first = System.currentTimeMillis();
		assertEquals(sb.toString(), ALTARAY1.solution(a));
		long second = System.currentTimeMillis();
		System.out.println("Milis:" + (second - first));
	}
}
