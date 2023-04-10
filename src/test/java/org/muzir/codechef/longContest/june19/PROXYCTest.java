package org.muzir.codechef.longContest.june19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PROXYCTest {

    @Test
    public void test() {
        assertEquals(1, PROXYC.solution("PAAPPAPPP"));
        assertEquals(0, PROXYC.solution("PAAPPPPPP"));
        assertEquals(-1, PROXYC.solution("PAAAAAAPP"));
        assertEquals(0, PROXYC.solution("PPPPPPPPP"));
        assertEquals(-1, PROXYC.solution("PAAP"));
        assertEquals(-1, PROXYC.solution("PAP"));
    }

    @Test
    public void test1() {
        assertEquals(-1, PROXYC.solution("PAP"));
    }
}
