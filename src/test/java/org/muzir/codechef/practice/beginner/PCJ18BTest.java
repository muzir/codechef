package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PCJ18BTest {
	@Test
	public void test() {
		assertEquals(10, PCJ18B.solution(3));
		assertEquals(120, PCJ18B.solution(8));
		assertEquals(167167000, PCJ18B.solution(1000));
	}
}
