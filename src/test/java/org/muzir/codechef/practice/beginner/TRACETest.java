package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class TRACETest {
	@Test
	public void test() {
		int[][] matrix = {{1, 2, 5}, {6, 3, 4}, {2, 7, 1}};
		Assert.assertEquals(13, TRACE.findMatrixMaxTrace(matrix));
	}

	@Test
	public void test1() {
		int[][] matrix = {{3, 4}, {5, 6}};
		Assert.assertEquals(9, TRACE.findMatrixMaxTrace(matrix));
	}

	@Test
	public void test2() {
		int[][] matrix = {{1, 2, 5}, {5, 3, 4}, {2, 7, 10}};
		Assert.assertEquals(14, TRACE.findMatrixMaxTrace(matrix));
	}

}
