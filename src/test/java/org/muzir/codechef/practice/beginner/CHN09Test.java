package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CHN09Test {

	private static final String colourCode_a = "a";
	private static final String colourCode_b = "b";

	@Test
	public void test() {
		String s = "aba";
		assertEquals(0, CHN09.sizeOfColour(null, colourCode_a));
		assertEquals(0, CHN09.sizeOfColour(null, colourCode_b));
		assertEquals(0, CHN09.sizeOfColour("", colourCode_a));
		assertEquals(0, CHN09.sizeOfColour("", colourCode_b));
		assertEquals(2, CHN09.sizeOfColour(s, colourCode_a));
		assertEquals(1, CHN09.sizeOfColour(s, colourCode_b));
	}

}
