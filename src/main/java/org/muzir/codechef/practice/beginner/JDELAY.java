package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JDELAY {
  private static boolean isCodechefModeOn = false;

  public static void main(String[] args) throws IOException {
    BufferedReader br = createInputStream();
    int testCaseCount = Integer.parseInt(br.readLine());
    for (int i = 0; i < testCaseCount; i++) {
      int n = Integer.parseInt(br.readLine());
      int accumulator = 0;
      for (int j = 0; j < n; j++) {
        int[] params =
            Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (isGreaterThanFive(params[0], params[1])) {
          accumulator++;
        }
      }
      System.out.println(accumulator);
    }
    br.close();
  }

  private static boolean isGreaterThanFive(int n1, int n2) {
    return n2 - n1 > 5;
  }

  private static BufferedReader createInputStream() throws FileNotFoundException {
    InputStreamReader isr = null;
    if (isCodechefModeOn) {
      isr = new InputStreamReader(System.in);
    } else {
      String path = System.getProperty("user.dir");
      String filePath = path + "/src/main/inputs/JDELAY.txt";
      FileInputStream fis = new FileInputStream(filePath);
      isr = new InputStreamReader(fis);
    }
    BufferedReader br = new BufferedReader(isr);
    return br;
  }
}
