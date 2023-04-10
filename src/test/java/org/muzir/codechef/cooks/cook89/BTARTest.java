package org.muzir.codechef.cooks.cook89;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BTARTest {

	@Test
	public void initialCases() {
		assertEquals(3, BTAR.calculateMinSteps("1 2 3 1 2 3 8"));
		assertEquals(-1, BTAR.calculateMinSteps("1 2"));
		assertEquals(1, BTAR.calculateMinSteps("1 4 3"));
		assertEquals(-1, BTAR.calculateMinSteps("7 1 3"));
		assertEquals(1, BTAR.calculateMinSteps("8 4 8 8 8 8 8 8 8 1 3"));
		assertEquals(3, BTAR.calculateMinSteps("1000000000 1 1 1 1"));
		assertEquals(2, BTAR.calculateMinSteps("4 4 1 2 1"));
		assertEquals(-1, BTAR.calculateMinSteps("1 1 1 1 1"));
		assertEquals(6, BTAR.calculateMinSteps("1 1 1 1 1 1 1 1"));
		assertEquals(4, BTAR.calculateMinSteps("1 1 1 1 3 3 2"));
		assertEquals(2, BTAR.calculateMinSteps("3 3 2"));
	}
}
