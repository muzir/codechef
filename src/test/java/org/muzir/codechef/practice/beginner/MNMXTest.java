package org.muzir.codechef.practice.beginner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class MNMXTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String[] parameters = { "3", "4" };
		Assert.assertEquals(3, MNMX.printMinimumCost(parameters));
	}

	@Test
	public void test1() {
		String[] parameters = { "4", "5", "2" };
		Assert.assertEquals(4, MNMX.printMinimumCost(parameters));
	}

}
