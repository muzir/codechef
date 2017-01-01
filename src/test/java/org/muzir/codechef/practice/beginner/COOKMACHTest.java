package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class COOKMACHTest {

	@Test
	public void test() {
		Assert.assertEquals(0, COOKMACH.calculateOperationCount(1, 1));
		Assert.assertEquals(1, COOKMACH.calculateOperationCount(2, 4));
		Assert.assertEquals(4, COOKMACH.calculateOperationCount(3, 8));
		Assert.assertEquals(2, COOKMACH.calculateOperationCount(4, 16));
		Assert.assertEquals(2, COOKMACH.calculateOperationCount(4, 1));
		Assert.assertEquals(2, COOKMACH.calculateOperationCount(1, 4));
		Assert.assertEquals(10, COOKMACH.calculateOperationCount(25, 64));
	}

}
