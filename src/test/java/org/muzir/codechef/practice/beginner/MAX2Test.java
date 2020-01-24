package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MAX2Test {
	@Test
	public void test() {
		assertEquals(2, MAX2.solution("10100"));
		assertEquals(0, MAX2.solution("10101"));
		assertEquals(1, MAX2.solution("10110"));
		assertEquals(0, MAX2.solution("1"));
		assertEquals(2, MAX2.solution("100"));
		assertEquals(3, MAX2.solution("1000"));
		assertEquals(1, MAX2.solution("1010"));
	}

	@Test
	public void tes1t() {
		assertEquals(2, MAX2.solution1("10100"));
		assertEquals(0, MAX2.solution1("10101"));
		assertEquals(1, MAX2.solution1("10110"));
		assertEquals(0, MAX2.solution1("1"));
		assertEquals(2, MAX2.solution1("100"));
		assertEquals(3, MAX2.solution1("1000"));
		assertEquals(1, MAX2.solution1("1010"));
	}
}
