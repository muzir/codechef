package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ENCMSGTest {

    @Test
    public void swapTest() {
        char[] arr = {'b', 'a', 'c'};
        assertTrue(Arrays.equals(arr, ENCMSG.swap("abc")));
    }

    @Test
    public void swapTest1() {
        char[] arr = {'b', 'a'};
        assertTrue(Arrays.equals(arr, ENCMSG.swap("ab")));
    }

    @Test
    public void swapTest2() {
        char[] arr = {'b', 'a', 'd', 'c'};
        assertTrue(Arrays.equals(arr, ENCMSG.swap("abcd")));
    }

    @Test
    public void findEncodedCharTest() {
        assertEquals('a', ENCMSG.findEncodedChar('z'));
        assertEquals('b', ENCMSG.findEncodedChar('y'));
        assertEquals('u', ENCMSG.findEncodedChar('f'));
        assertEquals('m', ENCMSG.findEncodedChar('n'));
        assertEquals('p', ENCMSG.findEncodedChar('k'));
        assertEquals('t', ENCMSG.findEncodedChar('g'));
        assertEquals('x', ENCMSG.findEncodedChar('c'));
    }

    @Test
    public void encodeMessageTest() {
        assertEquals("shizxvzsg", ENCMSG.encodeMessage("sharechat"));
        assertEquals("sxuv", ENCMSG.encodeMessage("chef"));
        assertEquals("z", ENCMSG.encodeMessage("a"));
        assertEquals("yz", ENCMSG.encodeMessage("ab"));
    }
}
