package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class FLOW011Test {

	@Test
	public void test() {
		Assert.assertEquals("2406", FLOW011.calculateGrossSalary("1203"));
		Assert.assertEquals("20383.16", FLOW011.calculateGrossSalary("10042"));
		Assert.assertEquals("2624", FLOW011.calculateGrossSalary("1312"));
	}
}
