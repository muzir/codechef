package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TRICOINTest {

	@Test
	public void test() {
		assertEquals(1, TRICOIN.fibonacci(1));
		assertEquals(3, TRICOIN.fibonacci(2));
		assertEquals(6, TRICOIN.fibonacci(3));
		assertEquals(10, TRICOIN.fibonacci(4));
		assertEquals(15, TRICOIN.fibonacci(5));
	}

}
