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

        while (reverseCounter > 0) {
            reverseCounter = 0;
            reverseCounter = iterateRows(matrix, reverseCounter, subSize);
            reverseCounter = iterateColumns(matrix, reverseCounter, subSize);
        }
        System.out.println(matrix);
        return calculateUpperLeftMatrix(matrix, subSize);
    }

    private static int calculateUpperLeftMatrix(List<List<Integer>> matrix, int subSize) {
        return 0;
    }

    private static int iterateColumns(List<List<Integer>> matrix, int reverseCounter, int subSize) {
        for (int i = 0; i < matrix.size(); i++) {
            if (shouldReverseColumn(matrix, i, subSize)) {
                reverseColumn(matrix, i);
                reverseCounter = reverseCounter + 1;
            }
        }
        return reverseCounter;
    }

    private static void reverseColumn(List<List<Integer>> matrix, int colIndex) {
        List<Integer> colList = getColList(matrix, colIndex);
        reverse(colList);
        for (int i = 0; i < matrix.size(); i++) {
            matrix.get(i).set(colIndex, colList.get(i));
        }
    }

    private static boolean shouldReverseColumn(List<List<Integer>> matrix, int cIndex, int subSize) {
        List<Integer> colList = getColList(matrix, cIndex);
        return shouldReverse(colList, subSize);
    }

    private static List<Integer> getColList(List<List<Integer>> matrix, int cIndex) {
        List<Integer> colList = new ArrayList<>();
        for (int i = 0; i < matrix.get(0).size(); i++) {
            colList.add(matrix.get(i).get(cIndex));
        }
        return colList;
    }

    private static int iterateRows(List<List<Integer>> matrix, int reverseCounter, int subSize) {
        for (int i = 0; i < matrix.size(); i++) {
            List<Integer> row = matrix.get(i);
            if (shouldReverse(row, subSize)) {
                reverse(row);
                reverseCounter = reverseCounter + 1;
            }
        }
        return reverseCounter;
    }

    static boolean shouldReverse(List<Integer> ls, int subSize) {
        int currentRowSum = sum(ls, subSize);
        List<Integer> reverseRow = new ArrayList<>(ls);
        reverse(reverseRow);
        int reverseRowSum = sum(reverseRow, subSize);
        return reverseRowSum > currentRowSum;
    }

    private static int sum(List<Integer> list, int subSize) {
        int cumulative = 0;
        for (int i = 0; i < subSize; i++) {
            cumulative = cumulative + list.get(i);
        }
        return cumulative;
    }
}
