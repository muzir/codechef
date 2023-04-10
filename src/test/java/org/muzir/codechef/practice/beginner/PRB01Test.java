package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PRB01Test {
    @Test
    @Disabled
    public void test() {
        assertFalse(PRB01.isPrime(1));
        assertFalse(PRB01.isPrime(10));
        assertFalse(PRB01.isPrime(4));
        assertFalse(PRB01.isPrime(9));
        assertTrue(PRB01.isPrime(10000));

        assertTrue(PRB01.isPrime(2));
        assertTrue(PRB01.isPrime(3));
        assertTrue(PRB01.isPrime(5));
    }
}
