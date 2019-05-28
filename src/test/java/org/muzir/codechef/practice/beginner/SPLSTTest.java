package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

import static org.muzir.codechef.practice.beginner.SPLST.NO;
import static org.muzir.codechef.practice.beginner.SPLST.YES;

public class SPLSTTest {

	@Test
	public void test() {
		Assert.assertEquals(YES, SPLST.solution("1 2 3 2 4"));
		Assert.assertEquals(NO, SPLST.solution("3 2 5 6 5"));
		Assert.assertEquals(YES, SPLST.solution("2 4 2 6 2"));
		Assert.assertEquals(NO, SPLST.solution("6 5 2 12 1"));
	}
}
