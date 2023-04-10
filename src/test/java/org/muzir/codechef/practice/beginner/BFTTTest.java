package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BFTTTest {
	@Test
	public void test() {
		assertEquals(333, BFTT.solution("221"));
		assertEquals(1333, BFTT.solution("333"));
		assertEquals(3033, BFTT.solution("3002"));
		assertEquals(3033, BFTT.solution("3030"));
	}

	@Test
	public void test1(){
		assertEquals(4333, BFTT.solution("4092"));
		assertEquals(78766333, BFTT.solution("78765432"));
		assertEquals(3001313, BFTT.solution("3001303"));
		assertEquals(2000000333, BFTT.solution("2000000000"));
	}
}
