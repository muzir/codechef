package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class BRLADDERTest {

	@Test
	public void should_Initial_Case() {
		Assert.assertEquals(BRLADDER.printRoadExist(1, 4), "NO");
		Assert.assertEquals(BRLADDER.printRoadExist(4, 3), "YES");
		Assert.assertEquals(BRLADDER.printRoadExist(5, 4), "NO");
		Assert.assertEquals(BRLADDER.printRoadExist(10, 12), "YES");
		Assert.assertEquals(BRLADDER.printRoadExist(1, 3), "YES");
		Assert.assertEquals(BRLADDER.printRoadExist(999999999, 1000000000), "YES");
		Assert.assertEquals(BRLADDER.printRoadExist(17, 2384823), "NO");
	}
}