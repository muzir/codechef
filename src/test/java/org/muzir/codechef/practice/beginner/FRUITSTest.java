package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FRUITSTest {

    @Test
    public void shouldValidCases() {
        assertEquals(0, FRUITS.getMinimumDifference(3, 4, 1));
        assertEquals(2, FRUITS.getMinimumDifference(5, 2, 1));
        assertEquals(0, FRUITS.getMinimumDifference(3, 4, 3));
        assertEquals(0, FRUITS.getMinimumDifference(0, 0, 0));
        assertEquals(0, FRUITS.getMinimumDifference(1, 1, 1));
        assertEquals(0, FRUITS.getMinimumDifference(100, 100, 100));
        assertEquals(0, FRUITS.getMinimumDifference(90, 5, 85));
        assertEquals(1, FRUITS.getMinimumDifference(90, 5, 84));
        assertEquals(0, FRUITS.getMinimumDifference(90, 5, 99));
        assertEquals(94, FRUITS.getMinimumDifference(100, 1, 5));
        assertEquals(94, FRUITS.getMinimumDifference(1, 100, 5));
    }

}
