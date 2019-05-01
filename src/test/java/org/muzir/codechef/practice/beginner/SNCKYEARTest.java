package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class SNCKYEARTest {

	@Test
	public void test1() {
		Assert.assertEquals(SNCKYEAR.HOSTED, SNCKYEAR.solution(2010));
		Assert.assertEquals(SNCKYEAR.NOT_HOSTED, SNCKYEAR.solution(2011));
		Assert.assertEquals(SNCKYEAR.NOT_HOSTED, SNCKYEAR.solution(2012));
		Assert.assertEquals(SNCKYEAR.NOT_HOSTED, SNCKYEAR.solution(2013));
		Assert.assertEquals(SNCKYEAR.NOT_HOSTED, SNCKYEAR.solution(2014));
		Assert.assertEquals(SNCKYEAR.HOSTED, SNCKYEAR.solution(2015));
		Assert.assertEquals(SNCKYEAR.HOSTED, SNCKYEAR.solution(2016));
		Assert.assertEquals(SNCKYEAR.HOSTED, SNCKYEAR.solution(2017));
		Assert.assertEquals(SNCKYEAR.NOT_HOSTED, SNCKYEAR.solution(2018));
		Assert.assertEquals(SNCKYEAR.HOSTED, SNCKYEAR.solution(2019));
	}
}
