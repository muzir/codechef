package org.muzir.interview.hackerrank.week2;

import java.util.HashMap;
import java.util.Map;

public class CounterGame {

    static final String RICHARD = "Richard";
    static final String LOUISE = "Louise";

    private static Map<Long, Long> powerOfTwoMap = new HashMap<>(64);

    static final String[] names = {LOUISE, RICHARD};

    /*
     *
     * Richard or Louise
     * Louise always starts.
     * n = 132
     * L: 132 isPowerOfTwo -> No -> thenFindLowerOfTwo -> 128
     * R: 4, isPowerOfTwo -> Yes, 4/2 = 2
     * L: 2, isPowerOfTwo -> Yes, 2/2 = 1
     *
     * n = 133
     * L: 133 isPowerOfTwo -> No -> thenFindLowerOfTwo -> 128, 133 - 128 = 5
     * R: 5  isPowerOfTwo -> No -> thenFindLowerOfTwo -> 4, 5 - 4 = 1
     *
     * */
    public static String counterGame(long n) {
        if (n == 1) {
            return RICHARD;
        }
        // Write your code here
        int counter = 0;
        while (n != 1) {
            int index = counter % 2;
            n = play(n);
            if (n == 1) {
                return names[index];
            }
            counter++;
        }
        return "";
    }

    private static long play(long n) {
        long diffOfClosestPowerTwo = getDiffOfClosestPowerTwo(n);
        if (diffOfClosestPowerTwo == 0) {
            // TODO optimise here for return the name because in this step based on the result we should know who wins.
            return n / 2;
        }
        return diffOfClosestPowerTwo;
    }

    private static long getDiffOfClosestPowerTwo(long n) {
        long closestPowerOfTwo = 0;
        for (long i = 0; i < 65; i++) {
            long powerOfTwo = powerOfTwoMap.computeIfAbsent(i, t -> (long) Math.pow(2, t));
            if (powerOfTwo > n) {
                closestPowerOfTwo = powerOfTwoMap.get(i - 1);
                break;
            }
        }
        return n - closestPowerOfTwo;
    }
}
