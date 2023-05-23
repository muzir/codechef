package org.muzir.interview.hackerrank.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperDigitTest {

    @Test
    void test1() {
        assertEquals(2, SuperDigit.superDigit("11", 1));
        assertEquals(2, SuperDigit.superDigit("29", 1));
        assertEquals(2, SuperDigit.superDigit("9875", 1));
        assertEquals(8, SuperDigit.superDigit("116", 1));
        assertEquals(8, SuperDigit.superDigit("9875", 4));
    }
}
