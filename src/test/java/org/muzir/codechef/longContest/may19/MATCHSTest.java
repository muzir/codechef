package org.muzir.codechef.longContest.may19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MATCHSTest {

	@Test
	public void test4() {
		assertEquals(MATCHS.RICH, MATCHS.solution(68, 48));
	}

	@Test
	public void test() {
		assertEquals(MATCHS.ARI, MATCHS.solution(1, 1));
		assertEquals(MATCHS.ARI, MATCHS.solution(2, 2));
		assertEquals(MATCHS.ARI, MATCHS.solution(1, 3));
		assertEquals(MATCHS.ARI, MATCHS.solution(155, 47));
		assertEquals(MATCHS.ARI, MATCHS.solution(7, 2));
		assertEquals(MATCHS.ARI, MATCHS.solution(8, 2));
		assertEquals(MATCHS.ARI, MATCHS.solution(8, 4));
		assertEquals(MATCHS.ARI, MATCHS.solution(9, 4));
		assertEquals(MATCHS.ARI, MATCHS.solution(17, 4));

		assertEquals(MATCHS.RICH, MATCHS.solution(6, 4));
		assertEquals(MATCHS.RICH, MATCHS.solution(68, 48));
		assertEquals(MATCHS.RICH, MATCHS.solution(21, 17));
	}

	@Test
	public void test1() {
		for (int i = 1; i < 1000; i++) {
			assertEquals(MATCHS.RICH, MATCHS.solution(2 * i, 3 * i));
			assertEquals(MATCHS.RICH, MATCHS.solution(7 * i, 5 * i));

			assertEquals(MATCHS.ARI, MATCHS.solution(2 * i, 4 * i));
			assertEquals(MATCHS.ARI, MATCHS.solution(i, i));
			assertEquals(MATCHS.ARI, MATCHS.solution(7 * i, 3 * i));

			assertEquals(MATCHS.ARI, MATCHS.solution(1 * i, 1 * i));
			assertEquals(MATCHS.ARI, MATCHS.solution(2 * i, 2 * i));
			assertEquals(MATCHS.ARI, MATCHS.solution(1 * i, 3 * i));
			assertEquals(MATCHS.ARI, MATCHS.solution(155 * i, 47 * i));
			assertEquals(MATCHS.ARI, MATCHS.solution(7 * i, 2 * i));
			assertEquals(MATCHS.ARI, MATCHS.solution(8 * i, 2 * i));
			assertEquals(MATCHS.ARI, MATCHS.solution(8 * i, 4 * i));
			assertEquals(MATCHS.ARI, MATCHS.solution(9 * i, 4 * i));
			assertEquals(MATCHS.ARI, MATCHS.solution(17 * i, 4 * i));

			assertEquals(MATCHS.RICH, MATCHS.solution(6 * i, 4 * i));
			assertEquals(MATCHS.RICH, MATCHS.solution(68 * i, 48 * i));
			assertEquals(MATCHS.RICH, MATCHS.solution(21 * i, 17 * i));
		}
	}

	@Test
	public void test2() {
		assertEquals(MATCHS.RICH, MATCHS.solution(15, 10));
		assertEquals(MATCHS.RICH, MATCHS.solution(16, 10));

		assertEquals(MATCHS.ARI, MATCHS.solution(17, 10));
		assertEquals(MATCHS.ARI, MATCHS.solution(18, 10));
		assertEquals(MATCHS.ARI, MATCHS.solution(19, 10));
	}
}
