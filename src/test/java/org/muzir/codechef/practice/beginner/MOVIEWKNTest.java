package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MOVIEWKNTest {

	@Test
	public void test() {
		String[] movieLong = { "1", "2" };
		String[] movieRating = { "2", "1" };
		assertEquals(1, MOVIEWKN.solution(movieLong, movieRating));
	}

	@Test
	public void test1() {
		String[] movieLong = { "2", "1", "4", "1" };
		String[] movieRating = { "2", "4", "1", "4" };
		assertEquals(2, MOVIEWKN.solution(movieLong, movieRating));
	}

}
