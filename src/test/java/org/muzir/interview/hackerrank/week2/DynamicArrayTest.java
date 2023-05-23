package org.muzir.interview.hackerrank.week2;

import org.junit.jupiter.api.Test;
import org.muzir.interview.hackerrank.week2.DynamicArray;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicArrayTest {
    @Test
    void test() {
        List<Integer> row1 = List.of(1, 0, 5);
        List<Integer> row2 = List.of(1, 1, 7);
        List<Integer> row3 = List.of(1, 0, 3);
        List<Integer> row4 = List.of(2, 1, 0);
        List<Integer> row5 = List.of(2, 1, 1);
        List<Integer> actual = DynamicArray.dynamicArray(2, List.of(row1, row2, row3, row4, row5));
        assertEquals(List.of(7, 3), actual);
        System.out.println(actual);
    }
}
