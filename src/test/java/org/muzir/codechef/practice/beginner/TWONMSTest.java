package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TWONMSTest {

	@Test
	public void test_bigNumbers() {
		assertEquals(1, TWONMS.calculateIntegerDivision(1_000_000_000, 1_000_000_000, 1_000_000_000));
	}

	@Test
	public void test_basicNumbers() {
		assertEquals(22, TWONMS.calculateIntegerDivision(137, 12, 13));
		assertEquals(1, TWONMS.calculateIntegerDivision(3, 7, 1));
	}

}