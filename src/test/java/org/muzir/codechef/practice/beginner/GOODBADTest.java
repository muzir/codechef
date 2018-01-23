package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class GOODBADTest {
	@Test
	public void initialCases() {
		Assert.assertEquals(GOODBAD.CHEF, GOODBAD.findMessageSource("frauD", 5, 1));
		Assert.assertEquals(GOODBAD.BROTHER, GOODBAD.findMessageSource("FRAUD", 5, 1));
		Assert.assertEquals(GOODBAD.BOTH, GOODBAD.findMessageSource("Life", 4, 4));
		Assert.assertEquals(GOODBAD.NONE, GOODBAD.findMessageSource("sTRAWBerry", 10, 4));
	}
}
