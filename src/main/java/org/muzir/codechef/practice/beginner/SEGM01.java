package org.muzir.codechef.practice.beginner;

import java.io.*;

public class SEGM01 {
	private static boolean isCodechefModeOn = false;
	static final String YES = "YES";
	static final String NO = "NO";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			System.out.println(checkOneSegment(br.readLine()));
		}
		br.close();
	}

	static String checkOneSegment(String line) {
		int lenght = line.length();
		boolean isOneExist = false;
		boolean isZeroExistAfterOne = false;
		for (int i = 0; i < lenght; i++) {
			char c = line.charAt(i);
			if (c == '1') {
				isOneExist = true;
			}
			if (isOneExist && c == '0') {
				isZeroExistAfterOne = true;
			}
			if (isZeroExistAfterOne && c == '1') {
				return NO;
			}
		}
		if (!isOneExist) {
			return NO;
		}
		return YES;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/SEGM01.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
