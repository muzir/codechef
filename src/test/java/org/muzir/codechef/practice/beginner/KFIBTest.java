package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class KFIBTest {
	@Test
	public void initialCases() {
		Assert.assertEquals(9, KFIB.calculateKthFibonacci(7, 5));
		Assert.assertEquals(13, KFIB.calculateKthFibonacci(7, 4));
	}
}
