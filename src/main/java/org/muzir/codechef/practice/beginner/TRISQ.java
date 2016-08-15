package org.muzir.codechef.practice.beginner;

import java.util.Scanner;

/**
 * @author erhun.baycelik
 *
 *
 * 
 * PROBLEM: Find the maximum number of squares of size 2×22×2 that can be fitted in a right angled isosceles triangle of
 * base BB. All sides of the square must be parallel to both base and height of the isosceles triangle.
 * 
 * QUICK EXPLANATION: As B<=1000B<=1000, we can pre-compute the output for all the test cases, and report the answer in
 * O(1)O(1) time for each of the query.
 * 
 * EXPLANATION: First consider the right angle triangle ΔXYZΔXYZ, where YZYZ is the base of triangle. Suppose length of
 * the base is BB. If we consider the position of first square with the vertex YY, we will have (B/2−1)(B/2−1) squares
 * in the base, and we will be left with another isosceles right angle triangle having base length (B−2)(B−2).
 * 
 * 
 * Let f(B)f(B) = Number of squares which can be fitted in triangle having base length BB.
 * 
 * 
 * f(B)=(B2−1)+f(B−2)f(B)=(B2−1)+f(B−2) The given time limit is sufficient even if we calculate f(Bf(B) using the given
 * recursion, and use memoization. Later we can answer each query in O(1)O(1) time. We can do it for even and odd
 * numbers separately with the base case f(1)=f(2)=f(3)=0f(1)=f(2)=f(3)=0.
 * 
 * The given recursion can be solved in following manner.
 * 
 * f(B) = \frac{B-2}{2} + F(B-2) \\\ = \frac{B-2}{2} + \frac{B-4}{2} + F(B-4) \\\ = \frac{B-2}{2}+ \frac{B-4}{2} +
 * \frac{B-6}{2} + F(B-6)
 * 
 * With conditions, f(1)=f(2)=0f(1)=f(2)=0 f(B)=B2+(B2−1)+(B2−2)+⋯+1f(B)=B2+(B2−1)+(B2−2)+⋯+1.
 * 
 * f(B)f(B) = Sum of first B2B2 natural numbers.
 * 
 * Lets call M=B2M=B2 f(B)=M×(M−1)2f(B)=M×(M−1)2 You can notice that answer for 2N2N and 2N+12N+1 will be the same.
 * 
 * 
 * Sample Input
 * 
 * 
 * 11 1 2 3 4 5 6 7 8 9 10 11 Sample Output
 * 
 * 
 * 0 0 0 1 1 3 3 6 6 10 10
 * 
 */
public class TRISQ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();
		for (int i = 0; i < lineCount; i++) {
			int base = scanner.nextInt();
			int b = base / 2;
			int a = b * (b - 1) / 2;
			System.out.println(a);
		}
		scanner.close();
	}
}
