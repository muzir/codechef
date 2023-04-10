package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class POTATOESTest {
    @Test
    public void test() {
        assertEquals(1, POTATOES.solution(1, 3));
        assertEquals(4, POTATOES.solution(4, 3));
        assertEquals(1, POTATOES.solution(1, 1));
        assertEquals(2, POTATOES.solution(2, 1));
        assertEquals(3, POTATOES.solution(1000, 1000));
    }

    @Test
    public void test1() {
        assertTrue(POTATOES.isPrime(2003));
    }
}
