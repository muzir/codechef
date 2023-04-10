package org.muzir.codechef.longContest.oct19b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class S10ETest {
	@Test
	public void test1() {
		assertEquals(2, S10E.solution("375 750 723 662 647 656 619"));
		assertEquals(1, S10E.solution("375"));
	}

	@Test
	public void test2() {
		assertEquals(1, S10E.solution("375 375 375 375 375 375 375"));
	}
}
