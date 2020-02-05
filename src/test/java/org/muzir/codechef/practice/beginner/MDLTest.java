package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class MDLTest {
	@Test
	public void test() {
		Assert.assertEquals("2 5", MDL.solution("2 5 3"));
		Assert.assertEquals("102 7", MDL.solution("38 9 102 10 96 7 46 28 88 13"));
	}
}
