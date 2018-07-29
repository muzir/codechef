package org.muzir.codechef.longContest.july18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MGCSET {

    private static boolean isCodechefModeOn = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = createInputStream();
        int testCaseCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCaseCount; i++) {
            String nm = br.readLine();
            int n = Integer.parseInt(nm.split(" ")[0]);
            int m = Integer.parseInt(nm.split(" ")[1]);
            int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
            System.out.println(countSubArrayDivideByM(array, m, n));
        }
        br.close();
    }

    private static int countSubArrayDivideByM(int[] array, int m, int n) {
        int lenght = array.length;
        int counter = 0;
        for (int i = 0; i < lenght; i++) {
            if ((array[i] % m) == 0) {
                counter++;
            }
        }
        int pow = (int) (Math.pow(2, counter) - 1);
        return pow;
    }


    private static BufferedReader createInputStream() throws FileNotFoundException {
        InputStreamReader isr = null;
        if (isCodechefModeOn) {
            isr = new InputStreamReader(System.in);
        } else {
            String path = System.getProperty("user.dir");
            String filePath = path + "/MGCSET.txt";
            FileInputStream fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
        }
        BufferedReader br = new BufferedReader(isr);
        return br;
    }

}
