package org.muzir.interview.hackerrank.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        List<String> sortedStringList = new ArrayList<>();
        for (int i = 0; i < grid.size(); i++) {
            char[] charArray = grid.get(i).toCharArray();
            Arrays.sort(charArray);
            sortedStringList.add(String.valueOf(charArray));
        }
        List<String> colBasedStringList = new ArrayList<>();
        for (int i = 0; i < sortedStringList.get(0).length(); i++) {
            String s = "";
            for (int j = 0; j < sortedStringList.size(); j++) {
                String current = sortedStringList.get(j);
                s = s + current.charAt(i);
            }
            colBasedStringList.add(s);
        }
        String result = "YES";
        for (int i = 0; i < colBasedStringList.size(); i++) {
            char[] originalCharArray = colBasedStringList.get(i).toCharArray();
            char[] copyArray = Arrays.copyOf(originalCharArray, originalCharArray.length);
            Arrays.sort(copyArray);
            if (!Arrays.equals(originalCharArray, copyArray)) {
                result = "NO";
                break;
            }
        }
        return result;
    }
}
