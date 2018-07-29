package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUMCOMP {

    private static boolean isCodechefModeOn = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = createInputStream();
        int testCaseCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCaseCount; i++) {
            String abn = br.readLine();
            int[] params = Arrays.stream(abn.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
            System.out.println(solution(params[0], params[1], params[2]));
        }
        br.close();
    }


    static int solution(int a, int b, int n) {
        boolean isAPositive = isPositive(a);
        boolean isBPositive = isPositive(b);
        boolean isNEven = isEven(n);

        if (a == b) {
            return 0;
        } else if (isNEven & (Math.abs(a) == Math.abs(b))) {
            return 0;
        }

        boolean result = false;
        if (isAPositive && isBPositive) {
            result = compare(a, b);
        } else if (!isAPositive && isBPositive && !isNEven) {
            result = false;
        } else if (!isAPositive && isBPositive && isNEven) {
            result = compare(Math.abs(a), Math.abs(b));
        } else if (!isAPositive && !isBPositive && !isNEven) {
            result = !compare(Math.abs(a), Math.abs(b));
        }else if (!isAPositive && !isBPositive && isNEven) {
            result = compare(Math.abs(a), Math.abs(b));
        }else if (isAPositive && !isBPositive && isNEven) {
            result = compare(Math.abs(a), Math.abs(b));
        }
        else {
            result = compare(a, b);
        }

        if (result) {
            return 1;
        }
        return 2;

    }

    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }

    static boolean compare(int a, int b) {
        return a > b;
    }

    private static BufferedReader createInputStream() throws FileNotFoundException {
        InputStreamReader isr = null;
        if (isCodechefModeOn) {
            isr = new InputStreamReader(System.in);
        } else {
            String path = System.getProperty("user.dir");
            String filePath = path + "/src/main/inputs/NUMCOMP.txt";
            FileInputStream fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
        }
        BufferedReader br = new BufferedReader(isr);
        return br;
    }

}
