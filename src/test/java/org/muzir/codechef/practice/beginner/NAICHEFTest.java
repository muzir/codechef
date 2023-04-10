package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NAICHEFTest {
	@Test
	public void test() {
		int[] dieFaceValues = {1, 1, 1, 1, 1};
		assertEquals("1.0000000000", NAICHEF.solution(dieFaceValues, 1, 1));
	}

	@Test
	public void test1() {
		int[] dieFaceValues = {1, 2};
		assertEquals("0.2500000000", NAICHEF.solution(dieFaceValues, 1, 2));
	}
}
