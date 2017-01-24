package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TTENISTest {

	@Test
	public void test() {
		String s = "0101111111111";
		assertEquals("WIN", TTENIS.solution(s));
	}

	@Test
	public void test1() {
		String s = "11100000000000";
		assertEquals("LOSE", TTENIS.solution(s));
	}

	@Test
	public void test2() {
		String s = "11111111110000000000101000";
		assertEquals("LOSE", TTENIS.solution(s));
	}

	@Test
	public void test3() {
		String s = "11111111110000000000101011";
		assertEquals("WIN", TTENIS.solution(s));
	}

	@Test
	public void test4() {
		String s = "111111111111111111111111111111111111111111111111111111";
		assertEquals("WIN", TTENIS.solution(s));
	}

	@Test
	public void test5() {
		String s = "10101010101010101010101010101010101010100011111111111110000001111";
		assertEquals("LOSE", TTENIS.solution(s));
	}

	@Test
	public void test6() {
		String s = "10101010101010101011";
		assertEquals("WIN", TTENIS.solution(s));
	}
}
