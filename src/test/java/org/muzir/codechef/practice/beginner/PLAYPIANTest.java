package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PLAYPIANTest {
	@Test
	public void test() {
		assertEquals(PLAYPIAN.YES, PLAYPIAN.solution("AB"));
		assertEquals(PLAYPIAN.YES, PLAYPIAN.solution("ABBA"));
		assertEquals(PLAYPIAN.NO, PLAYPIAN.solution("ABAABB"));
		assertEquals(PLAYPIAN.NO, PLAYPIAN.solution("ABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABAA"));
		assertEquals(PLAYPIAN.NO, PLAYPIAN.solution("AA"));
	}
}
