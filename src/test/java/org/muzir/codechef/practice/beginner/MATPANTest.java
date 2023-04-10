package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MATPANTest {
	@Test
	public void initialCases() {
		String s = "abcdefghijklmopqrstuvwz";
		int[] valueArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
		assertEquals(63, MATPAN.calculatePangramMinCost(s, valueArray));
	}

	@Test
	public void initialCases_1() {
		String s = "thequickbrownfoxjumpsoverthelazydog";
		int[] valueArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
		assertEquals(0, MATPAN.calculatePangramMinCost(s, valueArray));
	}
}
