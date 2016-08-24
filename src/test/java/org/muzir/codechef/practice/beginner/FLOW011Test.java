package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FLOW011Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals(2406, Flow011.calculateGrossSalary("1203"), Double.MIN_VALUE);
		Assert.assertEquals(20383.2, Flow011.calculateGrossSalary("10042"), Double.MAX_VALUE);
		Assert.assertEquals(1312, Flow011.calculateGrossSalary("2624"), Double.MAX_VALUE);
		Assert.assertEquals(200, Flow011.calculateGrossSalary("100"), Double.MAX_VALUE);
		Assert.assertEquals(198500, Flow011.calculateGrossSalary("100000"), Double.MAX_VALUE);
		Assert.assertEquals(2, Flow011.calculateGrossSalary("1"), Double.MAX_VALUE);
	}

}
