package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class MAGICHFTest {
	@Test
	public void test() {
		MAGICHF.Pair[] pairs = {new MAGICHF.Pair(4, 2), new MAGICHF.Pair(3, 4), new MAGICHF.Pair(3, 2), new MAGICHF.Pair(1, 2)};
		Assert.assertEquals(1, MAGICHF.solution(2, pairs));
	}
}
