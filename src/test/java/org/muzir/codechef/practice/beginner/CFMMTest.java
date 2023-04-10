package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CFMMTest {
	@Test
	public void test() {
		assertEquals(1, CFMM.solution("cplusplusoscardeckfeehatnear"));
		assertEquals(2, CFMM.solution("codehackerchefchabydumbofe"));
		assertEquals(5, CFMM.solution("codechefchefcodefehcedoccceeohfdcodechef"));
	}

	@Test
	public void test1() {
		assertEquals(0, CFMM.solution("c"));
		assertEquals(0, CFMM.solution("aa"));
		assertEquals(0, CFMM.solution(""));
	}
}
