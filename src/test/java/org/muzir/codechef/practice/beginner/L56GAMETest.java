package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class L56GAMETest {
	@Test
	public void test() {
		int[] sequence = {7, 4, 3, 2, 6};
		Assert.assertEquals(1, L56GAME.solution(sequence));
	}

	@Test
	public void test1() {
		int[] sequence = {1, 2};
		Assert.assertEquals(2, L56GAME.solution(sequence));
	}

	@Test
	public void test2() {
		int[] sequence = {1, 1, 1, 1, 4, 4, 4};
		Assert.assertEquals(1, L56GAME.solution(sequence));
	}

	@Test
	public void test3() {
		int[] sequence = {1, 1, 1, 4, 4, 4};
		Assert.assertEquals(2, L56GAME.solution(sequence));
	}

	@Test
	public void test4() {
		int[] sequence = {1};
		Assert.assertEquals(1, L56GAME.solution(sequence));
	}

	@Test
	public void test5() {
		int[] sequence = {1, 1};
		Assert.assertEquals(1, L56GAME.solution(sequence));
	}
}
