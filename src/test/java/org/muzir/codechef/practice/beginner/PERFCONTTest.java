package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PERFCONTTest {
	@Test
	public void testInitialCase() {
		assertEquals("yes",PERFCONT.checkBalancer("10 1 100",3,100));
		assertEquals("no",PERFCONT.checkBalancer("11 1 100",3,100));
		assertEquals("no",PERFCONT.checkBalancer("10 1 10",3,100));
		assertEquals("yes",PERFCONT.checkBalancer("10 1 50",3,100));
		assertEquals("no",PERFCONT.checkBalancer("50 50 50 50",4,100));
		assertEquals("no",PERFCONT.checkBalancer("1 1 1 1",4,100));
	}
}
