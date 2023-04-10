package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GOODBADTest {
	@Test
	public void initialCases() {
		assertEquals(GOODBAD.CHEF, GOODBAD.findMessageSource("frauD", 5, 1));
		assertEquals(GOODBAD.BROTHER, GOODBAD.findMessageSource("FRAUD", 5, 1));
		assertEquals(GOODBAD.BOTH, GOODBAD.findMessageSource("Life", 4, 4));
		assertEquals(GOODBAD.NONE, GOODBAD.findMessageSource("sTRAWBerry", 10, 4));
	}
}
