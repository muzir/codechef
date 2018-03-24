package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class HILLSTest {

	@Test
	public void test() {
		int[] a = {2, 5, 2, 6, 3};
		int u = 3;
		int d = 2;
		Assert.assertEquals(3, HILLS.solution(a, u, d));
	}

	@Test
	public void test1() {
		int[] a = {4, 4, 4, 4, 4};
		int u = 2;
		int d = 3;
		Assert.assertEquals(5, HILLS.solution(a, u, d));
	}

	@Test
	public void test2() {
		int[] a = {1, 4, 3, 2, 1};
		int u = 2;
		int d = 7;
		Assert.assertEquals(1, HILLS.solution(a, u, d));
	}
}
