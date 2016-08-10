package org.muzir.codechef.practice.beginner;

import java.math.BigDecimal;
import java.util.Scanner;

public class FLOW018 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();
		for (int i = 0; i < lineCount; i++) {
			int n = scanner.nextInt();
			System.out.println(fact(n));
		}
		scanner.close();
	}

	private static BigDecimal fact(int n) {
		if (n == 0 || n == 1) {
			return BigDecimal.ONE;
		}
		BigDecimal b = new BigDecimal(n);
		return b.multiply(fact(n - 1));
	}
}
