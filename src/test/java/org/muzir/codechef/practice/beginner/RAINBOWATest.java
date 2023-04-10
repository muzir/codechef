package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RAINBOWATest {

	@Test
	public void testPositive() {
		assertEquals(RAINBOWA.yes, RAINBOWA.checkRainbowArray("1 2 3 4 5 6 7 6 5 4 3 2 1", 13));
	}

	@Test
	public void testInitialCases() {

		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 4 5 6 7 6 5 4 2 1", 11));

		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 5 6 8 6 5 4 3 2 1", 13));
		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 5 6 7 6 5 4 3 1 1", 13));
		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("2 1 3 4 5 6 7 6 5 4 3 1 2", 13));
		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("2 2 3 4 5 6 7 6 5 4 3 2 2", 13));

		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 5 6 7 6 5 4 3 2 1 1", 14));

		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 5 6 7 8 6 5 4 3 2 1", 14));
		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 5 5 6 7 8 6 5 4 3 2 1", 15));
		assertEquals(RAINBOWA.yes, RAINBOWA.checkRainbowArray("1 2 3 4 5 5 6 7 6 5 5 4 3 2 1", 15));
		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("8 2 3 4 5 5 6 7 6 5 5 4 3 2 8", 15));
		assertEquals(RAINBOWA.yes, RAINBOWA.checkRainbowArray("1 1 2 3 4 5 6 7 6 5 4 3 2 1 1", 15));
		assertEquals(RAINBOWA.yes, RAINBOWA.checkRainbowArray("1 2 3 4 5 6 7 7 7 6 5 4 3 2 1", 15));

		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 4 5 8 7 8 6 5 4 4 3 2 1", 16));

		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 5 5 6 7 7 7 8 6 5 4 3 2 1", 17));
		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 5 5 6 8 7 8 6 5 5 4 3 2 1", 17));
		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 5 6 6 7 6 7 6 6 5 4 3 2 1", 17));

		assertEquals(RAINBOWA.yes, RAINBOWA.checkRainbowArray("1 2 3 4 4 5 6 6 6 7 6 6 6 5 4 4 3 2 1", 19));
		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("9 2 3 4 4 5 6 6 6 7 6 6 6 5 4 4 3 2 9", 19));
		assertEquals(RAINBOWA.yes, RAINBOWA.checkRainbowArray("1 2 3 4 4 5 6 6 7 7 7 6 6 5 4 4 3 2 1", 19));
		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 4 5 8 6 6 7 6 6 8 5 4 4 3 2 1", 19));

	}

	@Test
	public void testCornerCases() {
		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 5 5 7 5 5 4 3 2 1", 13));
		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 5 5 7 5 5 4 3 2 1", 13));
		assertEquals(RAINBOWA.yes, RAINBOWA.checkRainbowArray("1 2 3 4 5 5 5 6 7 6 5 5 5 4 3 2 1", 17));
		assertEquals(RAINBOWA.yes, RAINBOWA.checkRainbowArray("1 2 3 4 5 6 7 7 6 5 4 3 2 1", 14));
	}

	@Test
	public void problematic_case() {
		assertEquals(RAINBOWA.no, RAINBOWA.checkRainbowArray("1 2 3 4 5 6 7 8 6 5 4 3 2 1", 14));
	}
}
