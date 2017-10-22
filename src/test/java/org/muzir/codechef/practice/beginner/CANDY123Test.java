package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CANDY123Test {

	@Test
	public void testInitialCases() {
		assertEquals("Bob", CANDY123.getWinner(3, 2));
		assertEquals("Limak", CANDY123.getWinner(4, 2));
		assertEquals("Limak", CANDY123.getWinner(1, 1));
		assertEquals("Bob", CANDY123.getWinner(1, 2));
		assertEquals("Bob", CANDY123.getWinner(1, 3));
		assertEquals("Limak", CANDY123.getWinner(9, 3));
		assertEquals("Limak", CANDY123.getWinner(9, 11));
		assertEquals("Bob", CANDY123.getWinner(9, 12));
		assertEquals("Bob", CANDY123.getWinner(9, 1000));
		assertEquals("Bob", CANDY123.getWinner(8, 11));
	}
}