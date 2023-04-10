package org.muzir.codechef.longContest.nov17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VILTRIBETest {

    VILTRIBE.Tribes tribes;

    @BeforeEach
    public void setUp() {
        tribes = new VILTRIBE.Tribes();
    }

    @Test
    public void test_tribe_A_and_B() {
        String tribeSeries = "A..A..B...B";
        tribes.calculateTribeCount(tribeSeries);
        assertEquals(4, tribes.getACounter());
        assertEquals(5, tribes.getBCounter());
    }

    @Test
    public void test_only_tribe_A() {
        String tribeSeries = "..A..";
        tribes.calculateTribeCount(tribeSeries);
        assertEquals(1, tribes.getACounter());
        assertEquals(0, tribes.getBCounter());
    }

    @Test
    public void test_tribe_A_Between_A() {
        String tribeSeries = "A....A";
        tribes.calculateTribeCount(tribeSeries);
        assertEquals(6, tribes.getACounter());
        assertEquals(0, tribes.getBCounter());
    }


    @Test
    public void test_only_tribe_B() {
        String tribeSeries = "..B..B..B..";
        tribes.calculateTribeCount(tribeSeries);
        assertEquals(0, tribes.getACounter());
        assertEquals(7, tribes.getBCounter());
    }
}
