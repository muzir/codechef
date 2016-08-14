package org.muzir.codechef.practice.beginner;

import java.util.Scanner;

public class FLOW005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();
		for (int i = 0; i < lineCount; i++) {
			int input = scanner.nextInt();
			System.out.println(calculate(input, 100));
		}
		scanner.close();
	}

	public static int calculate(int n, int divider) {
		int a = n / divider;
		int b = n % divider;
		if (b >= 50) {
			divider = 50;
		} else if (b >= 10) {
			divider = 10;
		} else if (b >= 5) {
			divider = 5;
		} else if (b >= 2) {
			divider = 2;
		} else {
			divider = 1;
		}
		if (b == 0) {
			return a;
		}
		return a + calculate(b, divider);
	}

}
