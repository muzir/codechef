package org.muzir.interview.hackerrank.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMin {
    public static void main(String[] args) {
        //int[] arr = {1, 4, 7, 2};
        //int[] arr = {1, 2, 3, 4, 10, 20, 30, 40, 100, 200};
        int[] arr = {1, 2, 3, 4, 10, 20, 30, 40, 100, 200};
        List ls = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(maxMin(4, ls));
    }

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */
    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.naturalOrder());
        int min = arr.get(k - 1);
        for (int i = 0; i < arr.size(); i++) {
            if (i + k > arr.size()) {
                break;
            }
            List<Integer> subList = arr.subList(i, i + k);
            min = Math.min(min, calculateMinMax(subList));
        }
        return min;
    }

    private static int calculateMinMax(List<Integer> subList) {
        return subList.get(subList.size() - 1) - subList.get(0);
    }
}
