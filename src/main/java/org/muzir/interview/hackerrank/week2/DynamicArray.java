package org.muzir.interview.hackerrank.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {

    }

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        int lastAnswer = 0;
        List<Integer> answerArr = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < queries.size(); i++) {
            List<Integer> query = queries.get(i);
            int queryCode = query.get(0);
            if (queryCode == 1) {
                int x = query.get(1);
                int idx = getIdx(n, lastAnswer, x);
                int y = query.get(2);
                arr.get(idx).add(y);
            } else if (queryCode == 2) {
                int x = query.get(1);
                int idx = getIdx(n, lastAnswer, x);
                int y = query.get(2);
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                answerArr.add(lastAnswer);
            }
        }
        return answerArr;
    }

    private static int getIdx(int n, int lastAnswer, int x) {
        return (x ^ lastAnswer) % n;
    }
}
