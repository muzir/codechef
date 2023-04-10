package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MISSPTest {

    @Test
    public void test() {
        int p[] = {1, 2, 3, 4, 3, 2, 4};
        assertEquals(1, MISSP.printOddDoll(p));
    }

    @Test
    public void test1() {
        int p[] = {1, 2, 1};
        assertEquals(2, MISSP.printOddDoll(p));
    }

    @Test
    public void test2() {
        int p[] = {1, 1, 2, 2, 3};
        assertEquals(3, MISSP.printOddDoll(p));
    }

    // @Test
    // public void arrayPerformance() {
    // int[] p = new int[100000];
    // int j = 100000;
    // for (int i = 0; i < 100000; i++) {
    // p[i] = j;
    // j = j - 1;
    // }
    // long start = System.currentTimeMillis();
    // Arrays.sort(p);
    // long end = System.currentTimeMillis();
    // long difference = end - start;
    // System.out.println("Difference:" + difference);
    // }

}
