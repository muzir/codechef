package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class LIKECS01Test {
	@Test
	public void testInitialCases() {
		Assert.assertEquals("no", LIKECS01.checkSubsequenceEquality("likecs"));
		Assert.assertEquals("yes", LIKECS01.checkSubsequenceEquality("venivedivici"));
		Assert.assertEquals("no", LIKECS01.checkSubsequenceEquality("bhuvan"));
		Assert.assertEquals("yes", LIKECS01.checkSubsequenceEquality("codechef"));
		Assert.assertEquals("no", LIKECS01.checkSubsequenceEquality("aazz"));
		Assert.assertEquals("no", LIKECS01.checkSubsequenceEquality("z"));
		Assert.assertEquals("no", LIKECS01.checkSubsequenceEquality("a"));
		Assert.assertEquals("no", LIKECS01.checkSubsequenceEquality("az"));
		Assert.assertEquals("no", LIKECS01.checkSubsequenceEquality("aaz"));
		Assert.assertEquals("yes", LIKECS01.checkSubsequenceEquality("aazzrwgwufewfnuwwbchwbc"));
	}

	@Test
	public void testCornerCases() {
		Assert.assertEquals("yes", LIKECS01.checkSubsequenceEquality("aazzq"));
		Assert.assertEquals("yes", LIKECS01.checkSubsequenceEquality("aazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzeeq"));
		Assert.assertEquals("no", LIKECS01.checkSubsequenceEquality("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
		Assert.assertEquals("no", LIKECS01.checkSubsequenceEquality("aazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzezzzzzzzzzzzzeqq"));
		Assert.assertEquals("yes", LIKECS01.checkSubsequenceEquality("aazzzzzzzzzzzzzzzzzzzwzzzzzzzzzzzzzzzzzzzzzzzzezzzzzzzzzzzzeqq"));
	}
}
