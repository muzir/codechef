package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ELEVSTRSTest {

	@Test
	public void initialCases() {
		assertEquals("Elevator", ELEVSTRS.selectRoute(5, 10, 15));
		assertEquals("Stairs", ELEVSTRS.selectRoute(2, 10, 14));
		assertEquals("Stairs", ELEVSTRS.selectRoute(7, 14, 10));
	}

}