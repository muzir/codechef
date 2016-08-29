package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FLOW014Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals("10", FLOW014.gradeSteel(53, 0.6, 5602));
		Assert.assertEquals("9", FLOW014.gradeSteel(51, 0.6, 0));
		Assert.assertEquals("9", FLOW014.gradeSteel(10000, 0, 0));
		Assert.assertEquals("8", FLOW014.gradeSteel(49, 0.6, 5601));
		Assert.assertEquals("8", FLOW014.gradeSteel(0, 0, 10000));
		Assert.assertEquals("7", FLOW014.gradeSteel(10000, 10000, 10000));
		Assert.assertEquals("6", FLOW014.gradeSteel(0, 0, 0));
		Assert.assertEquals("6", FLOW014.gradeSteel(45, 0, 4500));
		Assert.assertEquals("5", FLOW014.gradeSteel(50, 0.7, 5600));
		Assert.assertEquals("5", FLOW014.gradeSteel(0, 10000, 0));
		Assert.assertEquals("5", FLOW014.gradeSteel(1, 1, 1));
		Assert.assertEquals("5", FLOW014.gradeSteel(1, 1, 1));

	}

}
