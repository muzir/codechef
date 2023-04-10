package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CK87MEDITest {
	@Test
	public void testInitialCases() {
		assertEquals(7, CK87MEDI.chefEmploymentTest("4 7", 1));
		assertEquals(9, CK87MEDI.chefEmploymentTest("9 2 8 6", 3));
		assertEquals(1, CK87MEDI.chefEmploymentTest("6 1 1 1 1", 2));
		assertEquals(100, CK87MEDI.chefEmploymentTest("6 1 1 1 1", 50));
		assertEquals(100, CK87MEDI.chefEmploymentTest("6", 2));
		assertEquals(6, CK87MEDI.chefEmploymentTest("6", 0));
	}
}
