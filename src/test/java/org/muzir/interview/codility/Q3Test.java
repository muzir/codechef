package org.muzir.interview.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q3Test {
    private Q3 q3;

    @BeforeEach
    public void setUp() throws Exception {
        q3 = new Q3();
    }

    @Test
    public void shouldInitialCases() {
        int[] emptyArray = {};
        int[] fullArray = {2, 3, 5};
        int maxFloor = 5;
        int maxPersonCount = 2;
        int maxWeight = 200;
        assertEquals(0, q3.solution(null, fullArray, maxFloor, maxPersonCount, maxWeight));
        assertEquals(0, q3.solution(fullArray, null, maxFloor, maxPersonCount, maxWeight));
        assertEquals(0, q3.solution(emptyArray, fullArray, maxFloor, maxPersonCount, maxWeight));
        assertEquals(0, q3.solution(fullArray, emptyArray, maxFloor, maxPersonCount, maxWeight));
    }

    @Test
    public void shouldValidCases() {
        int[] personWeights = {60, 80, 40};
        int[] personTargetFloors = {2, 3, 5};
        int maxFloor = 5;
        int maxPersonCount = 2;
        int maxWeight = 200;
        assertEquals(5, q3.solution(personWeights, personTargetFloors, maxFloor, maxPersonCount, maxWeight));
    }
}
