package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TICKETS5 {
	private static boolean isCodechefModeOn = false;
	private static final String NO = "NO";
	private static final String YES = "YES";

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String line = readLine(dis);
			System.out.println(solution(line));
		}
	}

	static String solution(String s) {
		if (s == null || s.isEmpty()) {
			return NO;
		}
		int lenght = s.length();
		char c1 = s.charAt(0);
		char c2 = s.charAt(1);
		if (c1 == c2) {
			return NO;
		}
		if (!Character.isUpperCase(c1) || !Character.isUpperCase(c2)) {
			return NO;
		}
		for (int i = 2; i < lenght; i++) {
			char c3 = s.charAt(i);
			if (i % 2 == 0) {
				if (c1 != c3) {
					return NO;
				} // end of inner if
			} // end of outer if
			else {
				if (c2 != c3) {
					return NO;
				} // end of if
			} // end of else
		} // end of for
		return YES;
	}// end of method

	static int[] getArrayOfString(String input) {
		String[] arrayStr = input.split(" ");
		int lenght = arrayStr.length;
		int[] returnArray = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			returnArray[i] = Integer.parseInt(arrayStr[i]);
		}
		return returnArray;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/TICKETS5.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
