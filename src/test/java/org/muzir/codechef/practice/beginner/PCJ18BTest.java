package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class PCJ18BTest {
	@Test
	public void test() {
		Assert.assertEquals(10, PCJ18B.solution(3));
		Assert.assertEquals(120, PCJ18B.solution(8));
		Assert.assertEquals(167167000, PCJ18B.solution(1000));
	}
}
