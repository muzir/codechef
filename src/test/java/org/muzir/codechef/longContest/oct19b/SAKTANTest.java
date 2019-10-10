package org.muzir.codechef.longContest.oct19b;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SAKTANTest {

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
		String[] paramArray = {"1 0"};
		assertEquals(1, SAKTAN.solution(rowCount, colCount, paramArray));
	}

	@Test
	public void test4() {
		int rowCount = 1;
		int colCount = 1;
		String[] paramArray = {"1 1"};
		assertEquals(0, SAKTAN.solution(rowCount, colCount, paramArray));
	}
}
