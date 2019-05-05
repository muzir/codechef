package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class THREEFRTest {
	@Test public void test() {
		Assert.assertEquals(THREEFR.NO, THREEFR.solution(1, 1, 1));
		Assert.assertEquals(THREEFR.NO, THREEFR.solution(1000, 1, 1000));

		Assert.assertEquals(THREEFR.YES, THREEFR.solution(1, 2, 1));
		Assert.assertEquals(THREEFR.YES, THREEFR.solution(999, 1, 1000));
		Assert.assertEquals(THREEFR.YES, THREEFR.solution(999, 1000, 1));
		Assert.assertEquals(THREEFR.YES, THREEFR.solution(1, 1000, 999));
	}
}
