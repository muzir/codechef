package org.muzir.codechef.longContest.nov17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PERPALINTest {


	@Test
	public void test_impossible_cases() {
		assertEquals(PERPALIN.IMPOSSIBLE, PERPALIN.constructPeriodicPolindrom(3, 1));
		assertEquals(PERPALIN.IMPOSSIBLE, PERPALIN.constructPeriodicPolindrom(1, 3));
		assertEquals(PERPALIN.IMPOSSIBLE, PERPALIN.constructPeriodicPolindrom(2, 2));
		assertEquals(PERPALIN.IMPOSSIBLE, PERPALIN.constructPeriodicPolindrom(7, 3));
		assertEquals(PERPALIN.IMPOSSIBLE, PERPALIN.constructPeriodicPolindrom(8, 3));
		assertEquals(PERPALIN.IMPOSSIBLE, PERPALIN.constructPeriodicPolindrom(2, 4));
	}


	@Test
	public void test_possible_cases() {
		/*assertEquals("aba", PERPALIN.constructPeriodicPolindrom(3, 3));
		assertEquals("abab", PERPALIN.constructPeriodicPolindrom(4, 2));
		assertEquals("abba", PERPALIN.constructPeriodicPolindrom(4, 4));
		assertEquals("abaaba", PERPALIN.constructPeriodicPolindrom(6, 3));*/
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
