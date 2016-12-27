package org.muzir.codechef.practice.beginner;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RRJOKETest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals(1, RRJOKE.calculateXOR(1));
		Assert.assertEquals(3, RRJOKE.calculateXOR(2));
		Assert.assertEquals(0, RRJOKE.calculateXOR(3));
		Assert.assertEquals(4, RRJOKE.calculateXOR(4));
	}
}
