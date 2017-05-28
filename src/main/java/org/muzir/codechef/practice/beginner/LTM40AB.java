package org.muzir.codechef.practice.beginner;

import java.io.*;

public class LTM40AB {

    private static boolean isCodechefModeOn = false;

    public static void main(String[] args) throws IOException {
        InputStream in = createInputStream();
        BufferedInputStream reader = new BufferedInputStream(in);
        DataInputStream dis = new DataInputStream(reader);
        int testCaseCount = Integer.parseInt(readLine(dis));
        for (int i = 0; i < testCaseCount; i++) {
            String line = readLine(dis);
            int[] params = getArrayOfString(line);
            System.out.println(solution(params[0], params[1], params[2], params[3]));
        }
    }

    private static int[] getArrayOfString(String input) {
        String[] arrayStr = input.split(" ");
        int lenght = arrayStr.length;
        int[] returnArray = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            returnArray[i] = Integer.parseInt(arrayStr[i]);
        }
        return returnArray;
    }

    public static long solution(int a, int b, int c, int d) {
        long accumulator = 0;
        for (int y = c; y <= d; y++) {
            for (int x = a; x <= b; x++) {
                if (y > x) {
                    accumulator = (d - y) + 1 + accumulator;
                    a++;
                }
            }
        }
        return accumulator;
    }

    private static InputStream createInputStream() throws FileNotFoundException {
        if (isCodechefModeOn) {
            return System.in;
        }
        String path = System.getProperty("user.dir");
        InputStream in = new FileInputStream(path + "/LTM40AB.txt");
        return in;

    }
    @SuppressWarnings("deprecation")
    private static String readLine(DataInputStream reader) throws IOException {
        return reader.readLine();
    }
}
