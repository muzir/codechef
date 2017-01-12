package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WDTBAM1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = getBufferedReader();
		int n;
		int[] a;
		String s1, s2;
		int numTestCases = Integer.valueOf(br.readLine());
		for (int t = 0; t < numTestCases; t++) {
			n = Integer.valueOf(br.readLine());
			s1 = br.readLine();
			s2 = br.readLine();
			a = getArrayOfString(br.readLine());
			System.out.println(findMaxWinAmount(a, s1, s2));
		}
		br.close();
	}

	static int findMaxWinAmount(int[] amountArray, String correctAnswer, String chefAnswer) {
		int counter = 0;
		int n = correctAnswer.length();
		for (int i = 0; i < n; i++) {
			char a = correctAnswer.charAt(i);
			char cA = chefAnswer.charAt(i);
			if (a == cA) {
				counter++;
			}
		}
		int max = 0;
		if (counter == n) {
			max = amountArray[n];
		} else {
			for (int i = 0; i <= counter; i++) {
				if (amountArray[i] > max) {
					max = amountArray[i];
				}
			}
		}
		return max;
	}

	// static int findAmount(int n, int[] a, String s1, String s2) {
	// int count;
	// int max;
	// count = 0;
	// max = 0;
	// for (int i = 0; i < n; i++) {
	// if (s1.charAt(i) == s2.charAt(i)) {
	// count++;
	// }
	// }
	// if (count == n) {
	// max = a[n];
	// } else {
	// for (int i = 0; i <= count; i++) {
	// if (max < a[i]) {
	// max = a[i];
	// }
	// }
	// }
	// return max;
	// }

	static int[] getArrayOfString(String input) {
		String[] arrayStr = input.split(" ");
		int lenght = arrayStr.length;
		int[] returnArray = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			returnArray[i] = Integer.parseInt(arrayStr[i]);
		}
		return returnArray;
	}

	private static BufferedReader getBufferedReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}

}
