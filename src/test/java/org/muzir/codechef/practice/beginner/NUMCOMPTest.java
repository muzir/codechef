package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NUMCOMPTest {

    @Test
    public void test1() {
        assertEquals(NUMCOMP.solution(3, 4, 5), 2);
        assertEquals(NUMCOMP.solution(3, 4, 4), 2);
        assertEquals(NUMCOMP.solution(-3, 2, 3), 2);
        assertEquals(NUMCOMP.solution(-3, 2, 4), 1);
        assertEquals(NUMCOMP.solution(-2, 3, 5), 2);
        assertEquals(NUMCOMP.solution(-2, 3, 4), 2);
        assertEquals(NUMCOMP.solution(3, -2, 4), 1);
        assertEquals(NUMCOMP.solution(3, -2, 3), 1);
        assertEquals(NUMCOMP.solution(-3, -3, 3), 0);
        assertEquals(NUMCOMP.solution(3, 3, 3), 0);
        assertEquals(NUMCOMP.solution(-3, -8, 2), 2);
        assertEquals(NUMCOMP.solution(-9, -8, 2), 1);
        assertEquals(NUMCOMP.solution(-9, 8, 2), 1);
        assertEquals(NUMCOMP.solution(-9, 8, 3), 2);
        assertEquals(NUMCOMP.solution(0, 8, 3), 2);
        assertEquals(NUMCOMP.solution(0, -8, 3), 1);
        assertEquals(NUMCOMP.solution(0, -8, 4), 2);
        assertEquals(NUMCOMP.solution(0, 0, 4), 0);
        assertEquals(NUMCOMP.solution(-1, 0, 3), 2);
        assertEquals(NUMCOMP.solution(-1, 0, 4), 1);
        assertEquals(NUMCOMP.solution(-1, 0, 1), 2);
        assertEquals(NUMCOMP.solution(2, -3, 4), 2);
    }

    @Test
    public void test2() {
        assertEquals(NUMCOMP.solution(-334467, 334467, 2348876), 0);
        assertEquals(NUMCOMP.solution(334467, -334467, 2348876), 0);
        assertEquals(NUMCOMP.solution(-334467, 334467, 2348877), 2);
        assertEquals(NUMCOMP.solution(334467, -334467, 2348877), 1);
        assertEquals(NUMCOMP.solution(363756450, 712662868, 24979445), 2);
        assertEquals(NUMCOMP.solution(586260100, -192321079, 476190629), 1);
        assertEquals(NUMCOMP.solution(-10, 18, 628894325), 2);
        assertEquals(NUMCOMP.solution(-354684803, -49687658, 430302156), 1);
        assertEquals(NUMCOMP.solution(853829789, 470958158, 923078537), 1);
        assertEquals(NUMCOMP.solution(-16, -10, 802329211), 2);
        assertEquals(NUMCOMP.solution(-19, -20, 492686568), 2);
        assertEquals(NUMCOMP.solution(23704508, 150490716, 839296263), 2);

        assertEquals(NUMCOMP.solution(14, 8, 191890310), 1);
        assertEquals(NUMCOMP.solution(-20, -13, 818008580), 1);
       // assertEquals(NUMCOMP.solution(2, -15, 840594328), 2);
        assertEquals(NUMCOMP.solution(301010289, 367300984, 501899080), 2);
        assertEquals(NUMCOMP.solution(949600446, 943054987, 350034067), 1);
        assertEquals(NUMCOMP.solution(16, 10, 533206504), 1);
        assertEquals(NUMCOMP.solution(8, 7, 677959980), 1);
    }

    @Test
    public void test3(){
        assertEquals(NUMCOMP.solution(2, -15, 840594328), 2);
    }

}
