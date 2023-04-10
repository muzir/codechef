package org.muzir.codechef.longContest.feb18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CHEFCHRTest {
	@Test
	public void initialCases() {
		assertEquals("lovely 2", CHEFCHR.checkLovely("ifchefisgoodforchess"));
		assertEquals("lovely 3", CHEFCHR.checkLovely("fehcaskchefechohisvoice"));
		assertEquals("lovely 1", CHEFCHR.checkLovely("hecfisaniceperson"));
		assertEquals("lovely 3", CHEFCHR.checkLovely("letscallchefthefch"));
		assertEquals("normal", CHEFCHR.checkLovely("chooseaprogrammer"));
	}
}
