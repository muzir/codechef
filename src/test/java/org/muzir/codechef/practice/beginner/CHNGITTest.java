package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CHNGITTest {
	@Test
	public void test() {
		assertEquals(0,CHNGIT.solution("1 1 1 1 1"));
		assertEquals(2,CHNGIT.solution("9 8 1 8"));
		assertEquals(1,CHNGIT.solution("1 9"));
	}
}
