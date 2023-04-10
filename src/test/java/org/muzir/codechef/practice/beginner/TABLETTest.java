package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TABLETTest {
	@Test
	public void test() {
		int[][] tabletMatrix = {{3, 4, 4}, {5, 5, 7}, {5, 2, 5}};
		int price = 6;
		assertEquals("12", TABLET.solution(tabletMatrix, price));
	}

	@Test
	public void test1() {
		int[][] tabletMatrix = {{3, 6, 8}, {5, 4, 9}};
		int price = 6;
		assertEquals(TABLET.NO_TABLET, TABLET.solution(tabletMatrix, price));
	}

	@Test
	public void test2() {
		int[][] tabletMatrix = {{5, 5, 10}};
		int price = 10;
		assertEquals("25", TABLET.solution(tabletMatrix, price));
	}
}
