package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CHN15ATest {
	@Test
	public void test1() {
		System.out.println(105 % 7);
	}

	@Test
	public void test() {
		assertEquals(1, CHN15A.solution(10, "2 4 1 35 1"));
		assertEquals(3, CHN15A.solution(7, "0 7 1 35"));
		assertEquals(2, CHN15A.solution(7, "0 7 1 100000"));
		assertEquals(0, CHN15A.solution(7, "1 2 1 100000"));
		assertEquals(15, CHN15A.solution(100, "5 12 19 5 12 19 5 12 19 5 12 19 5 12 19"));
	}
}
