package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CHEFDETETest {

    @Test
    public void test() {
        int[] a = {0, 1, 1, 2, 2, 3};
        assertEquals("4 5 6", CHEFDETE.solution(a));
    }

    @Test
    public void test1() {
        int[] a = {2, 0, 1, 2, 2, 3};
        assertEquals("4 5 6", CHEFDETE.solution(a));
    }

    @Test
    public void test2() {
        int[] a = {0};
        assertEquals("", CHEFDETE.solution(a));
    }

    @Test
    public void test100_000() {
        int lenght = 100_000;
        int[] a = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            a[i] = i;
        }
        long start = System.currentTimeMillis();
        assertEquals("100000", CHEFDETE.solution(a));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
