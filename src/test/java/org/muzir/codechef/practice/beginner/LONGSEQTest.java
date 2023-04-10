package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LONGSEQTest {

	@Test
	public void test() {
		String s = "101";
		assertEquals("Yes", LONGSEQ.solution(s));
	}

	@Test
	public void test1() {
		String s = "11";
		assertEquals("No", LONGSEQ.solution(s));
	}
}
