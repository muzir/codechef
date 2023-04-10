package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BRLADDERTest {

	@Test
	public void should_Initial_Case() {
		assertEquals(BRLADDER.printRoadExist(1, 4), "NO");
		assertEquals(BRLADDER.printRoadExist(4, 3), "YES");
		assertEquals(BRLADDER.printRoadExist(5, 4), "NO");
		assertEquals(BRLADDER.printRoadExist(10, 12), "YES");
		assertEquals(BRLADDER.printRoadExist(1, 3), "YES");
		assertEquals(BRLADDER.printRoadExist(999999999, 1000000000), "YES");
		assertEquals(BRLADDER.printRoadExist(17, 2384823), "NO");
	}
}