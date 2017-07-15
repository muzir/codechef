package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class XENTASKTest {
    @Test
    public void test() {
        String xenny = "2 1 2";
        String yana = "3 2 1";
        Assert.assertEquals(5, XENTASK.retrieveTotalMinTaskTime(xenny, yana, 3));
    }

    @Test
    public void test1() {
        StringBuilder tasks = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            tasks.append("100000").append(" ");
        }
        String xenny = tasks.toString();
        String yana = tasks.toString();
        Long start = System.currentTimeMillis();
        Assert.assertEquals(2_000_000_000, XENTASK.retrieveTotalMinTaskTime(xenny, yana, 20000));
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
