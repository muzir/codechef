package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FLOW005Test {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		Assert.assertEquals(1, FLOW005.calculate(1, 100));
		Assert.assertEquals(1, FLOW005.calculate(2, 100));
		Assert.assertEquals(1, FLOW005.calculate(5, 100));
		Assert.assertEquals(1, FLOW005.calculate(10, 100));
		Assert.assertEquals(1, FLOW005.calculate(50, 100));
		Assert.assertEquals(1, FLOW005.calculate(100, 100));
		Assert.assertEquals(10, FLOW005.calculate(1000, 100));
		Assert.assertEquals(10, FLOW005.calculate(10000, 1000000));
		
	}

}
