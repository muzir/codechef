package org.muzir.codechef.practice.beginner;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FRUITSTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void shouldValidCases() {
		Assert.assertEquals(0,FRUITS.getMinimumDifference(3,4,1));
		Assert.assertEquals(2,FRUITS.getMinimumDifference(5,2,1));
		Assert.assertEquals(0,FRUITS.getMinimumDifference(3,4,3));
		Assert.assertEquals(0,FRUITS.getMinimumDifference(0,0,0));
		Assert.assertEquals(0,FRUITS.getMinimumDifference(1,1,1));
		Assert.assertEquals(0,FRUITS.getMinimumDifference(100,100,100));
		Assert.assertEquals(0,FRUITS.getMinimumDifference(90,5,85));
		Assert.assertEquals(1,FRUITS.getMinimumDifference(90,5,84));
		Assert.assertEquals(0,FRUITS.getMinimumDifference(90,5,99));
		Assert.assertEquals(94,FRUITS.getMinimumDifference(100,1,5));
		Assert.assertEquals(94,FRUITS.getMinimumDifference(1,100,5));
	}

}
