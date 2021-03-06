package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.muzir.codechef.practice.beginner.BITOBYT.ByteLand;

public class BITOBYTTest {

  @Test
  public void test1() {
    ByteLand byteLand = new ByteLand(0, 2, 0);
    assertEquals(BITOBYT.calculatePopulation(30), byteLand);
  }

  @Test
  public void test2() {
    ByteLand byteLand = new ByteLand(1, 0, 0);
    assertEquals(BITOBYT.calculatePopulation(2), byteLand);
  }

  @Test
  public void test3() {
    ByteLand byteLand = new ByteLand(0, 0, 2);
    assertEquals(BITOBYT.calculatePopulation(52), byteLand);
  }

  @Test
  public void test4() {
    ByteLand byteLand = new ByteLand(0, 0, 2);
    assertEquals(BITOBYT.calculatePopulation(48), byteLand);
  }

  @Test
  public void test5() {
    ByteLand byteLand = new ByteLand(0, 0, 1);
    assertEquals(byteLand, BITOBYT.calculatePopulation(26));
  }

  @Test
  public void test6() {
    ByteLand byteLand = new ByteLand(2, 0, 0);
    assertEquals(byteLand, BITOBYT.calculatePopulation(27));
  }

  @Test
  public void test7() {
    ByteLand byteLand = new ByteLand(2, 0, 0);
    assertEquals(byteLand, BITOBYT.calculatePopulation(27));
  }

  @Test
  public void test8() {
    ByteLand byteLand = new ByteLand(0, 32, 0);
    assertEquals(byteLand, BITOBYT.calculatePopulation(140));
  }
}
