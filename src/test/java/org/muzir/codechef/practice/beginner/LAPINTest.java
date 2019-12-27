package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

import static org.muzir.codechef.practice.beginner.LAPIN.NO;
import static org.muzir.codechef.practice.beginner.LAPIN.YES;

public class LAPINTest {

	@Test
	public void test() {
		Assert.assertEquals(YES, LAPIN.solution("gaga"));
		Assert.assertEquals(NO, LAPIN.solution("abcde"));
		Assert.assertEquals(YES, LAPIN.solution("xyzxy"));
		Assert.assertEquals(NO, LAPIN.solution("abbaab"));
		Assert.assertEquals(NO, LAPIN.solution("ababc"));
	}
}
