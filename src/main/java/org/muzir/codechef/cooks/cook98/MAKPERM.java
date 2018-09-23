package org.muzir.codechef.cooks.cook98;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MAKPERM {

    private static boolean isCodechefModeOn = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = createInputStream();
        int testCaseCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCaseCount; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(calculateMinMoveCount(array));
        }
        br.close();
    }

    private static int calculateMinMoveCount(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        int moveCounter = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != (i + 1)) {
                moveCounter++;
            }
        }
        return moveCounter;
    }

    private static BufferedReader createInputStream() throws FileNotFoundException {
        InputStreamReader isr = null;
        if (isCodechefModeOn) {
            isr = new InputStreamReader(System.in);
        } else {
            String path = System.getProperty("user.dir");
            String filePath = path + "/src/main/inputs/MAKPERM.txt";
            FileInputStream fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
        }
        BufferedReader br = new BufferedReader(isr);
        return br;
    }
}
