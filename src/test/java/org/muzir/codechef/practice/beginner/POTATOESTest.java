package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class POTATOESTest {
	@Test
	public void test() {
		Assert.assertEquals(1, POTATOES.solution(1, 3));
		Assert.assertEquals(4, POTATOES.solution(4, 3));
		Assert.assertEquals(1, POTATOES.solution(1, 1));
		Assert.assertEquals(2, POTATOES.solution(2, 1));
		Assert.assertEquals(3, POTATOES.solution(1000, 1000));
	}

	@Test
	public void test1() {
		Assert.assertTrue(POTATOES.isPrime(2003));
	}
}
