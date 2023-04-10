package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.muzir.codechef.practice.beginner.SPLST.NO;
import static org.muzir.codechef.practice.beginner.SPLST.YES;

public class SPLSTTest {

	@Test
	public void test() {
		assertEquals(YES, SPLST.solution("1 2 3 2 4"));
		assertEquals(NO, SPLST.solution("3 2 5 6 5"));
		assertEquals(YES, SPLST.solution("2 4 2 6 2"));
		assertEquals(NO, SPLST.solution("6 5 2 12 1"));
	}
}
