package org.muzir.codechef.longContest.jan18;

import org.junit.Assert;
import org.junit.Test;

public class KCONTest {


	@Test
	public void testInitialCases_1() {
		Assert.assertEquals(9, KCON.calculateMaxSubArray("1 2", 3));
		Assert.assertEquals(2, KCON.calculateMaxSubArray("1 -2 1", 2));
		Assert.assertEquals(1, KCON.calculateMaxSubArray("1 -2 1 -2 -2 -2", 2));
		Assert.assertEquals(3, KCON.calculateMaxSubArray("1 -2 1 -2 -2 2", 2));
		Assert.assertEquals(12, KCON.calculateMaxSubArray("1 2 1 2", 2));
		Assert.assertEquals(60, KCON.calculateMaxSubArray("1 2 1 2", 10));
		Assert.assertEquals(3, KCON.calculateMaxSubArray("1 -2 1 -2 -2 2", 200));
		Assert.assertEquals(1, KCON.calculateMaxSubArray("1 -2 1 -2 -2 -2", 10000));
		Assert.assertEquals(1, KCON.calculateMaxSubArray("1", 1));
		Assert.assertEquals(-1, KCON.calculateMaxSubArray("-1", 1));
		Assert.assertEquals(-1, KCON.calculateMaxSubArray("-1 -2 -3 -4", 100000));
		Assert.assertEquals(9, KCON.calculateMaxSubArray("2 -1 2", 3));
		Assert.assertEquals(3, KCON.calculateMaxSubArray("2 -1 2", 1));
		Assert.assertEquals(1000000, KCON.calculateMaxSubArray("-1000000 1000000", 100000));

		Assert.assertEquals(2, KCON.calculateMaxSubArray("2 -3 2", 1));
		Assert.assertEquals(4, KCON.calculateMaxSubArray("2 -3 2", 2));
		Assert.assertEquals(5, KCON.calculateMaxSubArray("2 -3 2", 3));
		Assert.assertEquals(6, KCON.calculateMaxSubArray("2 -3 2", 4));
		Assert.assertEquals(7, KCON.calculateMaxSubArray("2 -3 2", 5));
		Assert.assertEquals(100002, KCON.calculateMaxSubArray("2 -3 2", 100000));
	}


	@Test
	public void testNegative() {
		Assert.assertEquals(-1, KCON.calculateMaxSubArray("-1 -1 -1 -1", 1));
	}

	@Test
	public void testNegativePositive() {
		Assert.assertEquals(31, KCON.calculateMaxSubArray("1 2 1 -1", 10));
		Assert.assertEquals(4, KCON.calculateMaxSubArray("1 2 1 -1", 1));
		Assert.assertEquals(7, KCON.calculateMaxSubArray("1 2 1 -1", 2));
		Assert.assertEquals(-1, KCON.calculateMaxSubArray("-1 -1 -1 -1", 10));
	}

	@Test
	public void testCornerlCases_1() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100_000; i++) {
			sb.
					append(1000000).
					append(" ");
		}
		String s = sb.substring(0, sb.length() - 1);
		Assert.assertEquals(10_000_000_000_000_000l, KCON.calculateMaxSubArray(s, 100000));
	}

	@Test
	public void testCalculateMaxSubArraySum() {
		Assert.assertEquals(-1, KCON.calculateMaxSubArraySum("-1 -1 -1 -1", 10));
		Assert.assertEquals(31, KCON.calculateMaxSubArraySum("1 2 1 -1", 10));
		Assert.assertEquals(2, KCON.calculateMaxSubArraySum("1 -2 1", 2));
		Assert.assertEquals(5, KCON.calculateMaxSubArraySum("2 -3 2", 3));
		Assert.assertEquals(7, KCON.calculateMaxSubArraySum("2 -3 2", 5));
		Assert.assertEquals(100002, KCON.calculateMaxSubArraySum("2 -3 2", 100000));
	}

	@Test
	public void testCalculateMaxSubArraySum_1() {
		Assert.assertEquals(9, KCON.calculateMaxSubArraySum("1 2", 3));
		Assert.assertEquals(2, KCON.calculateMaxSubArraySum("1 -2 1", 2));
		Assert.assertEquals(1, KCON.calculateMaxSubArraySum("1 -2 1 -2 -2 -2", 2));
		Assert.assertEquals(3, KCON.calculateMaxSubArraySum("1 -2 1 -2 -2 2", 2));
		Assert.assertEquals(12, KCON.calculateMaxSubArraySum("1 2 1 2", 2));
		Assert.assertEquals(60, KCON.calculateMaxSubArraySum("1 2 1 2", 10));
		Assert.assertEquals(3, KCON.calculateMaxSubArraySum("1 -2 1 -2 -2 2", 200));
		Assert.assertEquals(1, KCON.calculateMaxSubArraySum("1 -2 1 -2 -2 -2", 10000));
		Assert.assertEquals(1, KCON.calculateMaxSubArraySum("1", 1));
		Assert.assertEquals(-1, KCON.calculateMaxSubArraySum("-1", 1));
		Assert.assertEquals(-1, KCON.calculateMaxSubArraySum("-1 -2 -3 -4", 100000));
		Assert.assertEquals(9, KCON.calculateMaxSubArraySum("2 -1 2", 3));
		Assert.assertEquals(3, KCON.calculateMaxSubArraySum("2 -1 2", 1));
		Assert.assertEquals(1000000, KCON.calculateMaxSubArraySum("-1000000 1000000", 100000));

		Assert.assertEquals(2, KCON.calculateMaxSubArraySum("2 -3 2", 1));
		Assert.assertEquals(4, KCON.calculateMaxSubArraySum("2 -3 2", 2));
		Assert.assertEquals(5, KCON.calculateMaxSubArraySum("2 -3 2", 3));
		Assert.assertEquals(6, KCON.calculateMaxSubArraySum("2 -3 2", 4));
		Assert.assertEquals(7, KCON.calculateMaxSubArraySum("2 -3 2", 5));
		Assert.assertEquals(100002, KCON.calculateMaxSubArraySum("2 -3 2", 100000));
	}
}
