package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class COLORTest {

	@Test
	public void test() {
		Assert.assertEquals(1, COLOR.calculateMinRoomCount("RGR"));
	}

	@Test
	public void testRRR() {
		Assert.assertEquals(0, COLOR.calculateMinRoomCount("RRR"));
	}

	@Test
	public void testRGB() {
		Assert.assertEquals(2, COLOR.calculateMinRoomCount("RGB"));
	}

}
