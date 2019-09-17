package org.muzir.codechef.longContest.june19;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class KS2Test {
	@Test
	public void test() {
		Assert.assertEquals("28", KS2.solution(BigDecimal.valueOf(20)).toPlainString());
		Assert.assertEquals("19", KS2.solution(BigDecimal.valueOf(10)).toPlainString());
		Assert.assertEquals("37", KS2.solution(BigDecimal.valueOf(30)).toPlainString());
	}

	@Test
	public void test1() {
		Assert.assertEquals("10000000000000009", KS2.solution(BigDecimal.valueOf(10000000000000000l)).toPlainString());
		Assert.assertEquals("100000000000000009", KS2.solution(BigDecimal.valueOf(100000000000000000l)).toPlainString());
		Assert.assertEquals("1000000000000000009", KS2.solution(BigDecimal.valueOf(1000000000000000000l)).toPlainString());
	}
}
