package org.muzir.interview.hackerrank;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.reverseOrder;

public class TwoArrays {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(0, 1));
        List<Integer> b = new ArrayList<>(List.of(0, 2));
        System.out.println(twoArrays(1, a, b));
        System.out.println(twoArrays(10, new ArrayList<>(List.of(2, 1, 3)), new ArrayList<>((List.of(7, 8, 9)))));
        System.out.println(twoArrays(5, new ArrayList<>(List.of(1, 2, 2, 1)), new ArrayList<>(List.of(3, 3, 3, 4))));
    }

    /*
     * Complete the 'twoArrays' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     *  3. INTEGER_ARRAY B
     */
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        A.sort(naturalOrder());
        B.sort(reverseOrder());

        List<Integer> c = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            int aValue = A.get(i);
            int bValue = B.get(i);
            int cValue = aValue + bValue;
            c.add(cValue);
        }
        c.sort(naturalOrder());
        int minCValue = c.stream().min(naturalOrder()).orElse(0);
        if (minCValue >= k) {
            return "YES";
        }
        return "NO";
    }
}
