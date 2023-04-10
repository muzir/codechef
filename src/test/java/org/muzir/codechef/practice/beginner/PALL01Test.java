package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PALL01Test {

    @Test
    public void test() {
        assertTrue(PALL01.isPolindrome("1111"));
        assertTrue(PALL01.isPolindrome("111"));
        assertTrue(PALL01.isPolindrome("1"));
        assertTrue(PALL01.isPolindrome("9999"));
        assertTrue(PALL01.isPolindrome("121"));
        assertTrue(PALL01.isPolindrome("00"));

        assertFalse(PALL01.isPolindrome("9990"));
        assertFalse(PALL01.isPolindrome("12"));
    }
}
