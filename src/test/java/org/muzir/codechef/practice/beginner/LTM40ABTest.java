package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by erhun.baycelik on 24/04/2017.
 */
public class LTM40ABTest {
    @Test
    public void shouldSolutionSucess(){
        int a=2;
        int b=3;
        int c=3;
        int d=4;
        Assert.assertEquals(3,LTM40AB.solution(a,b,c,d));
    }
}
