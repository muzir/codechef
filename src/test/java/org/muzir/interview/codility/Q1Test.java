package org.muzir.interview.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q1Test {
    private Q1 q1;

    @BeforeEach
    public void setUp() throws Exception {
        q1 = new Q1();
    }

    @Test
    public void shouldNotNullNull() {
        assertEquals(q1.isValidPassword(""), -1);
        assertEquals(q1.isValidPassword(null), -1);
    }

    @Test
    public void shouldUpperCaseExist() {
        assertEquals(-1, q1.isValidPassword("0"));
        assertEquals(-1,
                q1.isValidPassword("000000000000000000000000000000000000000000000000000000000000000000000000000000a"));
        assertEquals(2,
                q1.isValidPassword("00000000000000000000000000000000000000000000000000000000000000000000000Aa01re"));
        assertEquals(-1, q1.isValidPassword("a"));
        assertEquals(q1.isValidPassword("a00a"), -1);
        assertEquals(q1.isValidPassword("a0bb"), -1);
        assertEquals(q1.isValidPassword("abbbbbbbbbbbbbbbbbbbzzzewewbb"), -1);
    }

    @Test
    public void shouldValidCases() {
        assertEquals(1, q1.isValidPassword("A"));
        assertEquals(q1.isValidPassword("a0Ba"), 2);
        assertEquals(q1.isValidPassword("a0bb"), -1);
        assertEquals(4, q1.isValidPassword("AAas0bb"));
        assertEquals(q1.isValidPassword("a0Ba5353Yjhaskhdsa3dksald3nadnaB5sadjnsalda0dsakdja1jhdkas"), 10);
        assertEquals(106, q1.isValidPassword(
                "00000000000000000000000000000003213213000000000000000423423423AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBaaaaaaa0ewqewqAAQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ"));
    }

}
