package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
