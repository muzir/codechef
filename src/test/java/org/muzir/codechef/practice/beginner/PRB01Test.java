package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PRB01Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertFalse(PRB01.isPrime(1));
		Assert.assertFalse(PRB01.isPrime(10));
		Assert.assertFalse(PRB01.isPrime(4));
		Assert.assertFalse(PRB01.isPrime(9));
		Assert.assertTrue(PRB01.isPrime(10000));
		
		Assert.assertTrue(PRB01.isPrime(2));
		Assert.assertTrue(PRB01.isPrime(3));
		Assert.assertTrue(PRB01.isPrime(5));
		
		
	}

}
