package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GOODSETTest {

	@Test
	public void test_initialCases() {
		assertEquals("1", GOODSET.createGoodSet(1));
		assertEquals("1 2", GOODSET.createGoodSet(2));
		assertEquals("1 2 4", GOODSET.createGoodSet(3));
		assertEquals("1 2 4 7", GOODSET.createGoodSet(4));
		assertEquals("1 2 4 7 10", GOODSET.createGoodSet(5));
		assertEquals("1 2 4 7 10 13", GOODSET.createGoodSet(6));
		assertEquals("1 2 4 7 10 13 16", GOODSET.createGoodSet(7));
		assertEquals("1 2 4 7 10 13 16 19", GOODSET.createGoodSet(8));
		assertEquals("1 2 4 7 10 13 16 19 22", GOODSET.createGoodSet(9));
		assertEquals("1 2 4 7 10 13 16 19 22 25", GOODSET.createGoodSet(10));
	}

	@Test
	public void test_cornerCase() {
		String goodSet = GOODSET.createGoodSet(100);
		String[] arr = goodSet.split(" ");
		String lastElement = arr[arr.length - 1];
		assertEquals("295", lastElement);
	}
}