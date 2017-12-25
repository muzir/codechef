package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CHNGORTest {

	@Test
	public void testInitialCases() {
		int[] arr = {1, 2};
		assertEquals(3, CHNGOR.calculateMin(arr));
	}
}
