package org.muzir.codechef.longContest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RESERVOITest {

	@Test
	public void testBAAABB() {
		String input = "BAAABB";
		assertEquals("no", RESERVOI.isReservoiStable(input.toCharArray(), 2, 3));
	}

	@Test
	public void testBAABBB() {
		String input = "BAABBB";
		assertEquals("yes", RESERVOI.isReservoiStable(input.toCharArray(), 2, 3));
	}

	@Test
	public void testBAAWBB() {
		String input = "BAAWBB";
		assertEquals("no", RESERVOI.isReservoiStable(input.toCharArray(), 2, 3));
	}

	@Test
	public void test1() {
		String input = "AAAWBB";
		assertEquals("yes", RESERVOI.isReservoiStable(input.toCharArray(), 2, 3));
	}

	@Test
	public void test2() {
		String input = "BBBBWBBBB";
		assertEquals("no", RESERVOI.isReservoiStable(input.toCharArray(), 3, 3));
	}
}
