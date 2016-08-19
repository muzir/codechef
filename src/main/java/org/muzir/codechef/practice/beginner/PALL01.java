package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class PALL01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/PALL01.txt");
		InputStreamReader isr = new InputStreamReader(fs);
		// InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int t = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < t; i++) {
			if (isPolindrome(br.readLine())) {
				System.out.println("wins");
			} else {
				System.out.println("losses");
			}
		}
	}

	static boolean isPolindrome(String s) {
		int x = Integer.parseInt(s);
		char[] sArray = s.toCharArray();
		for (int i = 0, j = sArray.length - 1; i <= j; i++, j--) {
			char f = sArray[i];
			char l = sArray[j];
			sArray[j] = f;
			sArray[i] = l;
		}
		String sReverse = String.valueOf(sArray);
		int y = Integer.parseInt(sReverse);
		if (x == y) {
			return true;
		}
		return false;
	}
}
