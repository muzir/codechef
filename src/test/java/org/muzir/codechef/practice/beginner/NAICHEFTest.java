package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class NAICHEFTest {
	@Test
	public void test() {
		int[] dieFaceValues = {1, 1, 1, 1, 1};
		Assert.assertEquals("1.0000000000", NAICHEF.solution(dieFaceValues, 1, 1));
	}

	@Test
	public void test1() {
		int[] dieFaceValues = {1, 2};
		Assert.assertEquals("0.2500000000", NAICHEF.solution(dieFaceValues, 1, 2));
	}
}
