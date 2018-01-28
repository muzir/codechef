package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class SPAMCLASTest {
	@Test
	public void initialCases() {
		int[] ws = {1};
		int[] bs = {2};
		Assert.assertEquals("1 1", SPAMCLAS.calculateSpamNumbers(1, 2, ws, bs));
	}

	@Test
	public void initialCases_1() {
		int[] ws = {2, 2};
		int[] bs = {4, 3};
		Assert.assertEquals("0 4", SPAMCLAS.calculateSpamNumbers(1, 4, ws, bs));
	}

	@Test
	public void initialCases_2() {
		int[] ws = {2, 2, 5};
		int[] bs = {4, 2, 4};
		Assert.assertEquals("999999999 0", SPAMCLAS.calculateSpamNumbers(2, 1000000000, ws, bs));
	}
}
