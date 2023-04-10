package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.muzir.codechef.practice.beginner.LAPIN.NO;
import static org.muzir.codechef.practice.beginner.LAPIN.YES;

public class LAPINTest {

	@Test
	public void test() {
		assertEquals(YES, LAPIN.solution("gaga"));
		assertEquals(NO, LAPIN.solution("abcde"));
		assertEquals(YES, LAPIN.solution("xyzxy"));
		assertEquals(NO, LAPIN.solution("abbaab"));
		assertEquals(NO, LAPIN.solution("ababc"));
	}
}
