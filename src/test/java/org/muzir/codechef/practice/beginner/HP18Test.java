package org.muzir.codechef.practice.beginner;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HP18Test {
    @Test
    public void test() {
        Assertions.assertEquals("ALICE", HP18.findWinner("1 2 3 4 5", 3, 2));
        Assertions.assertEquals("BOB", HP18.findWinner("1 2 3 4 5", 2, 4));
        Assertions.assertEquals("ALICE", HP18.findWinner("1 6 6 8 3", 3, 2));

        Assertions.assertEquals("BOB", HP18.findWinner("1 6 7 8 3", 3, 2));
        Assertions.assertEquals("BOB", HP18.findWinner("1 6 2 3", 3, 2));
        Assertions.assertEquals("ALICE", HP18.findWinner("1 6 2 3 6", 3, 2));
    }
}
