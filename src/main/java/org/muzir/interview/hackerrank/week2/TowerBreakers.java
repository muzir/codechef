package org.muzir.interview.hackerrank.week2;

public class TowerBreakers {
    public static void main(String[] args) {
        System.out.println(towerBreakers(2,6));
        System.out.println(towerBreakers(2,2));
        System.out.println(towerBreakers(1,4));
    }

    /*
     * Complete the 'towerBreakers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */

    public static int towerBreakers(int n, int m) {
        // Write your code here
        if (m == 1) {
            return 2;
        }
        if (n % 2 == 1) {
            return 1;
        }
        return 2;
    }
}
