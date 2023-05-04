package org.muzir.interview.hackerrank.week2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalancedSumsTest {
    @Test
    void test() {
        List<Integer> ls = List.of(1, 2, 3);
        assertEquals("NO", BalancedSums.balancedSums(ls));
    }

    @Test
    void test1() {
        List<Integer> ls = List.of(1, 2, 3, 3);
        assertEquals("YES", BalancedSums.balancedSums(ls));
    }
}