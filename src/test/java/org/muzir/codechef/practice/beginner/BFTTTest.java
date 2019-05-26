package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class BFTTTest {
	@Test
	public void test() {
		Assert.assertEquals(333, BFTT.solution("221"));
		Assert.assertEquals(1333, BFTT.solution("333"));
		Assert.assertEquals(3033, BFTT.solution("3002"));
		Assert.assertEquals(3033, BFTT.solution("3030"));
	}

	@Test
	public void test1(){
		Assert.assertEquals(4333, BFTT.solution("4092"));
		Assert.assertEquals(78766333, BFTT.solution("78765432"));
		Assert.assertEquals(3001313, BFTT.solution("3001303"));
		Assert.assertEquals(2000000333, BFTT.solution("2000000000"));
	}
}
