package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CHEFRUN {
  private static boolean isCodechefModeOn = false;

  public static void main(String[] args) throws IOException {
    BufferedReader br = createInputStream();
    int testCaseCount = Integer.parseInt(br.readLine());
    for (int i = 0; i < testCaseCount; i++) {
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int x1 = arr[0];
      int x2 = arr[1];
      int x3 = arr[2];
      int v1 = arr[3];
      int v2 = arr[4];
      System.out.println(printWinner(x1, x2, x3, v1, v2));
    }
    br.close();
  }

  private static String printWinner(int x1, int x2, int x3, int v1, int v2) {
    float t1 = (x3 - x1) / (float) v1;
    float t2 = (x2 - x3) / (float) v2;
    if (t1 > t2) {
      return "Kefa";
    } else if (t2 > t1) {
      return "Chef";
    }
    return "Draw";
  }

  private static BufferedReader createInputStream() throws FileNotFoundException {
    InputStreamReader isr = null;
    if (isCodechefModeOn) {
      isr = new InputStreamReader(System.in);
    } else {
      String path = System.getProperty("user.dir");
      String filePath = path + "/src/main/inputs/CHEFRUN.txt";
      FileInputStream fis = new FileInputStream(filePath);
      isr = new InputStreamReader(fis);
    }
    BufferedReader br = new BufferedReader(isr);
    return br;
  }
}
