package org.muzir.interview.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TapeEquilibriumTest {

    private TapeEquilibrium tapeEquilibrium;

    @BeforeEach
    public void setUp() throws Exception {
        tapeEquilibrium = new TapeEquilibrium();
    }

    @Test
    public void shouldReturnZero() {
        int[] a = {1, 2, 3};
        int exactResult = tapeEquilibrium.solution(a);
        assertEquals(exactResult, 0);
    }

    @Test
    public void shouldReturnOne() {
        int[] a = {3, 1, 2, 4, 3};
        int exactResult = tapeEquilibrium.solution(a);
        assertEquals(1, exactResult);
    }

    // @Test
    // public void shouldSmallRandomPassed() {
    // SecureRandom secureRandom = new SecureRandom();
    // int[] a = new int[100];
    // for (int i = 0; i < 100; i++) {
    // int n = secureRandom.nextInt();
    // a[i] = n;
    // }
    // int exactResult = tapeEquilibrium.solution(a);
    // System.out.println(exactResult);
    // }
    @Test
    public void shouldSmallNegativePassed() {
        int[] a = {-10, -20, -30, -40, 100};
        int exactResult = tapeEquilibrium.solution(a);
        System.out.println(exactResult);
    }
}
