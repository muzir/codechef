package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class L56GAMETest {
	@Test
	public void test() {
		int[] sequence = {7, 4, 3, 2, 6};
		assertEquals(1, L56GAME.solution(sequence));
	}

	@Test
	public void test1() {
		int[] sequence = {1, 2};
		assertEquals(2, L56GAME.solution(sequence));
	}

	@Test
	public void test2() {
		int[] sequence = {1, 1, 1, 1, 4, 4, 4};
		assertEquals(1, L56GAME.solution(sequence));
	}

	@Test
	public void test3() {
		int[] sequence = {1, 1, 1, 4, 4, 4};
		assertEquals(2, L56GAME.solution(sequence));
	}

	@Test
	public void test4() {
		int[] sequence = {1};
		assertEquals(1, L56GAME.solution(sequence));
	}

	@Test
	public void test5() {
		int[] sequence = {1, 1};
		assertEquals(1, L56GAME.solution(sequence));
	}
}
