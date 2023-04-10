package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BRACKETSTest {

	@Test
	public void should_findMaxBalanced() {
		String s = "()((()()))";
		assertEquals(3, BRACKETS.findMaxBalance(s));
	}

	@Test
	public void should_generateBalancedSequence() {
		assertEquals("(((", BRACKETS.generateBalancedSequence(3, "("));
		assertEquals(")))", BRACKETS.generateBalancedSequence(3, ")"));
	}

}
