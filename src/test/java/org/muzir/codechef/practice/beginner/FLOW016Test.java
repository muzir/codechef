package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FLOW016Test {

    @Test
    public void testGcd() {
        assertEquals(1, FLOW016.gcd(120, 11));
        assertEquals(1, FLOW016.gcd(10213, 312));
        assertEquals(1, FLOW016.gcd(10, 3));
        assertEquals(4, FLOW016.gcd(12, 8));
        assertEquals(1, FLOW016.gcd(1, 1));
        assertEquals(2, FLOW016.gcd(2, 2));
        assertEquals(1000000, FLOW016.gcd(1000000, 1000000));
        assertEquals(1, FLOW016.gcd(1000000, 999999));
    }

    @Test
    public void testLcd() {
        assertEquals(new BigInteger("1320"), FLOW016.lcd(120, 11, 2));
        assertEquals(new BigInteger("3186456"), FLOW016.lcd(10213, 312, 2));
        assertEquals(new BigInteger("30"), FLOW016.lcd(10, 3, 2));
        assertEquals(new BigInteger("999999000000"), FLOW016.lcd(1000000, 999999, 2));
        assertEquals(new BigInteger("1"), FLOW016.lcd(1, 1, 2));
        assertEquals(new BigInteger("2"), FLOW016.lcd(2, 2, 2));
    }

}
