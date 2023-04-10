package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SNCKYEARTest {

	@Test
	public void test1() {
		assertEquals(SNCKYEAR.HOSTED, SNCKYEAR.solution(2010));
		assertEquals(SNCKYEAR.NOT_HOSTED, SNCKYEAR.solution(2011));
		assertEquals(SNCKYEAR.NOT_HOSTED, SNCKYEAR.solution(2012));
		assertEquals(SNCKYEAR.NOT_HOSTED, SNCKYEAR.solution(2013));
		assertEquals(SNCKYEAR.NOT_HOSTED, SNCKYEAR.solution(2014));
		assertEquals(SNCKYEAR.HOSTED, SNCKYEAR.solution(2015));
		assertEquals(SNCKYEAR.HOSTED, SNCKYEAR.solution(2016));
		assertEquals(SNCKYEAR.HOSTED, SNCKYEAR.solution(2017));
		assertEquals(SNCKYEAR.NOT_HOSTED, SNCKYEAR.solution(2018));
		assertEquals(SNCKYEAR.HOSTED, SNCKYEAR.solution(2019));
	}
}
