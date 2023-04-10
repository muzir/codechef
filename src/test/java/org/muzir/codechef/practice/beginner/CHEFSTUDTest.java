package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CHEFSTUDTest {


    @Test
    public void shouldUnionCount() {
        int[] ignored = {1, 4, 6, 7};
        int[] tracked = {1, 2, 3, 4, 6, 7};
        assertEquals(6, VCS.getUnionCount(ignored, tracked));
    }


}
