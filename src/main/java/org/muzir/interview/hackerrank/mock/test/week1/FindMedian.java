package org.muzir.interview.hackerrank.mock.test.week1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMedian {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4};
        List<Integer> a = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(findMedian(a));
    }

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.naturalOrder());
        int medianIndex = ((arr.size() + 1) / 2) - 1;
        return arr.get(medianIndex);
    }
}
