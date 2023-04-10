package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FLOW014Test {

    @Test
    public void test() {
        assertEquals("10", FLOW014.gradeSteel(53, 0.6, 5602));
        assertEquals("9", FLOW014.gradeSteel(51, 0.6, 0));
        assertEquals("9", FLOW014.gradeSteel(10000, 0, 0));
        assertEquals("8", FLOW014.gradeSteel(49, 0.6, 5601));
        assertEquals("8", FLOW014.gradeSteel(0, 0, 10000));
        assertEquals("7", FLOW014.gradeSteel(10000, 10000, 10000));
        assertEquals("6", FLOW014.gradeSteel(0, 0, 0));
        assertEquals("6", FLOW014.gradeSteel(45, 0, 4500));
        assertEquals("5", FLOW014.gradeSteel(50, 0.7, 5600));
        assertEquals("5", FLOW014.gradeSteel(0, 10000, 0));
        assertEquals("5", FLOW014.gradeSteel(1, 1, 1));
        assertEquals("5", FLOW014.gradeSteel(1, 1, 1));

    }

}
