package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CHEFSUMTest {
	@Test
	public void test_initialCases() {
		assertEquals(1, CHEFSUM.returnMinIndex("1 2 3"));
		assertEquals(2, CHEFSUM.returnMinIndex("2 1 3 1"));
		assertEquals(1, CHEFSUM.returnMinIndex("2 100000 4 4323 883 324 5 4 3 2"));
	}
}