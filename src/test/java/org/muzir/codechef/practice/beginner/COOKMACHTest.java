package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class COOKMACHTest {

	@Test
	public void test() {
		assertEquals(0, COOKMACH.calculateOperationCount(1, 1));
		assertEquals(1, COOKMACH.calculateOperationCount(2, 4));
		assertEquals(4, COOKMACH.calculateOperationCount(3, 8));
		assertEquals(2, COOKMACH.calculateOperationCount(4, 16));
		assertEquals(2, COOKMACH.calculateOperationCount(4, 1));
		assertEquals(2, COOKMACH.calculateOperationCount(1, 4));
		assertEquals(10, COOKMACH.calculateOperationCount(25, 64));
	}

}
