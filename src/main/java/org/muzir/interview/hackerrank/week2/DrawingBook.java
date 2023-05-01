package org.muzir.interview.hackerrank.week2;

public class DrawingBook {
    public static void main(String[] args) {
        System.out.println(pageCount(5, 3));
        System.out.println(pageCount(6, 2));
        System.out.println(pageCount(5, 4));
        System.out.println(pageCount(7, 4));
        System.out.println(pageCount(6, 5));
    }

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */
    public static int pageCount(int n, int p) {
        // Write your code here
        int frontSteps = Math.round(((float) p - 1f) / 2f);
        if ((n - p) == 1 && (n % 2 == 1)) {
            return 0;
        }
        if (n % 2 == 1) {
            n = n - 1;
        }
        int tailSteps = Math.round((float) (n - p) / 2f);
        return Math.min(frontSteps, tailSteps);
    }
}
