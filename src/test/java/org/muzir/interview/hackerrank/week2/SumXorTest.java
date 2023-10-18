package org.muzir.interview.hackerrank.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumXorTest {
    @Test
    void test() {
        assertEquals(SumXor.sumXor(4), 4);
        assertEquals(SumXor.sumXor(5), 2);
        assertEquals(SumXor.sumXor(10), 4);
    }

    @Test
    void test1() {
        assertEquals(SumXor.sumXor(1099511627776l), 1099511627776l);
    }
}
