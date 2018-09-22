package org.muzir.codechef.longContest.august18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class SPELLBOB {

    private static boolean isCodechefModeOn = false;
    private final static char O = 'o';
    private final static char B = 'b';
    private final static char X = 'x';
    private final static char Z = 'z';

    public static void main(String[] args) throws IOException {
        BufferedReader br = createInputStream();
        int testCaseCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCaseCount; i++) {
            String top = br.readLine();
            String bottom = br.readLine();
            System.out.println(spellCheck(top, bottom));
        }
        br.close();
    }

    private static String spellCheck(String top, String bottom) {
        int bCounter = 0;
        int oCounter = 0;
        int xCounter = 0;
        for (int i = 0; i < 3; i++) {
            char t = top.charAt(i);
            char b = bottom.charAt(i);
            char c = getChar(t, b);
            if (c == B) {
                bCounter++;
            } else if (c == O) {
                oCounter++;
            } else if (c == X) {
                xCounter++;
            }
        }

        int remainingB = 2 - bCounter;
        int remainingO = 1 - oCounter;

        if (remainingB < 0 || remainingO < 0) {
            return "no";
        }

        int result = remainingB + remainingO;

        if (result == 0) {return "yes";}

        if (result == xCounter) {
            return "yes";
        }
        return "no";
    }

    private static char getChar(char t, char b) {
        if (t == b) {
            return t;
        }
        if (t == O & b == B) {
            return X;
        } else if (t == B & b == O) {
            return X;
        } else if (t == B || b == B) {
            return B;
        } else if (t == O || b == O) {
            return O;
        }
        return Z;
    }

    private static BufferedReader createInputStream() throws FileNotFoundException {
        InputStreamReader isr = null;
        if (isCodechefModeOn) {
            isr = new InputStreamReader(System.in);
        } else {
            String path = System.getProperty("user.dir");
            String filePath = path + "/src/main/inputs/SPELLBOB.txt";
            FileInputStream fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
        }
        BufferedReader br = new BufferedReader(isr);
        return br;
    }

}
