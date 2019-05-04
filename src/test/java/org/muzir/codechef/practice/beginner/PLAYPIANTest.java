package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class PLAYPIANTest {
	@Test
	public void test() {
		Assert.assertEquals(PLAYPIAN.YES, PLAYPIAN.solution("AB"));
		Assert.assertEquals(PLAYPIAN.YES, PLAYPIAN.solution("ABBA"));
		Assert.assertEquals(PLAYPIAN.NO, PLAYPIAN.solution("ABAABB"));
		Assert.assertEquals(PLAYPIAN.NO, PLAYPIAN.solution("ABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABAA"));
		Assert.assertEquals(PLAYPIAN.NO, PLAYPIAN.solution("AA"));
	}
}
