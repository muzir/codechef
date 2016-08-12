package org.muzir.codechef.practice.beginner;

import java.util.Scanner;

public class FLOW008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();
		for (int i = 0; i < lineCount; i++) {
			int input = scanner.nextInt();
			if (input < 10) {
				System.out.println("What an obedient servant you are!");
			} else {
				System.out.println("-1");
			}
		}
		scanner.close();
	}

}
