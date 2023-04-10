package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MDLTest {
	@Test
	public void test() {
		assertEquals("2 5", MDL.solution("2 5 3"));
		assertEquals("102 7", MDL.solution("38 9 102 10 96 7 46 28 88 13"));
	}
}
