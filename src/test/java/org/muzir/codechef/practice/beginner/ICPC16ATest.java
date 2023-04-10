package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ICPC16ATest {
	@Test
	public void test() {
		int[] params = {1, 2, 1, 3};
		assertEquals(ICPC16A.solution(params), "up");
	}

	@Test
	public void test1() {
		int[] params = {0, 0, 1, 0};
		assertEquals(ICPC16A.solution(params), "right");
	}

	@Test
	public void test2() {
		int[] params = {1, 2, 1, 8};
		assertEquals(ICPC16A.solution(params), "up");
	}

	@Test
	public void test3() {
		int[] params = {0, 0, 9, 0};
		assertEquals(ICPC16A.solution(params), "right");
	}

	@Test
	public void test4() {
		int[] params = {0, -1, 0, -9};
		assertEquals(ICPC16A.solution(params), "down");
	}

}
