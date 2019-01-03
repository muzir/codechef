package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class VOWELTB {
  private static boolean isCodechefModeOn = false;
  private static final Character[] VOWELS = {'A', 'E', 'I', 'O', 'U'};

  public static void main(String[] args) throws IOException {
    BufferedReader br = createInputStream();
    char c = br.readLine().charAt(0);
    System.out.println(solution(c));
    br.close();
  }

  private static BufferedReader createInputStream() throws FileNotFoundException {
    InputStreamReader isr = null;
    if (isCodechefModeOn) {
      isr = new InputStreamReader(System.in);
    } else {
      String path = System.getProperty("user.dir");
      String filePath = path + "/src/main/inputs/VOWELTB.txt";
      FileInputStream fis = new FileInputStream(filePath);
      isr = new InputStreamReader(fis);
    }
    BufferedReader br = new BufferedReader(isr);
    return br;
  }

  static String solution(char c) {
    if (Arrays.stream(VOWELS).filter(x -> x == c).findAny().isPresent()) {
      return "Vowel";
    }
    return "Consonant";
  }
}
