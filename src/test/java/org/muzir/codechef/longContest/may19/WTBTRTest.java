package org.muzir.codechef.longContest.may19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WTBTRTest {
	@Test
	public void test() {
		int[][] matrix = {{0, 0}, {0, 1}, {0, -1}};
		assertEquals(BigDecimal.valueOf(0.5), WTBTR.solution(matrix));
	}
}
