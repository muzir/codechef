package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EXAM1Test {
	@Test
	public void test() {
		assertEquals(6, EXAM1.solution("ABCDAB", "ABCDAB"));
		assertEquals(3, EXAM1.solution("DDCABCCA", "DNCBBBBA"));
		assertEquals(1, EXAM1.solution("CDD", "NDC"));
		assertEquals(1, EXAM1.solution("ABC", "ACC"));
		assertEquals(2, EXAM1.solution("ABC", "ANC"));
		assertEquals(1, EXAM1.solution("ABC", "ACC"));
	}

	@Test
	public void test1() {
		assertEquals(0, EXAM1.solution("A", "N"));
		assertEquals(0, EXAM1.solution("A", "B"));
		assertEquals(0, EXAM1.solution("AAA", "NNN"));
		assertEquals(0, EXAM1.solution("AA", "BA"));
		assertEquals(1, EXAM1.solution("AAA", "NNA"));
		assertEquals(1, EXAM1.solution("AAA", "NAB"));
		assertEquals(0, EXAM1.solution("AAAAAAAA", "BABABABA"));
		assertEquals(2, EXAM1.solution("AAAAAAAA", "AABABABA"));
		assertEquals(2, EXAM1.solution("ABC", "ABD"));
	}

	@Test
	public void test2(){
		assertEquals(1, EXAM1.solution("ABC", "ACC"));
	}
}
