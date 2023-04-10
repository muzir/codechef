package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EIDTest {
  @Test
  public void test() {
    assertEquals(1, EID.solution("1 4 2"));
    assertEquals(0, EID.solution("1 3 3"));
    assertEquals(0, EID.solution("1000 1000 1 1 1 1 1"));
    assertEquals(0, EID.solution("1 9 1 9 1 9"));
    assertEquals(1, EID.solution("999998 999996 999992 999990 1000000 999999"));
  }
}
