package org.muzir.interview.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q2Test {
    private Q2 q2;

    @BeforeEach
    public void setUp() throws Exception {
        q2 = new Q2();
    }

    @Test
    @Disabled
    public void shouldInitialCases() {
        assertEquals(0, q2.solution(0, 0));
        assertEquals(0, q2.solution(000, 00000));
        assertEquals(1002, q2.solution(001, 00002));
    }

    @Test
    public void shouldValidCases() {
        assertEquals(1526, q2.solution(12, 56));
        assertEquals(5162, q2.solution(56, 12));
        assertEquals(16273845, q2.solution(12345, 678));
        assertEquals(16273890, q2.solution(123, 67890));
        assertEquals(10234, q2.solution(1234, 0));
        assertEquals(100000000, q2.solution(10000000, 0));
        assertEquals(90000000, q2.solution(9000000, 0));
    }

    @Test
    public void shouldNotValidCase() {
        assertEquals(-1, q2.solution(10000000, 10));
        assertEquals(-1, q2.solution(10000000, 01));
    }
}
