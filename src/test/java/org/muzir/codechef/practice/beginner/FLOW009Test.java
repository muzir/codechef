package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FLOW009Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals("1.000000", FLOW009.calculateTotalExpenses("1", "1"));
		Assert.assertEquals("12000.000000", FLOW009.calculateTotalExpenses("100", "120"));
		Assert.assertEquals("200.000000", FLOW009.calculateTotalExpenses("10", "20"));
		Assert.assertEquals("21600.000000", FLOW009.calculateTotalExpenses("1200", "20"));
		Assert.assertEquals("9000000000.000000", FLOW009.calculateTotalExpenses("100000", "100000"));
	}

}
