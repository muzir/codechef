package org.muzir.interview.hackerrank.week2;

public class SuperDigit {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        // Write your code here
        if (n.length() == 1) {
            return Integer.parseInt(n);
        }

        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = Character.getNumericValue(n.charAt(i));
            sum = sum + digit;
        }
        sum = sum * k;
        return superDigit(String.valueOf(sum), 1);
    }
}