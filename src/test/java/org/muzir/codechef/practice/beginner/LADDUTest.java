package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LADDUTest {

    @Test
    public void test() {
        String line = "CONTEST_WON 1";
        assertEquals(319, LADDU.getPoint(line));
    }

    @Test
    public void test1() {
        String line = "CONTEST_WON 4";
        assertEquals(316, LADDU.getPoint(line));
    }

    @Test
    public void test2() {
        String line = "TOP_CONTRIBUTOR";
        assertEquals(300, LADDU.getPoint(line));
    }

    @Test
    public void test3() {
        String line = "BUG_FOUND 100";
        assertEquals(100, LADDU.getPoint(line));
    }

    @Test
    public void test5() {
        String line = "BUG_FOUND 10";
        assertEquals(10, LADDU.getPoint(line));
    }

    @Test
    public void test4() {
        String line = "CONTEST_HOSTED";
        assertEquals(50, LADDU.getPoint(line));
    }

    @Test
    public void test6() {
        String line = "";
        assertEquals(0, LADDU.getPoint(line));
    }

    @Test
    public void test7() {
        String line = "132";
        assertEquals(0, LADDU.getPoint(line));
    }

}
