package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MSNSADM1Test {
	@Test
	public void test() {
		assertEquals(800, MSNSADM1.solution("40 30 50", "2 4 20"));
		assertEquals(0, MSNSADM1.solution("0", "10"));
	}
}
