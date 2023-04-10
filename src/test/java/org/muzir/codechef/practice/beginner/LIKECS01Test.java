package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LIKECS01Test {
	@Test
	public void testInitialCases() {
		assertEquals("no", LIKECS01.checkSubsequenceEquality("likecs"));
		assertEquals("yes", LIKECS01.checkSubsequenceEquality("venivedivici"));
		assertEquals("no", LIKECS01.checkSubsequenceEquality("bhuvan"));
		assertEquals("yes", LIKECS01.checkSubsequenceEquality("codechef"));
		assertEquals("no", LIKECS01.checkSubsequenceEquality("aazz"));
		assertEquals("no", LIKECS01.checkSubsequenceEquality("z"));
		assertEquals("no", LIKECS01.checkSubsequenceEquality("a"));
		assertEquals("no", LIKECS01.checkSubsequenceEquality("az"));
		assertEquals("no", LIKECS01.checkSubsequenceEquality("aaz"));
		assertEquals("yes", LIKECS01.checkSubsequenceEquality("aazzrwgwufewfnuwwbchwbc"));
	}

	@Test
	public void testCornerCases() {
		assertEquals("yes", LIKECS01.checkSubsequenceEquality("aazzq"));
		assertEquals("yes", LIKECS01.checkSubsequenceEquality("aazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzeeq"));
		assertEquals("no", LIKECS01.checkSubsequenceEquality("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
		assertEquals("no", LIKECS01.checkSubsequenceEquality("aazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzezzzzzzzzzzzzeqq"));
		assertEquals("yes", LIKECS01.checkSubsequenceEquality("aazzzzzzzzzzzzzzzzzzzwzzzzzzzzzzzzzzzzzzzzzzzzezzzzzzzzzzzzeqq"));
	}
}
