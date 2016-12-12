package org.muzir.codechef.practice.beginner;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AMR15ATest {

	AMR15A a;

	private static String READY_FOR_BATTLE = "READY FOR BATTLE";
	private static String NOT_READY = "NOT READY";

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		String[] str1 = { "1", "2", "3" };
		Assert.assertEquals(NOT_READY, a.printBattle(str1));
	}

	@Test
	public void test2() {
		String[] str1 = { "1", "2", "3", "4", "6" };
		Assert.assertEquals(READY_FOR_BATTLE, a.printBattle(str1));
	}

	@Test
	public void test3() {
		String[] str1 = { "1", "2", "3", "34", "100", "1", "0" };
		Assert.assertEquals(READY_FOR_BATTLE, a.printBattle(str1));
	}

}
