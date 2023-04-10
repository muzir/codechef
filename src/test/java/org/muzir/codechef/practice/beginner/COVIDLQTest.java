package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class COVIDLQTest {
	@Test
	public void test() {
		assertEquals("NO", COVIDLQ.solution("1 0 1"));
		assertEquals("YES", COVIDLQ.solution("1 0 0 0 0 0 1"));
		assertEquals("NO", COVIDLQ.solution("0 1 0 0 0 0 0 1 0 0 1"));
		assertEquals("YES", COVIDLQ.solution("1 0 0 0 0 0 0 0 0 0"));
		assertEquals("NO", COVIDLQ.solution("1 1 0 0 0 0 0 0 0 0"));
		assertEquals("YES", COVIDLQ.solution("0 1 0 0 0 0 0 1"));
		assertEquals("NO", COVIDLQ.solution("0 1 0 0 0 0 1"));
		assertEquals("YES", COVIDLQ.solution("0 1 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0"));
		assertEquals("NO", COVIDLQ.solution("0 1 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 1"));
	}
}
