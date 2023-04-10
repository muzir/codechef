package org.muzir.codechef.practice.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CIELABTest {
    private Cielab cielab;

    private static List<Integer> oneStage = new ArrayList<Integer>();

    @BeforeEach
    public void setUp() {
        oneStage.add(Integer.valueOf(1));
        oneStage.add(Integer.valueOf(2));
        oneStage.add(Integer.valueOf(3));
        oneStage.add(Integer.valueOf(4));
        oneStage.add(Integer.valueOf(5));
        oneStage.add(Integer.valueOf(6));
        oneStage.add(Integer.valueOf(7));
        oneStage.add(Integer.valueOf(8));
        oneStage.add(Integer.valueOf(9));
        oneStage.add(Integer.valueOf(0));
        cielab = new Cielab();
    }

    @Test
    public void shouldOneStage() {
        Integer exact = Integer.valueOf(cielab.solution(9, 1));
        oneStage.remove(Integer.valueOf(8));
        assertNotEquals(Integer.valueOf(8), exact);
        assertTrue(oneStage.contains(exact));
    }

    @Test
    public void shouldOne() {
        Integer exact = Integer.valueOf(cielab.solution(10000, 1));
        System.out.println(exact);
        Integer exact2 = Integer.valueOf(cielab.solution(2, 1));
        System.out.println(exact2);
    }
}
