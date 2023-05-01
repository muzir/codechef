package org.muzir.interview.hackerrank.mock.test.week1;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;

public class FlippingMatrix {
    public static void main(String[] args) {

        System.out.println(flippingMatrix(
                List.of(new ArrayList<>(List.of(112, 42, 83, 119)), new ArrayList<>(List.of(56, 125, 56, 49)),
                        new ArrayList<>(List.of(15, 78, 101, 43)),
                        new ArrayList<>(List.of(62, 98, 114, 108)))));
    }

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int reverseCounter = 0;
        int matrixSize = matrix.size();
        int subSize = matrixSize / 2;
        for (int i = 0; i < subSize; i++) {
            List<Integer> row = matrix.get(i);
            int currentRowSum = sum(row, subSize);
            List<Integer> reverseRow = new ArrayList<>(row);
            reverse(reverseRow);
            int reverseRowSum = sum(reverseRow, subSize);
            if (reverseRowSum > currentRowSum) {
                reverse(row);
                reverseCounter = reverseCounter + 1;
            }
        }

        for (int i = 0, j = 0; i < matrix.get(0).size(); i++, j++) {
            
        }

        System.out.println(matrix);
        return -1;
    }

    private static int sum(List<Integer> list, int subSize) {
        int cumulative = 0;
        for (int i = 0; i < subSize; i++) {
            cumulative = cumulative + list.get(i);
        }
        return cumulative;
    }
}
