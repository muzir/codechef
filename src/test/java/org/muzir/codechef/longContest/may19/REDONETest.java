package org.muzir.codechef.longContest.may19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class REDONETest {
	@Test
	public void test() {
		REDONE.Calculator calculator = new REDONE.Calculator();
		assertEquals(1, calculator.solution(1l));
		assertEquals(5, calculator.solution(2l));
		assertEquals(23, calculator.solution(3l));
		assertEquals(119, calculator.solution(4l));
		assertEquals(719, calculator.solution(5l));
		assertEquals(5039, calculator.solution(6l));
		assertEquals(40319, calculator.solution(7l));
		assertEquals(362879, calculator.solution(8l));
		assertEquals(3628799, calculator.solution(9l));
		assertEquals(39916799, calculator.solution(10l));
		assertEquals(479001599, calculator.solution(11l));
		assertEquals(227020757, calculator.solution(12l));
		assertEquals(178290590, calculator.solution(13l));
		assertEquals(674_358_850, calculator.solution(14l));
		assertEquals(440732387, calculator.solution(24l));
		assertEquals(459_042_010, calculator.solution(25l));
	}

	@Test
	public void test2() {
		//34577577456
		//		36018309874
		long n = 36018309874l;
		System.out.println(n % REDONE.constant);
	}
}

