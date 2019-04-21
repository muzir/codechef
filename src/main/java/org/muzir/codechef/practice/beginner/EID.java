package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EID {
  private static boolean isCodechefModeOn = false;

  public static void main(String[] args) throws IOException {
    BufferedReader br = createInputStream();
    int testCaseCount = Integer.parseInt(br.readLine());
    for (int i = 0; i < testCaseCount; i++) {
      int coinCount = Integer.parseInt(br.readLine());
      System.out.println(solution(br.readLine()));
    }
    br.close();
  }

  public static int solution(String s) {
    int[] sortedArray = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
    int length = sortedArray.length - 1;
    int min = sortedArray[0];
    for (int i = 0; i < length; i++) {
      int current = sortedArray[i];
      int next = sortedArray[i + 1];
      int diff = next - current;
      if (diff < min) {
        min = diff;
      }
      if (min == 0) {
        break;
      }
    }
    return min;
  }

  private static BufferedReader createInputStream() throws FileNotFoundException {
    InputStreamReader isr = null;
    if (isCodechefModeOn) {
      isr = new InputStreamReader(System.in);
    } else {
      String path = System.getProperty("user.dir");
      String filePath = path + "/src/main/inputs/EID.txt";
      FileInputStream fis = new FileInputStream(filePath);
      isr = new InputStreamReader(fis);
    }
    BufferedReader br = new BufferedReader(isr);
    return br;
  }
}
