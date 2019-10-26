package org.muzir.codechef.longContest.oct19b;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class SAKTANTest {

	@Before
	public void setUp() {
		SAKTAN.cache = new HashMap<>(2);
	}

	@Test
	public void test1() {
		int rowCount = 2;
		int colCount = 2;
		String[] paramArray = {"1 1", "1 2", "2 1"};
		assertEquals(2, SAKTAN.solution(rowCount, colCount, paramArray));
	}

	@Test
	public void test2() {
		int rowCount = 2;
		int colCount = 2;
		String[] paramArray = {"1 1"};
		assertEquals(2, SAKTAN.solution(rowCount, colCount, paramArray));
	}

	@Test
	public void test3() {
		int rowCount = 1;
		int colCount = 1;
		String[] paramArray = {"1 1"};
		assertEquals(0, SAKTAN.solution(rowCount, colCount, paramArray));
	}

	@Test
	public void test4() {
		int rowCount = 1;
		int colCount = 1;
		String[] paramArray = {"1 1"};
		assertEquals(0, SAKTAN.solution(rowCount, colCount, paramArray));
	}

	@Test
	public void testCache() {
		int rowCount = 2;
		int colCount = 2;
		String[] paramArray = {"1 1", "1 2", "2 1"};
		assertEquals(2, SAKTAN.solution(rowCount, colCount, paramArray));
		assertEquals(2, SAKTAN.solution(rowCount, colCount, paramArray));
	}
}
