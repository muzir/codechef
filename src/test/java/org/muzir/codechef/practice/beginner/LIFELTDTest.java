package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LIFELTDTest {
	@Test
	public void test() {
		String[] matrix = {"laz", "lla", "aaa"};
		assertEquals("yes", LIFELTD.solution(matrix));
	}

	@Test
	public void test1() {
		String[] matrix = {"ala", "lla", "aaa"};
		assertEquals("no", LIFELTD.solution(matrix));
	}

	@Test
	public void test2() {
		String[] matrix = {"lll", "lll", "lll"};
		assertEquals("yes", LIFELTD.solution(matrix));
	}
}
