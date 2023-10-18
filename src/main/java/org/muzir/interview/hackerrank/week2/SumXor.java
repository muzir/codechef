package org.muzir.interview.hackerrank.week2;

public class SumXor {
    public static long countUnsetBits(long n) {
        long count = 0;
        while (n > 0) {
            if ((n & 1) == 0) {
                count++;
            }
            n >>= 1L;
        }
        return count;
    }

    public static long sumXor(long n) {
        long numUnsetBits = countUnsetBits(n);
        return 1L << numUnsetBits;  // Use 1L for a long shift
    }
}
