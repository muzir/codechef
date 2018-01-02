package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LISDIGITTest {
	@Test
	public void test_initial_cases() {
		assertEquals("1", LISDIGIT.removeEmptyLines(LISDIGIT.removeEmptyLines("1")));
		assertEquals("12", LISDIGIT.removeEmptyLines(LISDIGIT.removeEmptyLines("1 2")));
		assertEquals("11", LISDIGIT.removeEmptyLines(LISDIGIT.removeEmptyLines("1 1")));
		assertEquals("1221", LISDIGIT.removeEmptyLines(LISDIGIT.removeEmptyLines("1 2 2 1")));
		assertEquals("1221324", LISDIGIT.removeEmptyLines(LISDIGIT.removeEmptyLines("1 2 2 1 3 2 4")));
	}
}
