package org.muzir.interview.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Q2Test {
	private Q2 q2;

	@Before
	public void setUp() throws Exception {
		q2 = new Q2();
	}

	@Test
	public void shouldInitialCases() {
		Assert.assertEquals(0, q2.solution(0, 0));
		Assert.assertEquals(0, q2.solution(000, 00000));
		Assert.assertEquals(1002, q2.solution(001, 00002));

	}

	@Test
	public void shouldValidCases() {
		Assert.assertEquals(1526, q2.solution(12, 56));
		Assert.assertEquals(5162, q2.solution(56, 12));
		Assert.assertEquals(16273845, q2.solution(12345, 678));
		Assert.assertEquals(16273890, q2.solution(123, 67890));
		Assert.assertEquals(10234, q2.solution(1234, 0));
		Assert.assertEquals(100000000, q2.solution(10000000, 0));
		Assert.assertEquals(90000000, q2.solution(9000000, 0));
	}

	@Test
	public void shouldNotValidCase() {
		Assert.assertEquals(-1, q2.solution(10000000, 10));
		Assert.assertEquals(-1, q2.solution(10000000, 01));
	}

}
