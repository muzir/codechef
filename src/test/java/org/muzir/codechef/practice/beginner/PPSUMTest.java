package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PPSUMTest {

	@Test
	public void test() {
		assertEquals(10, PPSUM.sum(1, 4));
		assertEquals(21, PPSUM.sum(2, 3));
		assertEquals(1, PPSUM.sum(1, 1));
		assertEquals(1, PPSUM.sum(4, 1));
		assertEquals(1, PPSUM.sum(4, 1));
		assertEquals(1186570, PPSUM.sum(4, 4));
	}

	@Test
	public void test1() {
		int intMax = Integer.MAX_VALUE;
		assertTrue(intMax > 2373140);
	}

}
