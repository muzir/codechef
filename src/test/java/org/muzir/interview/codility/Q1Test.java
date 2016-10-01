package org.muzir.interview.codility;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class Q1Test {
	private Q1 q1;

	@Before
	public void setUp() throws Exception {
		q1 = new Q1();
	}

	@Test
	public void shouldNotNullNull() {
		Assert.assertEquals(q1.isValidPassword(""), -1);
		Assert.assertEquals(q1.isValidPassword(null), -1);
	}

	@Test
	public void shouldUpperCaseExist() {
		Assert.assertEquals(-1, q1.isValidPassword("0"));
		Assert.assertEquals(-1,
				q1.isValidPassword("000000000000000000000000000000000000000000000000000000000000000000000000000000a"));
		Assert.assertEquals(2,
				q1.isValidPassword("00000000000000000000000000000000000000000000000000000000000000000000000Aa01re"));
		Assert.assertEquals(-1, q1.isValidPassword("a"));
		Assert.assertEquals(q1.isValidPassword("a00a"), -1);
		Assert.assertEquals(q1.isValidPassword("a0bb"), -1);
		Assert.assertEquals(q1.isValidPassword("abbbbbbbbbbbbbbbbbbbzzzewewbb"), -1);
	}

	@Test
	public void shouldValidCases() {
		Assert.assertEquals(1, q1.isValidPassword("A"));
		Assert.assertEquals(q1.isValidPassword("a0Ba"), 2);
		Assert.assertEquals(q1.isValidPassword("a0bb"), -1);
		Assert.assertEquals(4, q1.isValidPassword("AAas0bb"));
		Assert.assertEquals(q1.isValidPassword("a0Ba5353Yjhaskhdsa3dksald3nadnaB5sadjnsalda0dsakdja1jhdkas"), 10);
		Assert.assertEquals(106, q1.isValidPassword(
				"00000000000000000000000000000003213213000000000000000423423423AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBaaaaaaa0ewqewqAAQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ"));
	}

}
