package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PLAYSTRTest {
	@Test
	public void test() {
		assertEquals(PLAYSTR.YES, PLAYSTR.solution("11000","01001"));
		assertEquals(PLAYSTR.NO, PLAYSTR.solution("110","001"));
	}
}
