package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class BFTTTest {
	@Test
	public void test() {
		Assert.assertEquals(333, BFTT.solution("221"));
		Assert.assertEquals(1333, BFTT.solution("333"));
		Assert.assertEquals(3033, BFTT.solution("3002"));
	}
}
