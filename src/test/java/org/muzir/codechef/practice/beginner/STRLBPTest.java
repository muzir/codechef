package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class STRLBPTest {
	@Test
	public void initialCases() {
		assertEquals(STRLBP.UNIFORM, STRLBP.checkUniform("00000000"));
		assertEquals(STRLBP.NON_UNIFORM, STRLBP.checkUniform("10101010"));
		assertEquals(STRLBP.UNIFORM, STRLBP.checkUniform("10000001"));
		assertEquals(STRLBP.NON_UNIFORM, STRLBP.checkUniform("10010011"));
		assertEquals(STRLBP.NON_UNIFORM, STRLBP.checkUniform("10000010"));
		assertEquals(STRLBP.UNIFORM, STRLBP.checkUniform("00000001"));
	}
}
