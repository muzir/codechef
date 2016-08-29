package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SPALNUMTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals(45, SPALNUM.calculatePalindromic(1, 10));
		Assert.assertEquals(272, SPALNUM.calculatePalindromic(123, 150));
		Assert.assertEquals(50040, SPALNUM.calculatePalindromic(1, 1000));
		Assert.assertEquals(50045040, SPALNUM.calculatePalindromic(1, 100000));
	}

}
