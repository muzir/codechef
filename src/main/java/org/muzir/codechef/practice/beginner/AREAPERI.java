package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class AREAPERI {
  private static boolean isCodechefModeOn = false;

  public static void main(String[] args) throws IOException {
    BufferedReader br = createInputStream();
    int lenght = Integer.parseInt(br.readLine());
    int breadth = Integer.parseInt(br.readLine());
    solution(lenght, breadth);
    br.close();
  }

  public static void solution(int lenght, int breadth) {
    int area = lenght * breadth;
    int peri = 2 * (lenght + breadth);
    int result = Math.max(area, peri);
    if (area == peri) {
      System.out.println("Eq");
    } else if (area > peri) {
      System.out.println("Area");
    } else {
      System.out.println("Peri");
    }
    System.out.println(result);
  }

  private static BufferedReader createInputStream() throws FileNotFoundException {
    InputStreamReader isr = null;
    if (isCodechefModeOn) {
      isr = new InputStreamReader(System.in);
    } else {
      String path = System.getProperty("user.dir");
      String filePath = path + "/src/main/inputs/AREAPERI.txt";
      FileInputStream fis = new FileInputStream(filePath);
      isr = new InputStreamReader(fis);
    }
    BufferedReader br = new BufferedReader(isr);
    return br;
  }
}
