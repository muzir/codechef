package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class COLORTest {

	@Test
	public void test() {
		assertEquals(1, COLOR.calculateMinRoomCount("RGR"));
	}

	@Test
	public void testRRR() {
		assertEquals(0, COLOR.calculateMinRoomCount("RRR"));
	}

	@Test
	public void testRGB() {
		assertEquals(2, COLOR.calculateMinRoomCount("RGB"));
	}

}
