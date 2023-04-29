package org.muzir.interview.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant {
    public static void main(String[] args) {
        System.out.println(sockMerchant(9, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> map = new HashMap<>();
        // Write your code here
        for (int i = 0; i < ar.size(); i++) {
            int current = ar.get(i);
            Integer currentValue = map.get(current);
            if (currentValue == null) {
                map.put(current, 1);
            } else {
                map.put(current, currentValue + 1);
            }
        }
        return map.values().stream().mapToInt(i -> i.intValue() / 2).sum();
    }
}
