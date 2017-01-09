package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SUBINCTest {

	@Test
	public void test() {
		assertEquals("1", SUBINC.permutation(1));
		assertEquals("1", SUBINC.permutation(2));
	}

	@Test
	public void test1() {
		assertEquals("3", SUBINC.permutation(3));
		assertEquals("6", SUBINC.permutation(4));
	}

	@Test
	public void test2() {
		assertEquals("4999950000", SUBINC.permutation(100000));
	}

}
