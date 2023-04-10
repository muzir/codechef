package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RRJOKETest {

    @Test
    public void test() {
        assertEquals(1, RRJOKE.calculateXOR(1));
        assertEquals(3, RRJOKE.calculateXOR(2));
        assertEquals(0, RRJOKE.calculateXOR(3));
        assertEquals(4, RRJOKE.calculateXOR(4));
    }
}
