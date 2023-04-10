package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GDOGTest {

    @Test
    public void test() {
        assertEquals(4, GDOG.maxRemainder(19, 5));
        assertEquals(2, GDOG.maxRemainder(11, 3));
        assertEquals(1, GDOG.maxRemainder(5, 2));
        assertEquals(0, GDOG.maxRemainder(100000, 1));
        assertEquals(0, GDOG.maxRemainder(100000, 2));
        assertEquals(1, GDOG.maxRemainder(100000, 3));
        assertEquals(1, GDOG.maxRemainder(100000, 5));
        assertEquals(3, GDOG.maxRemainder(63, 7));
    }

}
