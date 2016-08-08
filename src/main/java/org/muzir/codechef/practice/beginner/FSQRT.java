package org.muzir.codechef.practice.beginner;

import java.util.Scanner;

public class FSQRT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();
		for (int i = 0; i < lineCount; i++) {
			int param = scanner.nextInt();
			System.out.println((int) Math.sqrt(param));
		}
		scanner.close();
	}

}
