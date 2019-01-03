package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VOWELTBTest {

  @Test
  public void test() {
    assertEquals("Consonant", VOWELTB.solution('C'));
    assertEquals("Consonant", VOWELTB.solution('Z'));
    assertEquals("Vowel", VOWELTB.solution('E'));
    assertEquals("Vowel", VOWELTB.solution('O'));
  }
}
