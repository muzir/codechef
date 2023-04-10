package org.muzir.codechef.longContest.jan18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class KCONTest {


	@Test
	public void testInitialCases_1() {
		assertEquals(9, KCON.calculateMaxSubArray("1 2", 3));
		assertEquals(2, KCON.calculateMaxSubArray("1 -2 1", 2));
		assertEquals(1, KCON.calculateMaxSubArray("1 -2 1 -2 -2 -2", 2));
		assertEquals(3, KCON.calculateMaxSubArray("1 -2 1 -2 -2 2", 2));
		assertEquals(12, KCON.calculateMaxSubArray("1 2 1 2", 2));
		assertEquals(60, KCON.calculateMaxSubArray("1 2 1 2", 10));
		assertEquals(3, KCON.calculateMaxSubArray("1 -2 1 -2 -2 2", 200));
		assertEquals(1, KCON.calculateMaxSubArray("1 -2 1 -2 -2 -2", 10000));
		assertEquals(1, KCON.calculateMaxSubArray("1", 1));
		assertEquals(-1, KCON.calculateMaxSubArray("-1", 1));
		assertEquals(-1, KCON.calculateMaxSubArray("-1 -2 -3 -4", 100000));
		assertEquals(9, KCON.calculateMaxSubArray("2 -1 2", 3));
		assertEquals(3, KCON.calculateMaxSubArray("2 -1 2", 1));
		assertEquals(1000000, KCON.calculateMaxSubArray("-1000000 1000000", 100000));

		assertEquals(2, KCON.calculateMaxSubArray("2 -3 2", 1));
		assertEquals(4, KCON.calculateMaxSubArray("2 -3 2", 2));
		assertEquals(5, KCON.calculateMaxSubArray("2 -3 2", 3));
		assertEquals(6, KCON.calculateMaxSubArray("2 -3 2", 4));
		assertEquals(7, KCON.calculateMaxSubArray("2 -3 2", 5));
		assertEquals(100002, KCON.calculateMaxSubArray("2 -3 2", 100000));
	}


	@Test
	public void testNegative() {
		assertEquals(-1, KCON.calculateMaxSubArray("-1 -1 -1 -1", 1));
	}

	@Test
	public void testNegativePositive() {
		assertEquals(31, KCON.calculateMaxSubArray("1 2 1 -1", 10));
		assertEquals(4, KCON.calculateMaxSubArray("1 2 1 -1", 1));
		assertEquals(7, KCON.calculateMaxSubArray("1 2 1 -1", 2));
		assertEquals(-1, KCON.calculateMaxSubArray("-1 -1 -1 -1", 10));
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
		assertEquals(10_000_000_000_000_000l, KCON.calculateMaxSubArray(s, 100000));
	}

	@Test
	public void testCalculateMaxSubArraySum() {
		assertEquals(-1, KCON.calculateMaxSubArraySum("-1 -1 -1 -1", 10));
		assertEquals(31, KCON.calculateMaxSubArraySum("1 2 1 -1", 10));
		assertEquals(2, KCON.calculateMaxSubArraySum("1 -2 1", 2));
		assertEquals(5, KCON.calculateMaxSubArraySum("2 -3 2", 3));
		assertEquals(7, KCON.calculateMaxSubArraySum("2 -3 2", 5));
		assertEquals(100002, KCON.calculateMaxSubArraySum("2 -3 2", 100000));
	}

	@Test
	public void testCalculateMaxSubArraySum_1() {
		assertEquals(9, KCON.calculateMaxSubArraySum("1 2", 3));
		assertEquals(2, KCON.calculateMaxSubArraySum("1 -2 1", 2));
		assertEquals(1, KCON.calculateMaxSubArraySum("1 -2 1 -2 -2 -2", 2));
		assertEquals(3, KCON.calculateMaxSubArraySum("1 -2 1 -2 -2 2", 2));
		assertEquals(12, KCON.calculateMaxSubArraySum("1 2 1 2", 2));
		assertEquals(60, KCON.calculateMaxSubArraySum("1 2 1 2", 10));
		assertEquals(3, KCON.calculateMaxSubArraySum("1 -2 1 -2 -2 2", 200));
		assertEquals(1, KCON.calculateMaxSubArraySum("1 -2 1 -2 -2 -2", 10000));
		assertEquals(1, KCON.calculateMaxSubArraySum("1", 1));
		assertEquals(-1, KCON.calculateMaxSubArraySum("-1", 1));
		assertEquals(-1, KCON.calculateMaxSubArraySum("-1 -2 -3 -4", 100000));
		assertEquals(9, KCON.calculateMaxSubArraySum("2 -1 2", 3));
		assertEquals(3, KCON.calculateMaxSubArraySum("2 -1 2", 1));
		assertEquals(1000000, KCON.calculateMaxSubArraySum("-1000000 1000000", 100000));

		assertEquals(2, KCON.calculateMaxSubArraySum("2 -3 2", 1));
		assertEquals(4, KCON.calculateMaxSubArraySum("2 -3 2", 2));
		assertEquals(5, KCON.calculateMaxSubArraySum("2 -3 2", 3));
		assertEquals(6, KCON.calculateMaxSubArraySum("2 -3 2", 4));
		assertEquals(7, KCON.calculateMaxSubArraySum("2 -3 2", 5));
		assertEquals(100002, KCON.calculateMaxSubArraySum("2 -3 2", 100000));
	}
}
