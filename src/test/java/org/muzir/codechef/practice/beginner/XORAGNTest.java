package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XORAGNTest {
	@Test
	public void testXOR() {
		System.out.println(XORAGN.computeXOR(1, 2));
		System.out.println(XORAGN.computeXOR(3, 3));
		System.out.println(XORAGN.computeXOR(0, 4));
		System.out.println(XORAGN.computeXOR(3, 5));
		System.out.println(XORAGN.computeXOR(6, 7));
	}

	@Test
	public void testComputeXORForSequence() {
		assertEquals(1, XORAGN.computeXOR(1));
		assertEquals(3, XORAGN.computeXOR(1, 2));
		assertEquals(0, XORAGN.computeXOR(1, 2, 3));
		assertEquals(4, XORAGN.computeXOR(1, 2, 3, 4));
	}

	@Test
	public void testComputeSequence() {
		assertEquals(5, XORAGN.computeXOR(2, 4, 5, 6));
		assertEquals(3, XORAGN.computeXOR(1, 2));
		assertEquals(6, XORAGN.computeXOR(2, 3, 3, 4));

		assertEquals(0, XORAGN.computeXOR(1, 2, 3));
		assertEquals(0, XORAGN.computeXOR(2, 3, 4, 3, 4, 5, 4, 5, 6));

		assertEquals(0, XORAGN.computeXOR(1, 1));
		assertEquals(0, XORAGN.computeXOR(2, 2, 2, 2));
	}

	@Test
	public void testSolution() {
		assertEquals(6, XORAGN.solution("1 2"));
		assertEquals(0, XORAGN.solution("1 2 3"));
		assertEquals(10, XORAGN.solution("2 4 5 6"));
	}

	@Test
	public void printDeep2() {
		System.out.println(Arrays.toString(XORAGN.calculateDeep2(1, 2, 3)));
	}

	@Test
	public void printDeepN() {
		System.out.println(Arrays.toString(XORAGN.calculateDeepN(3, 1, 2, 3)));
		System.out.println(Arrays.toString(XORAGN.calculateDeepN(4, 1, 2, 3)));
		System.out.println(Arrays.toString(XORAGN.calculateDeepN(10, 1, 2, 3)));
	}

	@Test
	public void testXORWithDeepN() {
		long[] param1 = {1, 2, 3};
		int n = 2;
		long[] array1 = XORAGN.calculateDeepN(n, param1);
		long p1 = XORAGN.computeXOR(array1);
		long p2 = n * XORAGN.computeXOR(param1);
		assertEquals(p1, p2);
	}
}
