package org.muzir.interview.hackerrank.week1;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LonelyInteger {
    public static void main(String[] args) {
        System.out.println(lonelyinteger(List.of(1, 2, 3, 4, 3, 2, 1)));
    }

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> resultMap = new ConcurrentHashMap<>();
        for (int i = 0; i < a.size(); i++) {
            int k = a.get(i);
            Integer existingValue = resultMap.get(k);
            if (existingValue == null) {
                resultMap.put(k, 1);
            } else {
                existingValue = existingValue + 1;
                resultMap.put(k, existingValue);
            }
        }
        int result = -1;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : resultMap.entrySet()) {
            if (integerIntegerEntry.getValue() == 1) {
                result = integerIntegerEntry.getKey();
            }
        }
        return result;
    }
}
