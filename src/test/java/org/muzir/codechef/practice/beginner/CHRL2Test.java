package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author erhun.baycelik
 *
 */
public class CHRL2Test {

	@Test
	public void test() {
		String s = "CHEFCHEFFFF";
		assertEquals(2, CHRL2.solution(s));
	}

	@Test
	public void test1() {
		String s = "CHHHEEEFFCC";
		assertEquals(1, CHRL2.solution(s));
	}

	@Test
	public void test2() {
		String s = "CHHHEEECC";
		assertEquals(0, CHRL2.solution(s));
	}

	@Test
	public void test3() {
		String s = "CHHEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEECEEEF";
		// String s = "CHEF";
		assertEquals(1, CHRL2.solution(s));
	}

}
