package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WDTBAMTest {

	@Test
	public void test() {
		int[] amountArray = WDTBAM.getArrayOfString("0 10 20 30 40 50");
		assertEquals(30, WDTBAM.findMaxWinAmount(amountArray, "ABCDE", "EBCDA"));
	}

	@Test
	public void test1() {
		int[] amountArray = { 4, 3, 2, 1, 0 };
		assertEquals(4, WDTBAM.findMaxWinAmount(amountArray, "CHEF", "QUIZ"));
	}

	@Test
	public void test2() {
		int[] amountArray = { 100, 100, 100, 100, 100, 100, 100, 100, 100 };
		assertEquals(100, WDTBAM.findMaxWinAmount(amountArray, "ABBABAAB", "ABABABAB"));
	}

	@Test
	public void test3() {
		int[] amountArray = { 1, 2 };
		assertEquals(2, WDTBAM.findMaxWinAmount(amountArray, "A", "A"));
	}

	@Test
	public void test4() {
		int[] amountArray = { 1, 2 };
		assertEquals(1, WDTBAM.findMaxWinAmount(amountArray, "B", "A"));
	}

	@Test
	public void test5() {
		int[] amountArray = { 10, 200, 40, 50, 20, 10, 10, 10, 200 };
		assertEquals(200, WDTBAM.findMaxWinAmount(amountArray, "ABBABAAB", "ABABABAB"));
	}

	@Test
	public void test6() {
		int[] amountArray = { 1, 0, 40, 50, 20, 10, 100000000, 10, 200 };
		assertEquals(50, WDTBAM.findMaxWinAmount(amountArray, "ABBABAAB", "ABABABAB"));
	}

	@Test
	public void test7() {
		int[] amountArray = { 100000000, 0, 40, 50, 20, 10, 0, 10, 200 };
		assertEquals(100000000, WDTBAM.findMaxWinAmount(amountArray, "ABBABAAB", "ABABABAB"));
	}

	@Test
	public void test8() {
		int[] amountArray = { 0, 0, 40, 50, 100000000, 10, 0, 10, 200 };
		assertEquals(100000000, WDTBAM.findMaxWinAmount(amountArray, "ABBABAAB", "ABABABAB"));
	}

	@Test
	public void test9() {
		int[] amountArray = { 0, 0, 40, 50, 10000000, 10000001, 0, 10, 200 };
		assertEquals(10000001, WDTBAM.findMaxWinAmount(amountArray, "ABBABBAB", "ABABABAB"));
	}

}
