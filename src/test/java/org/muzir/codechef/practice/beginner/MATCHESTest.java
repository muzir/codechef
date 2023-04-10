package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MATCHESTest {

	@BeforeAll
	public static void setUp() {
		MATCHES.initializeMap();
	}

	@Test
	public void test() {
		assertEquals(13, MATCHES.solution(123, 234));
		assertEquals(10, MATCHES.solution(10101, 1010));
		assertEquals(7, MATCHES.solution(4, 4));
		assertEquals(5, MATCHES.solution(1, 1));
		assertEquals(8, MATCHES.solution(5, 5));
		assertEquals(41, MATCHES.solution(1000000, 1000000));
	}
}
