package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class BITOBYT {
  private static boolean isCodechefModeOn = false;

  public static void main(String[] args) throws IOException {
    BufferedReader br = createInputStream();
    int testCaseCount = Integer.parseInt(br.readLine());

    for (int i = 0; i < testCaseCount; i++) {
      int n = Integer.parseInt(br.readLine());
      System.out.println(calculatePopulation(n - 1).toString());
    }
    br.close();
  }

  private static BufferedReader createInputStream() throws FileNotFoundException {
    InputStreamReader isr = null;
    if (isCodechefModeOn) {
      isr = new InputStreamReader(System.in);
    } else {
      String path = System.getProperty("user.dir");
      String filePath = path + "/src/main/inputs/BITOBYT.txt";
      FileInputStream fis = new FileInputStream(filePath);
      isr = new InputStreamReader(fis);
    }
    BufferedReader br = new BufferedReader(isr);
    return br;
  }

  static ByteLand calculatePopulation(int n) {
    int x = n / 26;
    int y = n % 26;
    ByteLand byteLand = new ByteLand();
    byteLand.calculatePopulation(x, y);
    return byteLand;
  }

  static class ByteLand {
    private long bitCount;
    private long nibllesCount;
    private long byteCount;

    public ByteLand() {}

    public ByteLand(int bits, int nibbles, int bytes) {
      this.bitCount = bits;
      this.nibllesCount = nibbles;
      this.byteCount = bytes;
    }

    public void calculatePopulation(int x, int y) {
      long population = (long) Math.pow(2, x);
      if (y < 2) {
        bitCount = population;
      } else if (2 <= y && y < 10) {
        nibllesCount = population;
      } else {
        byteCount = population;
      }
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      ByteLand byteLand = (ByteLand) o;
      return bitCount == byteLand.bitCount
          && nibllesCount == byteLand.nibllesCount
          && byteCount == byteLand.byteCount;
    }

    @Override
    public int hashCode() {

      return Objects.hash(bitCount, nibllesCount, byteCount);
    }

    @Override
    public String toString() {
      return bitCount + " " + nibllesCount + " " + byteCount;
    }
  }
}
