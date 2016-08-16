package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FLOW013Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals("YES", FLOW013.isAnglesValid(100, 10, 70));
		Assert.assertEquals("YES", FLOW013.isAnglesValid(110, 10, 60));
		Assert.assertEquals("YES", FLOW013.isAnglesValid(100, 79, 1));
		Assert.assertEquals("NO", FLOW013.isAnglesValid(180, 0, 1));
		Assert.assertEquals("NO", FLOW013.isAnglesValid(180, 0, 1));
		Assert.assertEquals("NO", FLOW013.isAnglesValid(-170, 180, 10));
	}

}
