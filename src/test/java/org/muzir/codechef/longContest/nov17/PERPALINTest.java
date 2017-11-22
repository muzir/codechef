package org.muzir.codechef.longContest.nov17;

import org.junit.Assert;
import org.junit.Test;

public class PERPALINTest {


	@Test
	public void test_impossible_cases() {
		Assert.assertEquals(PERPALIN.IMPOSSIBLE, PERPALIN.constructPeriodicPolindrom(3, 1));
		Assert.assertEquals(PERPALIN.IMPOSSIBLE, PERPALIN.constructPeriodicPolindrom(1, 3));
		Assert.assertEquals(PERPALIN.IMPOSSIBLE, PERPALIN.constructPeriodicPolindrom(2, 2));
		Assert.assertEquals(PERPALIN.IMPOSSIBLE, PERPALIN.constructPeriodicPolindrom(7, 3));
		Assert.assertEquals(PERPALIN.IMPOSSIBLE, PERPALIN.constructPeriodicPolindrom(8, 3));
		Assert.assertEquals(PERPALIN.IMPOSSIBLE, PERPALIN.constructPeriodicPolindrom(2, 4));
	}


	@Test
	public void test_possible_cases() {
		/*Assert.assertEquals("aba", PERPALIN.constructPeriodicPolindrom(3, 3));
		Assert.assertEquals("abab", PERPALIN.constructPeriodicPolindrom(4, 2));
		Assert.assertEquals("abba", PERPALIN.constructPeriodicPolindrom(4, 4));
		Assert.assertEquals("abaaba", PERPALIN.constructPeriodicPolindrom(6, 3));*/
		//System.out.println(PERPALIN.constructPeriodicPolindrom(20, 2));
		//System.out.println(PERPALIN.constructPeriodicPolindrom(15, 3));
		//System.out.println(PERPALIN.constructPeriodicPolindrom(100000, 500));
		//System.out.println(PERPALIN.constructPeriodicPolindrom(100_000, 100_000));
		//System.out.println(PERPALIN.constructPeriodicPolindrom(4, 2));
		//System.out.println(PERPALIN.constructPeriodicPolindrom(6, 2));
		System.out.println(PERPALIN.constructPeriodicPolindrom(4, 4));
		System.out.println(PERPALIN.constructPeriodicPolindrom(2, 2));
		System.out.println(PERPALIN.constructPeriodicPolindrom(12, 2));
		System.out.println(PERPALIN.constructPeriodicPolindrom(12, 3));
		System.out.println(PERPALIN.constructPeriodicPolindrom(12, 4));
		System.out.println(PERPALIN.constructPeriodicPolindrom(12, 6));
		System.out.println(PERPALIN.constructPeriodicPolindrom(12, 12));
		//System.out.println(PERPALIN.constructPeriodicPolindrom(100000, 1));

	}
}
