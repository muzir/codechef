package org.muzir.codechef.longContest.may19;

import org.junit.Assert;
import org.junit.Test;

public class MATCHSTest {

	@Test
	public void test4() {
		Assert.assertEquals(MATCHS.RICH, MATCHS.solution(68, 48));
	}

	@Test
	public void test() {
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(1, 1));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(2, 2));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(1, 3));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(155, 47));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(7, 2));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(8, 2));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(8, 4));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(9, 4));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(17, 4));

		Assert.assertEquals(MATCHS.RICH, MATCHS.solution(6, 4));
		Assert.assertEquals(MATCHS.RICH, MATCHS.solution(68, 48));
		Assert.assertEquals(MATCHS.RICH, MATCHS.solution(21, 17));
	}

	@Test
	public void test1() {
		for (int i = 1; i < 1000; i++) {
			Assert.assertEquals(MATCHS.RICH, MATCHS.solution(2 * i, 3 * i));
			Assert.assertEquals(MATCHS.RICH, MATCHS.solution(7 * i, 5 * i));

			Assert.assertEquals(MATCHS.ARI, MATCHS.solution(2 * i, 4 * i));
			Assert.assertEquals(MATCHS.ARI, MATCHS.solution(i, i));
			Assert.assertEquals(MATCHS.ARI, MATCHS.solution(7 * i, 3 * i));

			Assert.assertEquals(MATCHS.ARI, MATCHS.solution(1 * i, 1 * i));
			Assert.assertEquals(MATCHS.ARI, MATCHS.solution(2 * i, 2 * i));
			Assert.assertEquals(MATCHS.ARI, MATCHS.solution(1 * i, 3 * i));
			Assert.assertEquals(MATCHS.ARI, MATCHS.solution(155 * i, 47 * i));
			Assert.assertEquals(MATCHS.ARI, MATCHS.solution(7 * i, 2 * i));
			Assert.assertEquals(MATCHS.ARI, MATCHS.solution(8 * i, 2 * i));
			Assert.assertEquals(MATCHS.ARI, MATCHS.solution(8 * i, 4 * i));
			Assert.assertEquals(MATCHS.ARI, MATCHS.solution(9 * i, 4 * i));
			Assert.assertEquals(MATCHS.ARI, MATCHS.solution(17 * i, 4 * i));

			Assert.assertEquals(MATCHS.RICH, MATCHS.solution(6 * i, 4 * i));
			Assert.assertEquals(MATCHS.RICH, MATCHS.solution(68 * i, 48 * i));
			Assert.assertEquals(MATCHS.RICH, MATCHS.solution(21 * i, 17 * i));
		}
	}

	@Test
	public void test2() {
		Assert.assertEquals(MATCHS.RICH, MATCHS.solution(15, 10));
		Assert.assertEquals(MATCHS.RICH, MATCHS.solution(16, 10));

		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(17, 10));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(18, 10));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(19, 10));
	}
}
