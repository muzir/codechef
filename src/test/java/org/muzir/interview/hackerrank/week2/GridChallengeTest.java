package org.muzir.interview.hackerrank.week2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridChallengeTest {

    @Test
    void test() {
        var ls = List.of("ebacd", "fghij", "olmkn", "trpqs", "xywuv");
        String actual = GridChallenge.gridChallenge(ls);
        assertEquals(actual, "YES");
    }

    @Test
    void test1() {
        var ls = List.of("abc", "lmp", "qrt");
        String actual = GridChallenge.gridChallenge(ls);
        assertEquals(actual, "YES");
    }

    @Test
    void test2() {
        var ls = List.of("mpxz", "abcd", "wlmf");
        String actual = GridChallenge.gridChallenge(ls);
        assertEquals(actual, "NO");
    }

    @Test
    void test3() {
        var ls = List.of("abc", "hjk", "mpq", "rtv");
        String actual = GridChallenge.gridChallenge(ls);
        assertEquals(actual, "YES");
    }
}