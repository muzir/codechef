package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FLOW011Test {

	@Test
	public void test() {
		assertEquals("2406", FLOW011.calculateGrossSalary("1203"));
		assertEquals("20383.16", FLOW011.calculateGrossSalary("10042"));
		assertEquals("2624", FLOW011.calculateGrossSalary("1312"));
	}
}
