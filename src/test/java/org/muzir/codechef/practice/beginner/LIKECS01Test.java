package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LIKECS01Test {
    @Test
    @Disabled
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
    @Disabled
    public void testCornerCases() {
        assertEquals("yes", LIKECS01.checkSubsequenceEquality("aazzq"));
        assertEquals("yes",
                LIKECS01.checkSubsequenceEquality("aazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzeeq"));
        assertEquals("no", LIKECS01.checkSubsequenceEquality(
                "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
        assertEquals("no",
                LIKECS01.checkSubsequenceEquality("aazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzezzzzzzzzzzzzeqq"));
        assertEquals("yes",
                LIKECS01.checkSubsequenceEquality("aazzzzzzzzzzzzzzzzzzzwzzzzzzzzzzzzzzzzzzzzzzzzezzzzzzzzzzzzeqq"));
    }
}
