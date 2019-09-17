package org.muzir.codechef.longContest.june19;

import org.junit.Assert;
import org.junit.Test;

public class PROXYCTest {

	@Test
	public void test() {
		Assert.assertEquals(1, PROXYC.solution("PAAPPAPPP"));
		Assert.assertEquals(0, PROXYC.solution("PAAPPPPPP"));
		Assert.assertEquals(-1, PROXYC.solution("PAAAAAAPP"));
		Assert.assertEquals(0, PROXYC.solution("PPPPPPPPP"));
		Assert.assertEquals(-1, PROXYC.solution("PAAP"));
		Assert.assertEquals(-1, PROXYC.solution("PAP"));
	}

	@Test
	public void test1() {
		Assert.assertEquals(-1, PROXYC.solution("PAP"));
	}
}
