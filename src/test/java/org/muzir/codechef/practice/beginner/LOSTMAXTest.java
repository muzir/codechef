package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LOSTMAXTest {

	@Test
	public void initialCases() {
		assertEquals(1, LOSTMAX.findLostMax("1 2 1"));
	}

	@Test
	public void initialCases_1() {
		assertEquals(8, LOSTMAX.findLostMax("3 1 2 8"));
	}

	@Test
	public void initialCases_2() {
		assertEquals(4, LOSTMAX.findLostMax("1 5 1 4 3 2"));
	}
}
