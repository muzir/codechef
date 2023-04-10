package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CHOPRTTest {


    @Test
    public void testEqual() {
        assertEquals("=", Choprt.printRelation(10, 10));
        assertEquals("=", Choprt.printRelation(1000000001, 1000000001));
        assertEquals("=", Choprt.printRelation(1, 1));
    }

    @Test
    public void testFirstGreater() {
        assertEquals(">", Choprt.printRelation(11, 10));
        assertEquals(">", Choprt.printRelation(1000000001, 1000000000));
        assertEquals(">", Choprt.printRelation(2, 1));
    }

    @Test
    public void testSecondGreater() {
        assertEquals("<", Choprt.printRelation(11, 20));
        assertEquals("<", Choprt.printRelation(1000000000, 1000000001));
        assertEquals("<", Choprt.printRelation(1, 2));
    }
}
