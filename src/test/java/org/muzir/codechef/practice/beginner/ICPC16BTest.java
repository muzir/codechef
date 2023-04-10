package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ICPC16BTest {
	@Test
	public void initialCases() {
		assertEquals("no", ICPC16B.checkBeautifulArray("-1 -1 0"));
		assertEquals("no", ICPC16B.checkBeautifulArray("1 2 2"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("1 1 0"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("1 1 0 -2"));
		assertEquals("no", ICPC16B.checkBeautifulArray("1 -1 0 -2"));
		assertEquals("no", ICPC16B.checkBeautifulArray("1 1 0 -2 -2"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("1 1 1 1"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("1 1 -1 1"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("12323"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("-1 -1 -1 1"));
		assertEquals("no", ICPC16B.checkBeautifulArray("-1 -1 -1 0"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("-1 0 0 0"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("1 0 30"));

		assertEquals("yes", ICPC16B.checkBeautifulArray("1 0 -30"));
		assertEquals("no", ICPC16B.checkBeautifulArray("1 0 -30 -1"));
		assertEquals("no", ICPC16B.checkBeautifulArray("1 0 -30 -30 -30 -20"));
		assertEquals("no", ICPC16B.checkBeautifulArray("1 0 1 0 30 1 1 1 0 -2"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("-1 -1 0 1"));
		assertEquals("no", ICPC16B.checkBeautifulArray("-1 -1 -1"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("0 0 0 0 0 0 0 0"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 0 0 0 0 0"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("-1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 0 0 0 0 0"));
		assertEquals("no", ICPC16B.checkBeautifulArray("-1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 0 0 0 0 2"));
		assertEquals("yes", ICPC16B.checkBeautifulArray("1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 0 0 0 0 10"));
	}
}
