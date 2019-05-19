package org.muzir.codechef.longContest.may19;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WTBTRTest {
	@Test
	public void test() {
		int[][] matrix = {{0, 0}, {0, 1}, {0, -1}};
		Assert.assertEquals(BigDecimal.valueOf(0.5), WTBTR.solution(matrix));
	}
}
