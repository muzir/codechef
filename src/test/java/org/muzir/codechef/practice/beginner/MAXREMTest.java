package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MAXREMTest {
	@Test
	public void test() {
		assertEquals(4, MAXREM.solution("1 2 3 4 5"));
		assertEquals(5, MAXREM.solution("5 5 5 2 3 8"));
		assertEquals(2, MAXREM.solution("3 2"));
		assertEquals(0, MAXREM.solution("2 2"));
	}
}
