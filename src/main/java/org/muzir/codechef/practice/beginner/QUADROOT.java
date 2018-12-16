package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class QUADROOT {

  private static boolean isCodechefModeOn = false;

  public static void main(String[] args) throws IOException {
    BufferedReader br = createInputStream();
    double a = Double.parseDouble(br.readLine());
    double b = Double.parseDouble(br.readLine());
    double c = Double.parseDouble(br.readLine());
    solveQuadraticEquation(a, b, c);
    br.close();
  }

  static void solveQuadraticEquation(double a, double b, double c) {
    double determinant = (b * b) - (4 * a * c);
    DecimalFormat formater = new DecimalFormat("#0.0000000000");
    double x1 = (-b + Math.sqrt(determinant)) / (2 * a);
    double x2 = (-b - Math.sqrt(determinant)) / (2 * a);
    System.out.println(formater.format(x1));
    System.out.println(formater.format(x2));
  }

  private static BufferedReader createInputStream() throws FileNotFoundException {
    InputStreamReader isr = null;
    if (isCodechefModeOn) {
      isr = new InputStreamReader(System.in);
    } else {
      String path = System.getProperty("user.dir");
      String filePath = path + "/src/main/inputs/QUADROOT.txt";
      FileInputStream fis = new FileInputStream(filePath);
      isr = new InputStreamReader(fis);
    }
    BufferedReader br = new BufferedReader(isr);
    return br;
  }
}
