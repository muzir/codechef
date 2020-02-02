package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class CFMMTest {
	@Test
	public void test() {
		Assert.assertEquals(1, CFMM.solution("cplusplusoscardeckfeehatnear"));
		Assert.assertEquals(2, CFMM.solution("codehackerchefchabydumbofe"));
		Assert.assertEquals(5, CFMM.solution("codechefchefcodefehcedoccceeohfdcodechef"));
	}

	@Test
	public void test1() {
		Assert.assertEquals(0, CFMM.solution("c"));
		Assert.assertEquals(0, CFMM.solution("aa"));
		Assert.assertEquals(0, CFMM.solution(""));
	}
}
