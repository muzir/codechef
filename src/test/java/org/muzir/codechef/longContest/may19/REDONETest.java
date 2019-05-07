package org.muzir.codechef.longContest.may19;

import org.junit.Assert;
import org.junit.Test;

public class REDONETest {
	@Test
	public void test() {
		REDONE.Calculator calculator = new REDONE.Calculator();
		Assert.assertEquals(1, calculator.solution(1l));
		Assert.assertEquals(5, calculator.solution(2l));
		Assert.assertEquals(23, calculator.solution(3l));
		Assert.assertEquals(119, calculator.solution(4l));
		Assert.assertEquals(719, calculator.solution(5l));
		Assert.assertEquals(5039, calculator.solution(6l));
		Assert.assertEquals(40319, calculator.solution(7l));
		Assert.assertEquals(362879, calculator.solution(8l));
		Assert.assertEquals(3628799, calculator.solution(9l));
		Assert.assertEquals(39916799, calculator.solution(10l));
		Assert.assertEquals(479001599, calculator.solution(11l));
		Assert.assertEquals(227020757, calculator.solution(12l));
		Assert.assertEquals(178290590, calculator.solution(13l));
		Assert.assertEquals(674_358_850, calculator.solution(14l));
		Assert.assertEquals(440732387, calculator.solution(24l));
		Assert.assertEquals(459_042_010, calculator.solution(25l));
	}

	@Test
	public void test2() {
		//34577577456
		//		36018309874
		long n = 36018309874l;
		System.out.println(n % REDONE.constant);
	}
}

