package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TWOSTR {

	private static String NO = "No";
	private static String YES = "Yes";

	public static void main(String[] args) throws IOException {
		//FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/TWOSTR.txt");
		//InputStreamReader isr = new InputStreamReader(fs);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		int lineCount = Integer.parseInt(bf.readLine().trim());
		for (int i = 0; i < lineCount; i++) {
			String param1 = bf.readLine();
			String param2 = bf.readLine();
			System.out.println(isMatch(param1, param2));
		}
		bf.close();
	}

	static String isMatch(String param1, String param2) {
		int param1Lenght = param1.length();
		int param2Lenght = param2.length();
		if (param1Lenght != param2Lenght) {
			return NO;
		}
		if (!(1 < param1Lenght && param1Lenght < 10)) {
			return NO;
		}
		char[] char1Array = param1.toCharArray();
		char[] char2Array = param2.toCharArray();

		for (int i = 0; i < param1Lenght; i++) {
			char char1 = char1Array[i];
			char char2 = char2Array[i];
			if (!isAllowedCharacter(char1)) {
				return NO;
			}
			if (!isAllowedCharacter(char2)) {
				return NO;
			}
			if (!isEqualOrWildChar(char1, char2)) {
				return NO;
			}
		}
		return YES;
	}

	static boolean isAllowedCharacter(char param) {
		if (Character.isLowerCase(param) || param == '?') {
			return true;
		}
		return false;
	}

	static boolean isEqualOrWildChar(char param1, char param2) {
		if (param1 == param2) {
			return true;
		}
		if (param1 == '?') {
			return true;
		}
		if (param2 == '?') {
			return true;
		}
		return false;
	}

}
