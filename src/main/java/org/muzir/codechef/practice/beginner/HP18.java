package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class HP18 {
    private static boolean isCodechefModeOn = true;
    private static String ALICE = "ALICE";
    private static String BOB = "BOB";

    public static void main(String[] args) throws Exception {
        // your code goes here
        BufferedReader br = createInputStream();
        int testCaseCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCaseCount; i++) {
            String line = br.readLine();
            int a = Integer.parseInt(line.split(" ")[1]);
            int b = Integer.parseInt(line.split(" ")[2]);
            String arrayLine = br.readLine();
            System.out.println(findWinner(arrayLine, a, b));
        }
        br.close();
    }

    static String findWinner(String line, int a, int b) {
        String[] array = line.split(" ");
        int bobDivideCounter = 0;
        int aliceDivideCounter = 0;
        int lcwCounter = 0;
        int arrLenght = array.length;
        for (int i = 0; i < arrLenght; i++) {
            int element = Integer.parseInt(array[i]);
            if ((element % a) == 0) {
                bobDivideCounter = bobDivideCounter + 1;
            }
            if ((element % b) == 0) {
                aliceDivideCounter = aliceDivideCounter + 1;
            }
            if ((element % a) == 0 && (element % b) == 0) {
                lcwCounter = lcwCounter + 1;
                bobDivideCounter = bobDivideCounter - 1;
                aliceDivideCounter = aliceDivideCounter - 1;
            }
        }
        boolean isLcwCounterOdd = lcwCounter % 2 == 1;
        if (isLcwCounterOdd) {
            bobDivideCounter = bobDivideCounter + 1;
        }
        if (aliceDivideCounter >= bobDivideCounter) {
            return ALICE;
        }
        return BOB;
    }

    private static BufferedReader createInputStream() throws FileNotFoundException {
        InputStreamReader isr = null;
        if (isCodechefModeOn) {
            isr = new InputStreamReader(System.in);
        } else {
            String path = System.getProperty("user.dir");
            String filePath = path + "/src/main/inputs/HP18.txt";
            FileInputStream fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
        }
        BufferedReader br = new BufferedReader(isr);
        return br;
    }
}