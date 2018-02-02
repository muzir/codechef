package org.muzir.codechef.longContest.legacy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.muzir.codechef.longContest.legacy.CATSDOGS;

public class CATSDOGSTest {

	@Test
	public void test() {
		assertEquals("no", CATSDOGS.shepherd(1, 1, 7));
		assertEquals("yes", CATSDOGS.shepherd(1, 1, 8));
		assertEquals("yes", CATSDOGS.shepherd(1, 1, 4));
		assertEquals("no", CATSDOGS.shepherd(1, 1, 2));
	}

	@Test
	public void test1() {
		assertEquals("yes", CATSDOGS.shepherd(0, 0, 0));
	}

	@Test
	public void test2() {
		assertEquals("yes", CATSDOGS.shepherd(100, 100, 400));
		assertEquals("yes", CATSDOGS.shepherd(100, 100, 404));
		assertEquals("yes", CATSDOGS.shepherd(100, 100, 408));
		assertEquals("yes", CATSDOGS.shepherd(100, 100, 800));
		assertEquals("no", CATSDOGS.shepherd(100, 100, 804));
		assertEquals("no", CATSDOGS.shepherd(100, 100, 808));
	}

	@Test
	public void test3() {
		assertEquals("yes", CATSDOGS.shepherd(150, 50, 400));
		assertEquals("yes", CATSDOGS.shepherd(150, 50, 404));
		assertEquals("yes", CATSDOGS.shepherd(150, 50, 408));
		assertEquals("yes", CATSDOGS.shepherd(150, 50, 800));
		assertEquals("no", CATSDOGS.shepherd(150, 50, 804));
	}

}
