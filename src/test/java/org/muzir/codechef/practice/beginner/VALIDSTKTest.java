package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VALIDSTKTest {
	@Test
	public void testValid() {
		assertEquals("Valid", VALIDSTK.solution("1 1 0 0 1"));
	}

	@Test
	public void testInvalid() {
		assertEquals("Invalid", VALIDSTK.solution("1 0 0 1 1"));
	}
}
