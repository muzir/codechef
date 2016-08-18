package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GDOGTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals(4, GDOG.maxRemainder(19, 5));
		Assert.assertEquals(2, GDOG.maxRemainder(11, 3));
		Assert.assertEquals(1, GDOG.maxRemainder(5, 2));
		Assert.assertEquals(0, GDOG.maxRemainder(100000, 1));
		Assert.assertEquals(0, GDOG.maxRemainder(100000, 2));
		Assert.assertEquals(1, GDOG.maxRemainder(100000, 3));
		Assert.assertEquals(1, GDOG.maxRemainder(100000, 5));
		Assert.assertEquals(3, GDOG.maxRemainder(63, 7));
	}

}
