package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ADASCOOLTest {
	@Test
	public void test() {
		assertEquals(ADASCOOL.NO, ADASCOOL.solution(1, 2));
		assertEquals(ADASCOOL.NO, ADASCOOL.solution(2, 1));

		assertEquals(ADASCOOL.YES, ADASCOOL.solution(2, 2));
		assertEquals(ADASCOOL.YES, ADASCOOL.solution(8, 2));
		assertEquals(ADASCOOL.YES, ADASCOOL.solution(50, 50));
		assertEquals(ADASCOOL.YES, ADASCOOL.solution(50, 49));
	}
}
