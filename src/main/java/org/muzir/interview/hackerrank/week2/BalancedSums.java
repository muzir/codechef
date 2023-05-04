package org.muzir.interview.hackerrank.week2;

import java.util.List;
import java.util.stream.Collectors;

public class BalancedSums {
    /*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        String result = "NO";
        int rightSum = arr.stream().mapToInt(Integer::intValue).sum();
        int leftSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            rightSum = rightSum - current;
            if (rightSum == leftSum) {
                result = "YES";
                break;
            }
            leftSum = leftSum + current;
        }
        return result;
    }
}
