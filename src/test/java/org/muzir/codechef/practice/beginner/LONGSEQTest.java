package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
