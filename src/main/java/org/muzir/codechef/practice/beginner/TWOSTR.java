package org.muzir.codechef.practice.beginner;

import java.io.*;

public class TWOSTR {

	private static String NO = "No";
	private static String YES = "Yes";

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String param1 = br.readLine();
			String param2 = br.readLine();
			System.out.println(isMatch(param1, param2));
		}
		br.close();
	}

	static String isMatch(String param1, String param2) {
		int param1Lenght = param1.length();
		char[] char1Array = param1.toCharArray();
		char[] char2Array = param2.toCharArray();

		for (int i = 0; i < param1Lenght; i++) {
			char char1 = char1Array[i];
			char char2 = char2Array[i];
			if (!isEqualOrWildChar(char1, char2)) {
				return NO;
			}
		}
		return YES;
	}


	static boolean isEqualOrWildChar(char param1, char param2) {
		if (param1 == param2) {
			return true;
		}
		if (param1 == '?' || param2 == '?') {
			return true;
		}
		return false;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/TWOSTR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

}
