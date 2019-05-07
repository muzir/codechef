package org.muzir.codechef.longContest.may19;

import org.junit.Assert;
import org.junit.Test;

public class MATCHSTest {
	@Test
	public void test() {
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(1, 1));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(2, 2));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(1, 3));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(155, 47));
		Assert.assertEquals(MATCHS.ARI, MATCHS.solution(7, 2));

		Assert.assertEquals(MATCHS.RICH, MATCHS.solution(6, 4));
	}
}
