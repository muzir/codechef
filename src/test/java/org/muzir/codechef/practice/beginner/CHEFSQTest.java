package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CHEFSQTest {

    @Test
    public void test() {
        String[] sequence = {"1", "2", "3", "4", "5", "6"};
        String[] favouriteSequence = {"2", "3", "4"};
        assertEquals("Yes", CHEFSQ.isContain(sequence, favouriteSequence));
    }

    @Test
    public void test1() {
        String[] sequence = {"22", "5", "15", "6", "33", "1", "4"};
        String[] favouriteSequence = {"4", "15"};
        assertEquals("Yes", CHEFSQ.isContain(sequence, favouriteSequence));
    }

    @Test
    public void test2() {
        String[] sequence = {};
        String[] favouriteSequence = {"4", "15"};
        assertEquals("No", CHEFSQ.isContain(sequence, favouriteSequence));

    }

    @Test
    public void test3() {
        String[] sequence = {};
        String[] favouriteSequence = {};
        assertEquals("Yes", CHEFSQ.isContain(sequence, favouriteSequence));

    }

    @Test
    public void test4() {
        String[] sequence = {" "};
        String[] favouriteSequence = {" "};
        assertEquals("Yes", CHEFSQ.isContain(sequence, favouriteSequence));
    }

    @Test
    public void test6() {
        String[] sequence = {"1", "3", "4", "3"};
        String[] favouriteSequence = {"1", "4"};
        assertEquals("Yes", CHEFSQ.isContain(sequence, favouriteSequence));
    }

    @Test
    public void test7() {
        String[] sequence = {"1", "3", "4", "4", "3"};
        String[] favouriteSequence = {"1", "3"};
        assertEquals("Yes", CHEFSQ.isContain(sequence, favouriteSequence));
    }
}
