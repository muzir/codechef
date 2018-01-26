package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class STRLBPTest {
	@Test
	public void initialCases() {
		Assert.assertEquals(STRLBP.UNIFORM, STRLBP.checkUniform("00000000"));
		Assert.assertEquals(STRLBP.NON_UNIFORM, STRLBP.checkUniform("10101010"));
		Assert.assertEquals(STRLBP.UNIFORM, STRLBP.checkUniform("10000001"));
		Assert.assertEquals(STRLBP.NON_UNIFORM, STRLBP.checkUniform("10010011"));
		Assert.assertEquals(STRLBP.NON_UNIFORM, STRLBP.checkUniform("10000010"));
		Assert.assertEquals(STRLBP.UNIFORM, STRLBP.checkUniform("00000001"));
	}
}
