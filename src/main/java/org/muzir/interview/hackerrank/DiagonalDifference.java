package org.muzir.interview.hackerrank;

import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        System.out.println(diagonalDifference(List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(9, 8, 9))));
        System.out.println(diagonalDifference(List.of(List.of(11, 2, 4), List.of(4, 5, 6), List.of(10, 8, -12))));
    }

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftToRightCumulative = 0;
        for (int i = 0, j = 0; i < arr.size(); i++, j++) {
            leftToRightCumulative = leftToRightCumulative + arr.get(i).get(j);
        }
        int rightToLeftCumulative = 0;
        for (int i = 0, j = arr.get(0).size() - 1; i < arr.size(); i++, j--) {
            rightToLeftCumulative = rightToLeftCumulative + arr.get(i).get(j);
        }
        return Math.abs(leftToRightCumulative - rightToLeftCumulative);
    }
}
