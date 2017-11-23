package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class TWONMSTest {

	@Test
	public void test_bigNumbers() {
		Assert.assertEquals(1, TWONMS.calculateIntegerDivision(1_000_000_000, 1_000_000_000, 1_000_000_000));
	}

	@Test
	public void test_basicNumbers() {
		Assert.assertEquals(22, TWONMS.calculateIntegerDivision(137, 12, 13));
		Assert.assertEquals(1, TWONMS.calculateIntegerDivision(3, 7, 1));
	}

}