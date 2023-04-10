package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TRACETest {
	@Test
	public void test() {
		int[][] matrix = {{1, 2, 5}, {6, 3, 4}, {2, 7, 1}};
		assertEquals(13, TRACE.findMatrixMaxTrace(matrix));
	}

	@Test
	public void test1() {
		int[][] matrix = {{3, 4}, {5, 6}};
		assertEquals(9, TRACE.findMatrixMaxTrace(matrix));
	}

	@Test
	public void test2() {
		int[][] matrix = {{1, 2, 5}, {5, 3, 4}, {2, 7, 10}};
		assertEquals(14, TRACE.findMatrixMaxTrace(matrix));
	}

}
