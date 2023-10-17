package org.muzir.interview.hackerrank.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CounterGameTest {


    @Test
    void test() {
        assertTrue(CounterGame.counterGame(1).equals(CounterGame.RICHARD));
        assertTrue(CounterGame.counterGame(6).equals(CounterGame.RICHARD));
        assertTrue(CounterGame.counterGame(132).equals(CounterGame.LOUISE));
        assertTrue(CounterGame.counterGame(133).equals(CounterGame.RICHARD));
    }
}