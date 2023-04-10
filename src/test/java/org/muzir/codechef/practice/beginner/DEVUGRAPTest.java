package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DEVUGRAPTest {

	@Test
	public void test() {
		int k = 7;
		assertEquals(3, DEVUGRAP.returnMinGrapesAddOrRemove(18, k));
		assertEquals(2, DEVUGRAP.returnMinGrapesAddOrRemove(16, k));
		assertEquals(3, DEVUGRAP.returnMinGrapesAddOrRemove(10, k));
	}

	@Test
	public void test1() {
		int k = 2;
		assertEquals(1, DEVUGRAP.returnMinGrapesAddOrRemove(3, k));
		assertEquals(1, DEVUGRAP.returnMinGrapesAddOrRemove(5, k));
	}

	@Test
	public void test2() {
		int k = 23;
		assertEquals(11, DEVUGRAP.returnMinGrapesAddOrRemove(80, k));
		assertEquals(8, DEVUGRAP.returnMinGrapesAddOrRemove(61, k));
		assertEquals(6, DEVUGRAP.returnMinGrapesAddOrRemove(75, k));
		assertEquals(21, DEVUGRAP.returnMinGrapesAddOrRemove(2, k));
	}

	@Test
	public void test3() {
		int k = 750000000;
		assertEquals(250000000, DEVUGRAP.returnMinGrapesAddOrRemove(1000000000, k));
		assertEquals(250000000, DEVUGRAP.returnMinGrapesAddOrRemove(500000000, k));
	}

	@Test
	public void test4() {
		int k = 5;
		assertEquals(4, DEVUGRAP.returnMinGrapesAddOrRemove(1, k));
	}

}
