package org.muzir.codechef.longContest.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.muzir.codechef.longContest.legacy.RESERVOI;

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
		assertEquals("no", RESERVOI.isReservoiStable(input.toCharArray(), 2, 3));
	}

	@Test
	public void test2() {
		String input = "BBBBWBBBB";
		assertEquals("no", RESERVOI.isReservoiStable(input.toCharArray(), 3, 3));
	}

	@Test
	public void test3() {
		String input = "B";
		assertEquals("yes", RESERVOI.isReservoiStable(input.toCharArray(), 1, 1));
	}

	@Test
	public void test4() {
		String input = "BA";
		assertEquals("yes", RESERVOI.isReservoiStable(input.toCharArray(), 1, 2));
	}

	@Test
	public void test5() {
		String input = "BAAAA";
		assertEquals("yes", RESERVOI.isReservoiStable(input.toCharArray(), 1, 5));
	}

	@Test
	public void test6() {
		String input = "BAAAAW";
		assertEquals("no", RESERVOI.isReservoiStable(input.toCharArray(), 1, 6));
	}

	@Test
	public void test7() {
		String input = "BAAAAW";
		assertEquals("no", RESERVOI.isReservoiStable(input.toCharArray(), 2, 3));
	}

	@Test
	public void test8() {
		String input = "BAABAW";
		assertEquals("no", RESERVOI.isReservoiStable(input.toCharArray(), 2, 3));
	}

	@Test
	public void test9() {
		String input = "BAABAB";
		assertEquals("yes", RESERVOI.isReservoiStable(input.toCharArray(), 2, 3));
	}

	@Test
	public void test10() {
		String input = "WB";
		assertEquals("no", RESERVOI.isReservoiStable(input.toCharArray(), 1, 2));
	}

	@Test
	public void test11() {
		String input = "BWBBBB";
		assertEquals("yes", RESERVOI.isReservoiStable(input.toCharArray(), 2, 3));
	}
	@Test
	public void test12() {
		String input = "BWWBBBBB";
		assertEquals("yes", RESERVOI.isReservoiStable(input.toCharArray(), 2, 4));
	}
}
