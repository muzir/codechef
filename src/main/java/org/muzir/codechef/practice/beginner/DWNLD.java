package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DWNLD {

    private static boolean isCodechefModeOn = false;

    public static void main(String[] args) throws IOException {
        InputStream in = createInputStream();
        BufferedInputStream reader = new BufferedInputStream(in);
        DataInputStream dis = new DataInputStream(reader);
        int testCaseCount = Integer.parseInt(readLine(dis));
        for (int i = 0; i < testCaseCount; i++) {
            String nK = readLine(dis);
            String[] nkArray = nK.split(" ");
            int n = Integer.parseInt(nkArray[0]);
            int k = Integer.parseInt(nkArray[1]);
            List<InternetUsage> internetUsages = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                String input = readLine(dis);
                String[] td = input.split(" ");
                InternetUsage internetUsage = new InternetUsage(Integer.parseInt(td[0]), Integer.parseInt(td[1]));
                internetUsages.add(internetUsage);
            }
            internetUsages = reduceFreeMinutes(internetUsages, k);
            System.out.println(calculateInternetUsages(internetUsages));
        }
    }

    static int calculateInternetUsages(List<InternetUsage> internetUsages) {
        int accumulator = 0;
        for (InternetUsage iu : internetUsages) {
            accumulator = accumulator + iu.calculateAmount();
        }
        return accumulator;
    }

    static List<InternetUsage> reduceFreeMinutes(List<InternetUsage> internetUsages, int k) {
        if (internetUsages == null || internetUsages.isEmpty()) {
            return new ArrayList<>();
        } else if (k == 0) {
            return internetUsages;
        } else if (internetUsages.get(0).getT() > k) {
            int newT = internetUsages.get(0).getT() - k;
            internetUsages.get(0).setT(newT);
            return internetUsages;
        } else {
            int newK = k - internetUsages.get(0).getT();
            internetUsages.remove(0);
            return reduceFreeMinutes(internetUsages, newK);
        }
    }

    static class InternetUsage implements Iterable {
        private int t;
        private int d;

        public InternetUsage(int t, int d) {
            this.t = t;
            this.d = d;
        }

        public int getD() {
            return d;
        }

        public int getT() {
            return t;
        }

        public void setT(int t) {
            this.t = t;
        }

        public int calculateAmount() {
            return t * d;
        }

        @Override
        public Iterator iterator() {
            return null;
        }
    }

    private static InputStream createInputStream() throws FileNotFoundException {
        if (isCodechefModeOn) {
            return System.in;
        }
        String path = System.getProperty("user.dir");
        InputStream in = new FileInputStream(path + "/src/main/inputs/DWNLD.txt");
        return in;

    }

    @SuppressWarnings("deprecation")
    private static String readLine(DataInputStream reader) throws IOException {
        return reader.readLine();
    }
}
