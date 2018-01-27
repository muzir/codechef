package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class SPAMCLASTest {
	@Test
	public void initialCases() {
		int[] ws = {1};
		int[] bs = {2};
		Assert.assertEquals("1 2",SPAMCLAS.calculateSpamNumbers(1, 2, ws, bs));
	}
}
