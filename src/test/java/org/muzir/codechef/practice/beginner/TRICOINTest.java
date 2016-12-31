package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class TRICOINTest {

	@Test
	public void test() {
		Assert.assertEquals(1, TRICOIN.fibonacci(1));
		Assert.assertEquals(3, TRICOIN.fibonacci(2));
		Assert.assertEquals(6, TRICOIN.fibonacci(3));
		Assert.assertEquals(10, TRICOIN.fibonacci(4));
		Assert.assertEquals(15, TRICOIN.fibonacci(5));
	}

}
