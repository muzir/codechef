package org.muzir.interview.hackerrank;

import java.math.BigDecimal;

public class FlippingBits {
    public static void main(String[] args) {
        System.out.println(flippingBits(2147483647));
        System.out.println(flippingBits(1));
        System.out.println(flippingBits(0));

    }

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        // Write your code here
        long maxUnsignedValue = BigDecimal.valueOf(Math.pow(2, 32)).longValue() - 1;
        return maxUnsignedValue - n;
    }
}
