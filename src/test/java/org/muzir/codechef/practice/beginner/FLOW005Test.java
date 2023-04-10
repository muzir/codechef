package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FLOW005Test {


    @Test
    public void test() {
        assertEquals(1, FLOW005.calculate(1, 100));
        assertEquals(1, FLOW005.calculate(2, 100));
        assertEquals(1, FLOW005.calculate(5, 100));
        assertEquals(1, FLOW005.calculate(10, 100));
        assertEquals(1, FLOW005.calculate(50, 100));
        assertEquals(1, FLOW005.calculate(100, 100));
        assertEquals(10, FLOW005.calculate(1000, 100));
        assertEquals(10, FLOW005.calculate(10000, 1000000));

    }

}
