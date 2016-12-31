package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class DEVUGRAPTest {

	@Test
	public void test() {
		int k = 7;
		Assert.assertEquals(3, DEVUGRAP.returnMinGrapesAddOrRemove(18, k));
		Assert.assertEquals(2, DEVUGRAP.returnMinGrapesAddOrRemove(16, k));
		Assert.assertEquals(3, DEVUGRAP.returnMinGrapesAddOrRemove(10, k));
	}

	@Test
	public void test1() {
		int k = 2;
		Assert.assertEquals(1, DEVUGRAP.returnMinGrapesAddOrRemove(3, k));
		Assert.assertEquals(1, DEVUGRAP.returnMinGrapesAddOrRemove(5, k));
	}

	@Test
	public void test2() {
		int k = 23;
		Assert.assertEquals(11, DEVUGRAP.returnMinGrapesAddOrRemove(80, k));
		Assert.assertEquals(8, DEVUGRAP.returnMinGrapesAddOrRemove(61, k));
		Assert.assertEquals(6, DEVUGRAP.returnMinGrapesAddOrRemove(75, k));
		Assert.assertEquals(21, DEVUGRAP.returnMinGrapesAddOrRemove(2, k));
	}

	@Test
	public void test3() {
		int k = 750000000;
		Assert.assertEquals(250000000, DEVUGRAP.returnMinGrapesAddOrRemove(1000000000, k));
		Assert.assertEquals(250000000, DEVUGRAP.returnMinGrapesAddOrRemove(500000000, k));
	}

	@Test
	public void test4() {
		int k = 5;
		Assert.assertEquals(4, DEVUGRAP.returnMinGrapesAddOrRemove(1, k));
	}

}
