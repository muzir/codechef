package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CLIPLXTest {
	@Test
	public void test() {
		assertEquals(5, CLIPLX.solution(10, 5));
		assertEquals(0, CLIPLX.solution(1, 5));
	}
}
