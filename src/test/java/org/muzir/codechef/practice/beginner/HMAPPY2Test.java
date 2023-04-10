package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HMAPPY2Test {
	@Test
	@Disabled
	public void test() {
		assertEquals("Win", HMAPPY2.solution("6 2 3 3"));
		assertEquals("Lose", HMAPPY2.solution("2 2 3 3"));
		assertEquals("Lose", HMAPPY2.solution("1 1 1 1"));
		assertEquals("Lose", HMAPPY2.solution("1000 2 2 1"));
		assertEquals("Lose", HMAPPY2.solution("1000000000000000000 2 2 1"));
	}

	@Test
	public void test1() {
		assertEquals("Win", HMAPPY2.solution1("6 2 3 3"));
		assertEquals("Lose", HMAPPY2.solution1("2 2 3 3"));
		assertEquals("Lose", HMAPPY2.solution1("1 1 1 1"));
		assertEquals("Lose", HMAPPY2.solution1("1000 2 2 1"));
		assertEquals("Lose", HMAPPY2.solution1("1000000000000000000 2 2 1"));
	}
}
