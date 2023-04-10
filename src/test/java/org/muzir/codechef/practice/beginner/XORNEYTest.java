package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.muzir.codechef.practice.beginner.XORNEY.xor;

public class XORNEYTest {
    @Test
    @Disabled
    public void test() {
        assertEquals("Even", XORNEY.solution(1, 4));
    }

    @Test
    public void testXor() {
        assertFalse(isEven(xor(1, 2)));
        assertFalse(isEven(xor(2, 1)));
        assertFalse(isEven(xor(2, 3)));
        assertTrue(isEven(xor(1, 1)));
        assertTrue(isEven(xor(3, 3)));
        assertTrue(isEven(xor(3, 9)));
        assertTrue(isEven(xor(2, 2)));
        assertTrue(isEven(xor(4, 2)));
    }

    @Test
    public void testEvenLoop() {
        for (long i = 0; i < 1_000_000_000l; i = i + 2) {
            assertTrue(isEven(xor(i, i + 2)));
        }
    }

    @Test
    public void testOddLoop() {
        for (long i = 1; i < 1000; i = i + 2) {
            assertTrue(isEven(xor(i, i + 2)));
        }
    }

    @Test
    public void testSequencially() {
        long acc = 1;
        for (long i = acc; i < 10; i++) {
            System.out.println("acc:" + acc + ", next:" + (i + 1));
            acc = xor(acc, i + 1);
        }
        assertFalse(isEven(acc));
    }

    private boolean isEven(long param) {
        return param % 2 == 0;
    }
}
