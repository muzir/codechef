package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FLOW013Test {

    @Test
    public void test() {
        assertEquals("YES", FLOW013.isAnglesValid(100, 10, 70));
        assertEquals("YES", FLOW013.isAnglesValid(110, 10, 60));
        assertEquals("YES", FLOW013.isAnglesValid(100, 79, 1));
        assertEquals("NO", FLOW013.isAnglesValid(180, 0, 1));
        assertEquals("NO", FLOW013.isAnglesValid(180, 0, 1));
        assertEquals("NO", FLOW013.isAnglesValid(-170, 180, 10));
    }

}
