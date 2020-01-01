package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CVTest {
	@Test
	public void test() {
		assertEquals(3, CV.solution("bazeci"));
		assertEquals(1, CV.solution("abu"));
		assertEquals(0, CV.solution("o"));
	}
}
