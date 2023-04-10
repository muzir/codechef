package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FLOW009Test {


	@Test
	public void test() {
		assertEquals("1.000000", FLOW009.calculateTotalExpenses("1", "1"));
		assertEquals("12000.000000", FLOW009.calculateTotalExpenses("100", "120"));
		assertEquals("200.000000", FLOW009.calculateTotalExpenses("10", "20"));
		assertEquals("21600.000000", FLOW009.calculateTotalExpenses("1200", "20"));
		assertEquals("9000000000.000000", FLOW009.calculateTotalExpenses("100000", "100000"));
	}

}
