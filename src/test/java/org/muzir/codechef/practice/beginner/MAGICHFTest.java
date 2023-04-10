package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MAGICHFTest {
	@Test
	public void test() {
		MAGICHF.Pair[] pairs = {new MAGICHF.Pair(4, 2), new MAGICHF.Pair(3, 4), new MAGICHF.Pair(3, 2), new MAGICHF.Pair(1, 2)};
		assertEquals(1, MAGICHF.solution(2, pairs));
	}
}
