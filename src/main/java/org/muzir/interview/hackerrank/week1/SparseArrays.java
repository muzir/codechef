package org.muzir.interview.hackerrank.week1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SparseArrays {

    public static void main(String[] args) {
        // System.out.println(matchingStrings(List.of("ab", "ab", "abc"), List.of("ab", "abc", "bc")));
        System.out.println(matchingStrings(List.of("aba", "baba", "aba", "xzxb"), List.of("aba", "xzxb", "ab")));
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        int[] resultArray = new int[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            String q = queries.get(i);
            for (int j = 0; j < strings.size(); j++) {
                String s = strings.get(j);
                if (q.equals(s)) {
                    int newResult = resultArray[i] + 1;
                    resultArray[i] = newResult;
                }
            }
        }
        return Arrays.stream(resultArray).boxed().collect(Collectors.toList());
    }
}


