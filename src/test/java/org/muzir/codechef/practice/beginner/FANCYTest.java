package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

import static org.muzir.codechef.practice.beginner.FANCY.REAL_FANCY;
import static org.muzir.codechef.practice.beginner.FANCY.REGULARY_FANCY;

public class FANCYTest {
	@Test
	public void test() {
		Assert.assertEquals(REAL_FANCY, FANCY.solution("i do not have any fancy quotes"));
	}

	@Test
	public void test1() {
		Assert.assertEquals(REGULARY_FANCY, FANCY.solution("when nothing goes right go left"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(REAL_FANCY, FANCY.solution("when nothing goes right go left, do not go left regularly"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(REGULARY_FANCY, FANCY.solution("notnot who is she, she is Peanut"));
	}

	@Test
	public void test4() {
		Assert.assertEquals(REAL_FANCY, FANCY.solution("notnot who is she, she is not a nutcracker"));
	}

	@Test
	public void test5() {
		Assert.assertEquals(REAL_FANCY, FANCY.solution("notnot it is not funny notnot"));
	}

	@Test
	public void test6() {
		Assert.assertEquals(REAL_FANCY, FANCY.solution("not trust everybody"));
	}

	@Test
	public void test7() {
		Assert.assertEquals(REAL_FANCY, FANCY.solution("trust somebody who doesn't left you when you need some help, drama should not"));
	}

	@Test
	public void test8() {
		Assert.assertEquals(REGULARY_FANCY, FANCY.solution("t"));
		Assert.assertEquals(REGULARY_FANCY, FANCY.solution("t"));
		Assert.assertEquals(REGULARY_FANCY, FANCY.solution("notnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnotnot"));
		Assert.assertEquals(REGULARY_FANCY, FANCY.solution("t"));
		Assert.assertEquals(REGULARY_FANCY, FANCY.solution(" donot"));
	}

	@Test
	public void test9() {
		Assert.assertEquals(REAL_FANCY, FANCY.solution("not"));
		Assert.assertEquals(REAL_FANCY, FANCY.solution(" not"));
		Assert.assertEquals(REAL_FANCY, FANCY.solution("not "));
		Assert.assertEquals(REAL_FANCY, FANCY.solution(" not "));
		Assert.assertEquals(REAL_FANCY, FANCY.solution(" donot                                 not "));
		Assert.assertEquals(REAL_FANCY, FANCY.solution("        not                                  "));
		Assert.assertEquals(REAL_FANCY, FANCY.solution("        not       "));
	}

	@Test
	public void test10() {

	}
}
