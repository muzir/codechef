package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TICKETS5Test {
	private static final String NO = "NO";
	private static final String YES = "YES";

	@Test
	public void test() {
		String s = "xyxyxyxyxx";
		assertEquals(NO, TICKETS5.solution(s));
	}

	@Test
	public void test1() {
		String s = "xyxyxyxyxy";
		assertEquals(NO, TICKETS5.solution(s));
	}

	@Test
	public void test2() {
		String s = "";
		assertEquals(NO, TICKETS5.solution(s));
	}

	@Test
	public void test3() {
		String s = null;
		assertEquals(NO, TICKETS5.solution(s));
	}

	@Test
	public void test4() {
		String s = "EEE";
		assertEquals(NO, TICKETS5.solution(s));
	}

	@Test
	public void test5() {
		String s = "EE";
		assertEquals(NO, TICKETS5.solution(s));
	}

	@Test
	public void test8() {
		String s = "ABC";
		assertEquals(NO, TICKETS5.solution(s));
	}

	@Test
	public void test9() {
		String s = "ABABACABAB";
		assertEquals(NO, TICKETS5.solution(s));
	}

	@Test
	public void test6() {
		String s = "EYEYEY";
		assertEquals(YES, TICKETS5.solution(s));
	}

	@Test
	public void test7() {
		String s = "ABABAB";
		assertEquals(YES, TICKETS5.solution(s));
	}

	@Test
	public void test10() {
		String s = "1212";
		assertEquals(NO, TICKETS5.solution(s));
	}

}
