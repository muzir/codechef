package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class PROC18ATest {
	@Test
	public void test() {
		int[] input = {2, 4, 8, 1, 2, 1, 8};
		int k = 2;
		Assert.assertEquals(12, PROC18A.solution(input, k));
	}

	@Test
	public void test1() {
		int[] input = {2, 4, 8, 1, 2, 1, 8};
		int k = 7;
		Assert.assertEquals(26, PROC18A.solution(input, k));
	}

	@Test
	public void test2() {
		int[] input = {2, 4, 8, 1, 2, 1, 8};
		int k = 6;
		Assert.assertEquals(24, PROC18A.solution(input, k));
	}

	@Test
	public void test3() {
		int[] input = {100,99};
		int k = 1;
		Assert.assertEquals(100, PROC18A.solution(input, k));
	}
}
