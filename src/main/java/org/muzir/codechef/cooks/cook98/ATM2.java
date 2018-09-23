package org.muzir.codechef.cooks.cook98;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM2 {

    private static boolean isCodechefModeOn = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = createInputStream();
        int testCaseCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCaseCount; i++) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            String[] amounts = br.readLine().split(" ");
            System.out.println(getResults(k, amounts));
        }
        br.close();
    }

    private static String getResults(int k, String[] amounts) {
        String result = "";
        for (String s : amounts) {
            int amount = Integer.parseInt(s);
            if ((k - amount) >= 0) {
                result = result + "1";
                k = k - amount;
            } else {
                result = result + "0";
            }
        }
        return result;
    }

    private static BufferedReader createInputStream() throws FileNotFoundException {
        InputStreamReader isr = null;
        if (isCodechefModeOn) {
            isr = new InputStreamReader(System.in);
        } else {
            String path = System.getProperty("user.dir");
            String filePath = path + "/src/main/inputs/ATM2.txt";
            FileInputStream fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
        }
        BufferedReader br = new BufferedReader(isr);
        return br;
    }

}
