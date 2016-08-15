package org.muzir.codechef.practice.beginner;

import java.util.Scanner;

/**
 * @author erhun.baycelik
 *
 * https://www.codechef.com/problems/TRISQ <br>
 * https://discuss.codechef.com/questions/64151/trisq-editorial
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
