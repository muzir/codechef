package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.muzir.codechef.practice.beginner.FANCY.REAL_FANCY;
import static org.muzir.codechef.practice.beginner.FANCY.REGULARY_FANCY;

public class FANCYTest {
	@Test
	public void test() {
		assertEquals(REAL_FANCY, FANCY.solution("i do not have any fancy quotes"));
	}

	@Test
	public void test1() {
		assertEquals(REGULARY_FANCY, FANCY.solution("when nothing goes right go left"));
	}

	@Test
	public void test2() {
		assertEquals(REAL_FANCY, FANCY.solution("when nothing goes right go left, do not go left regularly"));
	}

	@Test
	public void test3() {
		assertEquals(REGULARY_FANCY, FANCY.solution("notnot who is she, she is Peanut"));
	}

	@Test
	public void test4() {
		assertEquals(REAL_FANCY, FANCY.solution("notnot who is she, she is not a nutcracker"));
	}

	@Test
	public void test5() {
		assertEquals(REAL_FANCY, FANCY.solution("notnot it is not funny notnot"));
	}

	@Test
	public void test6() {
		assertEquals(REAL_FANCY, FANCY.solution("not trust everybody"));
	}

	@Test
	public void test7() {
		assertEquals(REAL_FANCY, FANCY.solution("trust somebody who doesn't left you when you need some help, drama should not"));
	}

	@Test
	public void test8() {
		assertEquals(REGULARY_FANCY, FANCY.solution("t"));
		assertEquals(REGULARY_FANCY, FANCY.solution("t"));
		assertEquals(REGULARY_FANCY, FANCY.solution("notnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnot"));
		assertEquals(REGULARY_FANCY, FANCY.solution("t"));
		assertEquals(REGULARY_FANCY, FANCY.solution(" donot"));
	}

	@Test
	public void test9() {
		assertEquals(REAL_FANCY, FANCY.solution("not"));
		assertEquals(REAL_FANCY, FANCY.solution(" not"));
		assertEquals(REAL_FANCY, FANCY.solution("not "));
		assertEquals(REAL_FANCY, FANCY.solution(" not "));
		assertEquals(REAL_FANCY, FANCY.solution(" donot                                 not "));
		assertEquals(REAL_FANCY, FANCY.solution("        not                                  "));
		assertEquals(REAL_FANCY, FANCY.solution("        not       "));
	}

	@Test
	public void test10() {
		assertEquals(REAL_FANCY, FANCY.solution(" not "));
		assertEquals(REAL_FANCY, FANCY.solution(" not"));
		assertEquals(REAL_FANCY, FANCY.solution("not "));
		assertEquals(REAL_FANCY, FANCY.solution("t  notg notg notg notg not "));
	}
}
