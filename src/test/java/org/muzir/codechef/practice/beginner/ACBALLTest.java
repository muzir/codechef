package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.*;

import org.junit.Test;

public class ACBALLTest {

	@Test
	public void test() {
		assertEquals('B', ACBALL.xor('W', 'W'));
		assertEquals('B', ACBALL.xor('B', 'W'));
		assertEquals('B', ACBALL.xor('W', 'B'));
		assertEquals('W', ACBALL.xor('B', 'B'));
		assertEquals(1, ACBALL.xor('B', 'A'));
	}

	@Test
	public void test1() {
		assertEquals("BWBW", ACBALL.solution("WBWB", "WBBB"));
		assertEquals("BB", ACBALL.solution("WW", "BB"));
	}

}
