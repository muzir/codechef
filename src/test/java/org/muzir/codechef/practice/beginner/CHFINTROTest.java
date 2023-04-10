package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.muzir.codechef.practice.beginner.CHFINTRO.BAD_BOI;
import static org.muzir.codechef.practice.beginner.CHFINTRO.GOOD_BOI;

public class CHFINTROTest {
	@Test
	public void test() {
		assertEquals(BAD_BOI, CHFINTRO.solution(1499, 1500));
		assertEquals(GOOD_BOI, CHFINTRO.solution(1500, 1500));
		assertEquals(GOOD_BOI, CHFINTRO.solution(1501, 1500));
	}
}
