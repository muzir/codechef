package org.muzir.codechef.longContest.jan18;

import org.junit.Assert;
import org.junit.Test;

public class MAXSCTest {
	@Test
	public void testInitialCases() {
		int[][] a = {{2, 5, 6}, {1, 2, 3}, {4, 4, 4}};
		Assert.assertEquals(9, MAXSC.calculateMaxSum(a));
	}

	@Test
	public void testInitialCases_1() {
		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		Assert.assertEquals(18, MAXSC.calculateMaxSum(a));
	}

	@Test
	public void testInitialCases_2() {
		int[][] a = {{1, 2}, {1, 1}};
		Assert.assertEquals(-1, MAXSC.calculateMaxSum(a));
	}

	@Test
	public void testInitialCases_3() {
		int[][] a = {{1, 2, 3}, {1, 2, 4}, {1, 2, 4}};
		Assert.assertEquals(11, MAXSC.calculateMaxSum(a));
	}

	@Test
	public void test1() {
		for (int i = 700; i > 0; i--) {
			for (int j = 1000000000; j > 999999300; j--) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}
}
