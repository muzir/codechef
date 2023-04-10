package org.muzir.codechef.longContest.jan20b;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CHFDORATest {
	@Test
	@Disabled
	public void test() {
		String[] matrix = {"2 1 2", "1 1 1", "2 1 2"};
		assertEquals(10, CHFDORA.solution(matrix, 3, 3));
	}
}
