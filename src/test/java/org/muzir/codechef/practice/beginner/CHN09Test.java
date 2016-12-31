package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class CHN09Test {

	private static final String colourCode_a = "a";
	private static final String colourCode_b = "b";

	@Test
	public void test() {
		String s = "aba";
		Assert.assertEquals(0, CHN09.sizeOfColour(null, colourCode_a));
		Assert.assertEquals(0, CHN09.sizeOfColour(null, colourCode_b));
		Assert.assertEquals(0, CHN09.sizeOfColour("", colourCode_a));
		Assert.assertEquals(0, CHN09.sizeOfColour("", colourCode_b));
		Assert.assertEquals(2, CHN09.sizeOfColour(s, colourCode_a));
		Assert.assertEquals(1, CHN09.sizeOfColour(s, colourCode_b));
	}

}
