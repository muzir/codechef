package org.muzir.codechef.practice.beginner;

import java.io.*;


public class XENTASK {
    private static boolean isCodechefModeOn = false;

    public static void main(String[] args) throws IOException {
        InputStream in = createInputStream();
        BufferedInputStream reader = new BufferedInputStream(in);
        DataInputStream dis = new DataInputStream(reader);
        int testCaseCount = Integer.parseInt(readLine(dis));
        for (int i = 0; i < testCaseCount; i++) {
            int n = Integer.parseInt(readLine(dis));
            String xennyTask = readLine(dis);
            String yanaTask = readLine(dis);
            System.out.println(retrieveTotalMinTaskTime(xennyTask, yanaTask, n));
        }
    }

    public static int retrieveTotalMinTaskTime(String xennyTask, String yanaTask, int n) {
        int x = 0, y = 0;
        String[] xennyArray = xennyTask.split(" ");
        String[] yanaArray = yanaTask.split(" ");

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                x = x + Integer.parseInt(xennyArray[i]);
                y = y + Integer.parseInt(yanaArray[i]);
            } else {
                x = x + Integer.parseInt(yanaArray[i]);
                y = y + Integer.parseInt(xennyArray[i]);
            }
        }
        return Math.min(x, y);
    }

    private static InputStream createInputStream() throws FileNotFoundException {
        if (isCodechefModeOn) {
            return System.in;
        }
        String path = System.getProperty("user.dir");
        InputStream in = new FileInputStream(path + "/XENTASK.txt");
        return in;

    }

    @SuppressWarnings("deprecation")
    private static String readLine(DataInputStream reader) throws IOException {
        return reader.readLine();
    }

}
