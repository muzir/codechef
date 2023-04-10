package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ADACRATest {
	@Test
	public void initialCases() {
		assertEquals(1, ADACRA.calculateMinimumStep("UUDDDUUU"));
		assertEquals(0, ADACRA.calculateMinimumStep("UUUUU"));
		assertEquals(0, ADACRA.calculateMinimumStep("DDDDD"));
		assertEquals(0, ADACRA.calculateMinimumStep("U"));
		assertEquals(0, ADACRA.calculateMinimumStep("D"));
		assertEquals(2, ADACRA.calculateMinimumStep("UUDDDUUUD"));
		assertEquals(2, ADACRA.calculateMinimumStep("UUDDDUUUDU"));
		assertEquals(6, ADACRA.calculateMinimumStep("UDUDUDUDUDUDU"));
	}
}
