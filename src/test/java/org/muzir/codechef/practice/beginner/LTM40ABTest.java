package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LTM40ABTest {
    @Test
    public void shouldSolutionSucess(){
        int a=1;
        int b=10;
        int c=5;
        int d=10;
        assertEquals(39,LTM40AB.solution(a,b,c,d));
    }

}
