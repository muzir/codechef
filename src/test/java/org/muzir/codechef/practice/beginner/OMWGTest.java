package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OMWGTest {

	@Test
	public void test() {
		assertEquals(4, OMWG.solution(2, 2));
		assertEquals(12, OMWG.solution(3, 3));
		assertEquals(7, OMWG.solution(2, 3));
	}

	@Test
	public void test1() {
		assertEquals(7, OMWG.solution(2, 3));
	}

	@Test
	public void test2() {
		assertEquals(12, OMWG.solution(3, 3));
	}
}
