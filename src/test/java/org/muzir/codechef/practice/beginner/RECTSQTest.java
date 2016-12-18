package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RECTSQTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void shouldEbobSuccess() {
		assertEquals(10, RECTSQ.ebob(10, 20));
		assertEquals(1, RECTSQ.ebob(1, 2));
		assertEquals(1, RECTSQ.ebob(1, 1));
		assertEquals(5, RECTSQ.ebob(10, 15));
		assertEquals(2, RECTSQ.ebob(4, 6));
	}

	@Test
	public void shouldPrintSquareCountSuccess() {
		assertEquals(6,RECTSQ.printSquareCount(10, 15));
		assertEquals(6,RECTSQ.printSquareCount(4, 6));
		assertEquals(1,RECTSQ.printSquareCount(1, 1));
		assertEquals(2,RECTSQ.printSquareCount(1, 2));
		assertEquals(1,RECTSQ.printSquareCount(100000, 100000));
		assertEquals(2,RECTSQ.printSquareCount(50000, 100000));
	}

}
