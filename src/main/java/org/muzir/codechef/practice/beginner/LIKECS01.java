package org.muzir.codechef.practice.beginner;

import java.io.*;

public class LIKECS01 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			System.out.println(checkSubsequenceEquality(br.readLine()));
		}
		br.close();
	}

	static String checkSubsequenceEquality(String s) {
		int[] letterIntArray = new int[26];
		char[] charArray = s.toCharArray();

		int lenght = charArray.length;
		for (int i = 0; i < lenght; i++) {
			int index = charArray[i] - 97;
			int indexValue = letterIntArray[index];
			letterIntArray[index] = indexValue + 1;
		}

		int intLenght = letterIntArray.length;
		for (int i = 0; i < intLenght; i++) {
			int indexValue = letterIntArray[i];
			if (indexValue > 1) {
				return "yes";
			}
		}
		return "no";
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/LIKECS01.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
