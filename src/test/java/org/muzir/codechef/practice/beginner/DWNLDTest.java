package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DWNLDTest {

    @Test
    public void should_reduce_free_minutes() {
        DWNLD.InternetUsage iu = new DWNLD.InternetUsage(1, 1);
        ArrayList<DWNLD.InternetUsage> internetUsages = new ArrayList<>();
        internetUsages.add(iu);

        List<DWNLD.InternetUsage> actualInternetUsages = DWNLD.reduceFreeMinutes(internetUsages, 1);
        Assert.assertTrue(actualInternetUsages.isEmpty());
    }

    @Test
    public void should_reduce_free_minutes_case_1() {
        DWNLD.InternetUsage iu = new DWNLD.InternetUsage(2, 1);
        ArrayList<DWNLD.InternetUsage> internetUsages = new ArrayList<>();
        internetUsages.add(iu);

        List<DWNLD.InternetUsage> actualInternetUsages = DWNLD.reduceFreeMinutes(internetUsages, 1);
        Assert.assertTrue(actualInternetUsages.size() == 1);
    }

    @Test
    public void should_reduce_free_minutes_case_2() {
        DWNLD.InternetUsage iu = new DWNLD.InternetUsage(2, 1);
        DWNLD.InternetUsage iu1 = new DWNLD.InternetUsage(2, 1);
        DWNLD.InternetUsage iu2 = new DWNLD.InternetUsage(2, 1);
        DWNLD.InternetUsage iu3 = new DWNLD.InternetUsage(2, 1);
        ArrayList<DWNLD.InternetUsage> internetUsages = new ArrayList<>();
        internetUsages.add(iu);
        internetUsages.add(iu1);
        internetUsages.add(iu2);
        internetUsages.add(iu3);

        List<DWNLD.InternetUsage> actualInternetUsages = DWNLD.reduceFreeMinutes(internetUsages, 5);
        Assert.assertTrue(actualInternetUsages.size() == 2);
        Assert.assertEquals(DWNLD.calculateInternetUsages(actualInternetUsages), 3);
    }
}
