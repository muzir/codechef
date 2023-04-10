package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CHNGORTest {

    @Test
    public void testInitialCases() {
        int[] arr = {1, 2};
        assertEquals(3, CHNGOR.calculateMin(arr));
    }
}
