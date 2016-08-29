package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SPALNUM {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/SPALNUM.txt");
		// InputStreamReader isr = new InputStreamReader(fs);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int lineCount = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < lineCount; i++) {
			String line = br.readLine();
			String[] parameters = line.split(" ");
			int result = calculatePalindromic(Integer.parseInt(parameters[0]), Integer.parseInt(parameters[1]));
			System.out.println(result);
		}
		br.close();
	}

	static int calculatePalindromic(int param1, int param2) {
		int acc = 0;
		for (int i = param1; i <= param2; i++) {
			if (isPolindromic(i)) {
				acc = acc + i;
			}
		}
		return acc;
	}

	private static boolean isPolindromic(int param) {
		String s = String.valueOf(param);
		char[] r = s.toCharArray();
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			char a = r[i];
			char b = r[j];
			r[j] = a;
			r[i] = b;
		}
		String reverse = String.valueOf(r);
		if (s.equals(reverse)) {
			return true;
		}
		return false;
	}

}
