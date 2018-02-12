package org.muzir.codechef.longContest.feb18;

import org.junit.Assert;
import org.junit.Test;

public class CHEFCHRTest {
	@Test
	public void initialCases() {
		Assert.assertEquals("lovely 2", CHEFCHR.checkLovely("ifchefisgoodforchess"));
		Assert.assertEquals("lovely 3", CHEFCHR.checkLovely("fehcaskchefechohisvoice"));
		Assert.assertEquals("lovely 1", CHEFCHR.checkLovely("hecfisaniceperson"));
		Assert.assertEquals("lovely 3", CHEFCHR.checkLovely("letscallchefthefch"));
		Assert.assertEquals("normal", CHEFCHR.checkLovely("chooseaprogrammer"));
	}
}
