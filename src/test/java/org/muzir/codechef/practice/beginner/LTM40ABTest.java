package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class LTM40ABTest {
    @Test
    public void shouldSolutionSucess(){
        int a=1;
        int b=10;
        int c=5;
        int d=10;
        Assert.assertEquals(39,LTM40AB.solution(a,b,c,d));
    }

}
