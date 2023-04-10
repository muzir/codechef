package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RECTSQTest {

    @Test
    public void shouldEbobSuccess() {
        assertEquals(10, RECTSQ.ebob(10, 20));
        assertEquals(1, RECTSQ.ebob(1, 2));
        assertEquals(1, RECTSQ.ebob(1, 1));
        assertEquals(5, RECTSQ.ebob(10, 15));
        assertEquals(2, RECTSQ.ebob(4, 6));
    }

    @Test
    public void shouldPrintSquareCountSuccess() {
        assertEquals(6, RECTSQ.printSquareCount(10, 15));
        assertEquals(6, RECTSQ.printSquareCount(4, 6));
        assertEquals(1, RECTSQ.printSquareCount(1, 1));
        assertEquals(2, RECTSQ.printSquareCount(1, 2));
        assertEquals(1, RECTSQ.printSquareCount(100000, 100000));
        assertEquals(2, RECTSQ.printSquareCount(50000, 100000));
    }

}
