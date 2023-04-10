package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SMPAIRTest {

    @Test
    public void test() {
        List<Integer> elements = new ArrayList<Integer>();
        Collections.addAll(elements, 1, 2);
        assertEquals(new BigDecimal(3), SMPAIR.calculateSmallestPair(elements));
        assertEquals(new BigDecimal(-1), SMPAIR.calculateSmallestPair(Arrays.<Integer>asList(3, 5, 0, 8, 1, -1)));
        assertEquals(new BigDecimal(-10),
                SMPAIR.calculateSmallestPair(Arrays.<Integer>asList(3, 5, 0, 8, 1, -10)));
        assertEquals(new BigDecimal(-1000000),
                SMPAIR.calculateSmallestPair(Arrays.<Integer>asList(3, 5, 0, 8, 1, -1000000)));
        assertEquals(new BigDecimal(1),
                SMPAIR.calculateSmallestPair(Arrays.<Integer>asList(3, 5, 0, 8, 1, 1000000)));
    }

}
