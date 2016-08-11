package org.muzir.codechef.practice.beginner;

import java.util.ArrayList;
import java.util.Scanner;

public class SMPAIR {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();

		for (int i = 0; i < lineCount; i++) {
			int argCount = scanner.nextInt();
			ArrayList<Integer> elements = new ArrayList<Integer>();
			for (int z = 0; z < argCount; z++) {
				elements.add(scanner.nextInt());
			}
			int smPair = 0;
			for (int j = 0; j < elements.size() - 1; j++) {
				int a = elements.get(j);
				int b = elements.get(j + 1);
				int c = a + b;
				if (j == 0) {
					smPair = c;
				} else if (c < smPair) {
					smPair = c;
				}
			}
			System.out.println(smPair);
		}
		scanner.close();
	}

}
