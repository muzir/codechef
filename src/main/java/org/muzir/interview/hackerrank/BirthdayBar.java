package org.muzir.interview.hackerrank;

import java.util.List;

public class BirthdayBar {
    public static void main(String[] args) {
        System.out.println(birthday(List.of(2, 2, 1, 3, 2), 4, 2));
    }

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int result = 0;
        for (int i = 0; (i + m) <= s.size(); i++) {
            int current = s.get(i);
            int acc = 0;
            for (int j = i; j < i + m; j++) {
                acc = acc + s.get(j);
            }
            if (acc == d) {
                result = result + 1;
            }
        }
        return result;
    }
}
