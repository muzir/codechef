package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CHOPRTTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEqual() {
		Assert.assertEquals("=", Choprt.printRelation(10, 10));
		Assert.assertEquals("=", Choprt.printRelation(1000000001, 1000000001));
		Assert.assertEquals("=", Choprt.printRelation(1, 1));
	}

	@Test
	public void testFirstGreater() {
		Assert.assertEquals("≻", Choprt.printRelation(11, 10));
		Assert.assertEquals("≻", Choprt.printRelation(1000000001, 1000000000));
		Assert.assertEquals("≻", Choprt.printRelation(2, 1));
	}

	@Test
	public void testSecondGreater() {
		Assert.assertEquals("≺", Choprt.printRelation(11, 20));
		Assert.assertEquals("≺", Choprt.printRelation(1000000000, 1000000001));
		Assert.assertEquals("≺", Choprt.printRelation(1, 2));
	}

}
