package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ICL1902Test {
	@Test
	public void test() {
		assertEquals(1, ICL1902.solution(1));
		assertEquals(1, ICL1902.solution(16));
		assertEquals(2, ICL1902.solution(85));
		assertEquals(4, ICL1902.solution(114));
		assertEquals(5, ICL1902.solution(1000));
	}
}
