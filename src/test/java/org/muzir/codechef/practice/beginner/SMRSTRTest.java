package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SMRSTRTest {
	@Test
	public void testInitialCases() {
		int[] d = {2, 3};
		int[] q = {5, 100, 8};
		assertEquals("0 16 1", SMRSTR.findSmartStrategy(2, 3, d, q));
	}

	@Test
	public void testInitialCases1() {
		int[] d = {2, 2, 2};
		int[] q = {16, 8};
		assertEquals("2 1", SMRSTR.findSmartStrategy(3, 2, d, q));
	}

	@Test
	public void testInitialCases2() {
		int[] d = {2, 2, 2};
		int[] q = {16, 8};
		assertEquals("2 1", SMRSTR.findSmartStrategy(3, 2, d, q));
	}

	@Test
	public void testInitialCases3() {
		int[] d = {-2, 3};
		int[] q = {10};
		assertEquals("-2", SMRSTR.findSmartStrategy(2, 1, d, q));
	}
}
