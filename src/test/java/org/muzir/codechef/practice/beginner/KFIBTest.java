package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class KFIBTest {
	@Test
	public void initialCases() {
		assertEquals(9, KFIB.calculateKthFibonacci(7, 5));
		assertEquals(13, KFIB.calculateKthFibonacci(7, 4));
	}
}
