package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class TABLETTest {
	@Test
	public void test() {
		int[][] tabletMatrix = {{3, 4, 4}, {5, 5, 7}, {5, 2, 5}};
		int price = 6;
		Assert.assertEquals("12", TABLET.solution(tabletMatrix, price));
	}

	@Test
	public void test1() {
		int[][] tabletMatrix = {{3, 6, 8}, {5, 4, 9}};
		int price = 6;
		Assert.assertEquals(TABLET.NO_TABLET, TABLET.solution(tabletMatrix, price));
	}

	@Test
	public void test2() {
		int[][] tabletMatrix = {{5, 5, 10}};
		int price = 10;
		Assert.assertEquals("25", TABLET.solution(tabletMatrix, price));
	}
}
