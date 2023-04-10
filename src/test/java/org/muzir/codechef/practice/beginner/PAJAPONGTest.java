package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PAJAPONGTest {
	@Test
	public void test() {
		assertEquals(PAJAPONG.PAJA, PAJAPONG.solution("1 3 3"));
		assertEquals(PAJAPONG.CHEF, PAJAPONG.solution("5 7 2"));
		assertEquals(PAJAPONG.PAJA, PAJAPONG.solution("38657 76322 564"));
	}
}
