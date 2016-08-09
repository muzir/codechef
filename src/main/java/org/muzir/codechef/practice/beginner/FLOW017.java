package org.muzir.codechef.practice.beginner;

import java.util.Arrays;
import java.util.Scanner;

public class FLOW017 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();
		for (int i = 0; i < lineCount; i++) {
			int[] arguments = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
			Arrays.sort(arguments);
			System.out.println(arguments[1]);
		}
		scanner.close();
	}

}
