package org.muzir.codechef.longContest.july18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class PINS {

    private static boolean isCodechefModeOn = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = createInputStream();
        int testCaseCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCaseCount; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(1 + " " + solution(n));
        }
        br.close();
    }

    private static String solution(int n) {
        if (n == 1) {
            return "1";
        }
        int half = n / 2;
        StringBuilder sb = new StringBuilder("1");
        for (int i = 0; i < half; i++) {
            sb.append("0");
        }
        return sb.toString();
    }

    private static BufferedReader createInputStream() throws FileNotFoundException {
        InputStreamReader isr = null;
        if (isCodechefModeOn) {
            isr = new InputStreamReader(System.in);
        } else {
            String path = System.getProperty("user.dir");
            String filePath = path + "/src/main/inputs/PINS.txt";
            FileInputStream fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
        }
        BufferedReader br = new BufferedReader(isr);
        return br;
    }

}
