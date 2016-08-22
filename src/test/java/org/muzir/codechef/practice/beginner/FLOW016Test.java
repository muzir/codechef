package org.muzir.codechef.practice.beginner;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FLOW016Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGcd() {
		Assert.assertEquals(1, FLOW016.gcd(120, 11));
		Assert.assertEquals(1, FLOW016.gcd(10213, 312));
		Assert.assertEquals(1, FLOW016.gcd(10, 3));
		Assert.assertEquals(4, FLOW016.gcd(12, 8));
		Assert.assertEquals(1, FLOW016.gcd(1, 1));
		Assert.assertEquals(2, FLOW016.gcd(2, 2));
		Assert.assertEquals(1000000, FLOW016.gcd(1000000, 1000000));
		Assert.assertEquals(1, FLOW016.gcd(1000000, 999999));
	}

	@Test
	public void testLcd() {
		Assert.assertEquals(new BigInteger("1320"), FLOW016.lcd(120, 11, 2));
		Assert.assertEquals(new BigInteger("3186456"), FLOW016.lcd(10213, 312, 2));
		Assert.assertEquals(new BigInteger("30"), FLOW016.lcd(10, 3, 2));
		Assert.assertEquals(new BigInteger("999999000000"), FLOW016.lcd(1000000, 999999, 2));
		Assert.assertEquals(new BigInteger("1"), FLOW016.lcd(1, 1, 2));
		Assert.assertEquals(new BigInteger("2"), FLOW016.lcd(2, 2, 2));
	}

}
