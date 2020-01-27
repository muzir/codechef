package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class MAXREMTest {
	@Test
	public void test() {
		Assert.assertEquals(4, MAXREM.solution("1 2 3 4 5"));
		Assert.assertEquals(5, MAXREM.solution("5 5 5 2 3 8"));
		Assert.assertEquals(2, MAXREM.solution("3 2"));
		Assert.assertEquals(0, MAXREM.solution("2 2"));
	}
}
