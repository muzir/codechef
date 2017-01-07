package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class MOVIEWKNTest {

	@Test
	public void test() {
		String[] movieLong = { "1", "2" };
		String[] movieRating = { "2", "1" };
		Assert.assertEquals(1, MOVIEWKN.solution(movieLong, movieRating));
	}

	@Test
	public void test1() {
		String[] movieLong = { "2", "1", "4", "1" };
		String[] movieRating = { "2", "4", "1", "4" };
		Assert.assertEquals(2, MOVIEWKN.solution(movieLong, movieRating));
	}

}
