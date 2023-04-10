package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class THREEFRTest {
	@Test public void test() {
		assertEquals(THREEFR.NO, THREEFR.solution(1, 1, 1));
		assertEquals(THREEFR.NO, THREEFR.solution(1000, 1, 1000));

		assertEquals(THREEFR.YES, THREEFR.solution(1, 2, 1));
		assertEquals(THREEFR.YES, THREEFR.solution(999, 1, 1000));
		assertEquals(THREEFR.YES, THREEFR.solution(999, 1000, 1));
		assertEquals(THREEFR.YES, THREEFR.solution(1, 1000, 999));
	}
}
