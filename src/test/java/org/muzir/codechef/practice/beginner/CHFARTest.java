package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CHFARTest {
	@Test
	public void test() {
		assertEquals("YES", CHFAR.solution(2, "1 2"));
		assertEquals("YES", CHFAR.solution(1, "1 2"));
		assertEquals("YES", CHFAR.solution(2, "1 1"));
		assertEquals("YES", CHFAR.solution(3, "1 2"));
		assertEquals("YES", CHFAR.solution(4, "2 2"));
		assertEquals("NO", CHFAR.solution(4, "2 2 4 5 6"));
		assertEquals("YES", CHFAR.solution(3, "1 2 1 5 6"));
		assertEquals("NO", CHFAR.solution(3, "1 2 4 5 6"));
		assertEquals("YES", CHFAR.solution(4, "1 2 4 5 6"));
	}
}
