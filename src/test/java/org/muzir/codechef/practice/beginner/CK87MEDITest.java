package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class CK87MEDITest {
	@Test
	public void testInitialCases() {
		Assert.assertEquals(7, CK87MEDI.chefEmploymentTest("4 7", 1));
		Assert.assertEquals(9, CK87MEDI.chefEmploymentTest("9 2 8 6", 3));
		Assert.assertEquals(1, CK87MEDI.chefEmploymentTest("6 1 1 1 1", 2));
		Assert.assertEquals(100, CK87MEDI.chefEmploymentTest("6 1 1 1 1", 50));
		Assert.assertEquals(100, CK87MEDI.chefEmploymentTest("6", 2));
		Assert.assertEquals(6, CK87MEDI.chefEmploymentTest("6", 0));
	}
}
