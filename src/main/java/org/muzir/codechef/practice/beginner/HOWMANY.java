package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class HOWMANY {

    private static boolean isCodechefModeOn = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = createInputStream();
        String param = br.readLine();
        solution(param);
        br.close();
    }

    public static void solution(String param) {
        int l = param.length();
        if (l == 1) {
            System.out.println("1");
        } else if (l == 2) {
            System.out.println("2");
        } else if (l == 3) {
            System.out.println("3");
        } else {
            System.out.println("More than 3 digits");
        }
    }

    private static BufferedReader createInputStream() throws FileNotFoundException {
        InputStreamReader isr = null;
        if (isCodechefModeOn) {
            isr = new InputStreamReader(System.in);
        } else {
            String path = System.getProperty("user.dir");
            String filePath = path + "/HOWMANY.txt";
            FileInputStream fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
        }
        BufferedReader br = new BufferedReader(isr);
        return br;
    }
}
