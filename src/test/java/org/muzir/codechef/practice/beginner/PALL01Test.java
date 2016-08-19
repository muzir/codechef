package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PALL01Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertTrue(PALL01.isPolindrome("1111"));
		Assert.assertTrue(PALL01.isPolindrome("111"));
		Assert.assertTrue(PALL01.isPolindrome("1"));
		Assert.assertTrue(PALL01.isPolindrome("9999"));
		Assert.assertTrue(PALL01.isPolindrome("121"));
		Assert.assertTrue(PALL01.isPolindrome("00"));
		
		Assert.assertFalse(PALL01.isPolindrome("9990"));
		Assert.assertFalse(PALL01.isPolindrome("12"));
	}

}
