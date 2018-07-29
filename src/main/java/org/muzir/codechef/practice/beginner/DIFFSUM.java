package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DIFFSUM {

    private static boolean isCodechefModeOn = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = createInputStream();
        int firstNumber = Integer.parseInt(br.readLine());
        int secondNumber = Integer.parseInt(br.readLine());
        System.out.println(printDiffSum(firstNumber, secondNumber));
        br.close();
    }

    private static int printDiffSum(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        }
        return firstNumber + secondNumber;
    }

    private static BufferedReader createInputStream() throws FileNotFoundException {
        InputStreamReader isr = null;
        if (isCodechefModeOn) {
            isr = new InputStreamReader(System.in);
        } else {
            String path = System.getProperty("user.dir");
            String filePath = path + "/src/main/inputs/DIFFSUM.txt";
            FileInputStream fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
        }
        BufferedReader br = new BufferedReader(isr);
        return br;
    }
}
