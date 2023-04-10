package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CHEFAPARTest {

	@Test
	public void testInitialCases() {
		assertEquals(0, CHEFAPAR.calculateDues("1 1"));
		assertEquals(2200, CHEFAPAR.calculateDues("0 0"));
		assertEquals(2300, CHEFAPAR.calculateDues("0 1 0"));
		assertEquals(1200, CHEFAPAR.calculateDues("0 1"));
		assertEquals(1100, CHEFAPAR.calculateDues("1 1 0"));
		assertEquals(2300, CHEFAPAR.calculateDues("1 0 0 1"));
	}
}
