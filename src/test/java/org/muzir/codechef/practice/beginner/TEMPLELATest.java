package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TEMPLELATest {
	@Test
	public void testInitialCases() {
		assertEquals(TEMPLELA.yes, TEMPLELA.checkTempleLand("1 2 3 2 1"));
		assertEquals(TEMPLELA.no, TEMPLELA.checkTempleLand("2 3 4 5 4 3 2"));
		assertEquals(TEMPLELA.no, TEMPLELA.checkTempleLand("1 2 3 4 3"));
		assertEquals(TEMPLELA.no, TEMPLELA.checkTempleLand("1 3 5 3 1"));
		assertEquals(TEMPLELA.yes, TEMPLELA.checkTempleLand("1 2 3 4 3 2 1"));
		assertEquals(TEMPLELA.no, TEMPLELA.checkTempleLand("1 2 3 2"));
		assertEquals(TEMPLELA.no, TEMPLELA.checkTempleLand("1 2 2 1"));
	}

	@Test
	public void cornerCases(){
		assertEquals(TEMPLELA.no, TEMPLELA.checkTempleLand("1 2 3 4 5 6 7 8 9 9 9 8 7 6 5 4 3 2 1"));
		assertEquals(TEMPLELA.yes, TEMPLELA.checkTempleLand("1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1"));
		assertEquals(TEMPLELA.no, TEMPLELA.checkTempleLand("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26"));
	}
}
