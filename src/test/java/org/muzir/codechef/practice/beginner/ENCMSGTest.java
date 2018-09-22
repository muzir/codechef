package org.muzir.codechef.practice.beginner;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class ENCMSGTest {

    @Test
    public void swapTest() {
        char[] arr = {'b', 'a', 'c'};
        Assert.assertTrue(Arrays.equals(arr, ENCMSG.swap("abc")));
    }

    @Test
    public void swapTest1() {
        char[] arr = {'b', 'a'};
        Assert.assertTrue(Arrays.equals(arr, ENCMSG.swap("ab")));
    }

    @Test
    public void swapTest2() {
        char[] arr = {'b', 'a', 'd', 'c'};
        Assert.assertTrue(Arrays.equals(arr, ENCMSG.swap("abcd")));
    }

    @Test
    public void findEncodedCharTest() {
        Assert.assertEquals('a', ENCMSG.findEncodedChar('z'));
        Assert.assertEquals('b', ENCMSG.findEncodedChar('y'));
        Assert.assertEquals('u', ENCMSG.findEncodedChar('f'));
        Assert.assertEquals('m', ENCMSG.findEncodedChar('n'));
        Assert.assertEquals('p', ENCMSG.findEncodedChar('k'));
        Assert.assertEquals('t', ENCMSG.findEncodedChar('g'));
        Assert.assertEquals('x', ENCMSG.findEncodedChar('c'));
    }

    @Test
    public void encodeMessageTest() {
        Assert.assertEquals("shizxvzsg", ENCMSG.encodeMessage("sharechat"));
        Assert.assertEquals("sxuv", ENCMSG.encodeMessage("chef"));
        Assert.assertEquals("z", ENCMSG.encodeMessage("a"));
        Assert.assertEquals("yz", ENCMSG.encodeMessage("ab"));
    }
}
