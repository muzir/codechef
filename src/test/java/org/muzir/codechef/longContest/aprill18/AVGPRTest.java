package org.muzir.codechef.longContest.aprill18;

import org.junit.Assert;
import org.junit.Test;

public class AVGPRTest {
	@Test
	public void test() {
		int[] sequence = {1, 2};
		Assert.assertEquals(0, AVGPR.solution1(sequence));
	}

	@Test
	public void test1() {
		int[] sequence = {2, 2};
		Assert.assertEquals(1, AVGPR.solution1(sequence));
	}

	@Test
	public void test2() {
		int[] sequence = {2, 1, 3};
		Assert.assertEquals(1, AVGPR.solution1(sequence));
	}

	@Test
	public void test3() {
		int[] sequence = {100000, 100000};
		Assert.assertEquals(1, AVGPR.solution1(sequence));
	}

	@Test
	public void test4() {
		int[] sequence = {4, 2, 5, 1, 3, 5};
		Assert.assertEquals(7, AVGPR.solution1(sequence));
	}

	@Test
	public void test5() {
		int[] sequence = {1000, 1000, 1000, 1000, 1000};
		Assert.assertEquals(10, AVGPR.solution1(sequence));
	}

	@Test
	public void test6() {
		int[] sequence = {-1, -4, -7};
		Assert.assertEquals(1, AVGPR.solution1(sequence));
	}

	@Test
	public void test7() {
		int[] sequence = {0, -5, -8, -2};
		Assert.assertEquals(1, AVGPR.solution1(sequence));
	}

	@Test
	public void test8() {
		int[] sequence = {2, 0, -2};
		Assert.assertEquals(1, AVGPR.solution1(sequence));
	}

	@Test
	public void test9() {
		int[] sequence = {10, 4, -2};
		Assert.assertEquals(1, AVGPR.solution1(sequence));
	}
}
