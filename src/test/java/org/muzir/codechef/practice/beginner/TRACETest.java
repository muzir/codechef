package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class TRACETest {
	@Test
	public void test() {
		int[][] matrix = {{1, 2, 5}, {6, 3, 4}, {2, 7, 1}};
		Assert.assertEquals(13, TRACE.findMatrixMaxTrace(matrix,3));
	}
}
