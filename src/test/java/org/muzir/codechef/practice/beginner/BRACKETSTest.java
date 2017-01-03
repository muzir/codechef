package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class BRACKETSTest {

	@Test
	public void should_findMaxBalanced() {
		String s = "()((()()))";
		Assert.assertEquals(3, BRACKETS.findMaxBalance(s));
	}

	@Test
	public void should_generateBalancedSequence() {
		Assert.assertEquals("(((", BRACKETS.generateBalancedSequence(3, "("));
		Assert.assertEquals(")))", BRACKETS.generateBalancedSequence(3, ")"));
	}

}
