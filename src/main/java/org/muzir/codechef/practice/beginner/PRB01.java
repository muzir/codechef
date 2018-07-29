package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRB01 {

	public static void main(String[] args) throws IOException {
		// FileInputStream is = new FileInputStream(System.getProperty("user.dir") + "/src/main/inputs/PRB01.txt");
		// InputStreamReader isr = new InputStreamReader(is);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int lineCount = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < lineCount; i++) {
			int input = Integer.parseInt(br.readLine().trim());
			if (isPrime(input)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		br.close();

	}

	static boolean isPrime(int input) {
		if (input == 1) {
			return false;
		}
		if (input == 2) {
			return true;
		}
		if (input == 3) {
			return true;
		}
		int inputHalf = input / 2;
		for (int i = 2; i <= inputHalf; i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}

}
