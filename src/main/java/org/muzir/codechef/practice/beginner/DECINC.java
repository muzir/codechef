package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DECINC {
  private static boolean isCodechefModeOn = false;

  public static void main(String[] args) throws IOException {
    BufferedReader br = createInputStream();
    int n = Integer.parseInt(br.readLine());
    int result = (n % 4 == 0) ? n + 1 : n - 1;
    System.out.println(result);
    br.close();
  }

  private static BufferedReader createInputStream() throws FileNotFoundException {
    InputStreamReader isr = null;
    if (isCodechefModeOn) {
      isr = new InputStreamReader(System.in);
    } else {
      String path = System.getProperty("user.dir");
      String filePath = path + "/src/main/inputs/DECINC.txt";
      FileInputStream fis = new FileInputStream(filePath);
      isr = new InputStreamReader(fis);
    }
    BufferedReader br = new BufferedReader(isr);
    return br;
  }
}
