package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class ADASCOOLTest {
	@Test
	public void test() {
		Assert.assertEquals(ADASCOOL.NO, ADASCOOL.solution(1, 2));
		Assert.assertEquals(ADASCOOL.NO, ADASCOOL.solution(2, 1));

		Assert.assertEquals(ADASCOOL.YES, ADASCOOL.solution(2, 2));
		Assert.assertEquals(ADASCOOL.YES, ADASCOOL.solution(8, 2));
		Assert.assertEquals(ADASCOOL.YES, ADASCOOL.solution(50, 50));
		Assert.assertEquals(ADASCOOL.YES, ADASCOOL.solution(50, 49));
	}
}
