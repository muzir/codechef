package org.muzir.codechef.longContest.june19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class KS2Test {
	@Test
	public void test() {
		assertEquals("28", KS2.solution(BigDecimal.valueOf(20)).toPlainString());
		assertEquals("19", KS2.solution(BigDecimal.valueOf(10)).toPlainString());
		assertEquals("37", KS2.solution(BigDecimal.valueOf(30)).toPlainString());
	}

	@Test
	public void test1() {
		assertEquals("10000000000000009", KS2.solution(BigDecimal.valueOf(10000000000000000l)).toPlainString());
		assertEquals("100000000000000009", KS2.solution(BigDecimal.valueOf(100000000000000000l)).toPlainString());
		assertEquals("1000000000000000009", KS2.solution(BigDecimal.valueOf(1000000000000000000l)).toPlainString());
	}
}
