package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AMR15ATest {


    private static String READY_FOR_BATTLE = "READY FOR BATTLE";
    private static String NOT_READY = "NOT READY";

    @Test
    public void test1() {
        String[] str1 = {"1", "2", "3"};
        assertEquals(NOT_READY, AMR15A.printBattle(str1));
    }

    @Test
    public void test2() {
        String[] str1 = {"1", "2", "3", "4", "6"};
        assertEquals(READY_FOR_BATTLE, AMR15A.printBattle(str1));
    }

    @Test
    public void test3() {
        String[] str1 = {"1", "2", "3", "34", "100", "1", "0"};
        assertEquals(READY_FOR_BATTLE, AMR15A.printBattle(str1));
    }

}
