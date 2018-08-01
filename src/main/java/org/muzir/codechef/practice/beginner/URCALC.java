package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class URCALC {

    private static boolean isCodechefModeOn = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = createInputStream();
        double firstNumber = Integer.parseInt(br.readLine());
        double secondNumber = Integer.parseInt(br.readLine());
        String operator = br.readLine();
        System.out.println(calculator(firstNumber, secondNumber, operator));
        br.close();
    }

    private static String calculator(double firstNumber, double secondNumber, String operator) {
        double result = 0;
        if (operator.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operator.equals("/")) {
            result = firstNumber / secondNumber;
        } else {
            result = firstNumber * secondNumber;
        }
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(7);
        df.setGroupingUsed(false);
        return df.format(result);
    }

    private static BufferedReader createInputStream() throws FileNotFoundException {
        InputStreamReader isr = null;
        if (isCodechefModeOn) {
            isr = new InputStreamReader(System.in);
        } else {
            String path = System.getProperty("user.dir");
            String filePath = path + "/src/main/inputs/URCALC.txt";
            FileInputStream fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
        }
        BufferedReader br = new BufferedReader(isr);
        return br;
    }
}
