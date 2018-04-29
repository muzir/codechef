package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class ICPC16ATest {
	@Test
	public void test() {
		int[] params = {1, 2, 1, 3};
		Assert.assertEquals(ICPC16A.solution(params), "up");
	}

	@Test
	public void test1() {
		int[] params = {0, 0, 1, 0};
		Assert.assertEquals(ICPC16A.solution(params), "right");
	}

	@Test
	public void test2() {
		int[] params = {1, 2, 1, 8};
		Assert.assertEquals(ICPC16A.solution(params), "up");
	}

	@Test
	public void test3() {
		int[] params = {0, 0, 9, 0};
		Assert.assertEquals(ICPC16A.solution(params), "right");
	}

	@Test
	public void test4() {
		int[] params = {0, -1, 0, -9};
		Assert.assertEquals(ICPC16A.solution(params), "down");
	}

}
