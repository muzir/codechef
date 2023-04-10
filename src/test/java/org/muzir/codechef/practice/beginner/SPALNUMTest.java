package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SPALNUMTest {
    @Test
    public void test() {
        assertEquals(45, SPALNUM.calculatePalindromic(1, 10));
        assertEquals(272, SPALNUM.calculatePalindromic(123, 150));
        assertEquals(50040, SPALNUM.calculatePalindromic(1, 1000));
        assertEquals(50045040, SPALNUM.calculatePalindromic(1, 100000));
    }
}
