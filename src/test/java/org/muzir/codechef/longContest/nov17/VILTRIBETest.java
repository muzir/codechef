package org.muzir.codechef.longContest.nov17;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VILTRIBETest {

	VILTRIBE.Tribes tribes;

	@Before
	public void setUp() {
		tribes = new VILTRIBE.Tribes();
	}

	@Test
	public void test_tribe_A_and_B() {
		String tribeSeries = "A..A..B...B";
		tribes.calculateTribeCount(tribeSeries);
		Assert.assertEquals(4, tribes.getACounter());
		Assert.assertEquals(5, tribes.getBCounter());
	}

	@Test
	public void test_only_tribe_A() {
		String tribeSeries = "..A..";
		tribes.calculateTribeCount(tribeSeries);
		Assert.assertEquals(1, tribes.getACounter());
		Assert.assertEquals(0, tribes.getBCounter());
	}

	@Test
	public void test_tribe_A_Between_A() {
		String tribeSeries = "A....A";
		tribes.calculateTribeCount(tribeSeries);
		Assert.assertEquals(6, tribes.getACounter());
		Assert.assertEquals(0, tribes.getBCounter());
	}


	@Test
	public void test_only_tribe_B() {
		String tribeSeries = "..B..B..B..";
		tribes.calculateTribeCount(tribeSeries);
		Assert.assertEquals(0, tribes.getACounter());
		Assert.assertEquals(7, tribes.getBCounter());
	}
}
