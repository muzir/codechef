package org.muzir.codechef.practice.beginner;

import java.io.IOException;
import java.util.Scanner;

class Choprt {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/CHOPRT.txt");
		// InputStreamReader isr = new InputStreamReader(fs);
		Scanner scanner = new Scanner(System.in);
		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(isr);
		int lineCount = scanner.nextInt();
		for (int i = 0; i < lineCount; i++) {
			int param1 = scanner.nextInt();
			int param2 = scanner.nextInt();
			System.out.println(printRelation(param1, param2));
		}
		scanner.close();
	}

	static String printRelation(int param1, int param2) {
		if (param1 == param2) {
			return "=";
		} else if (param1 > param2) {
			return ">";
		}
		return "<";
	}
}
