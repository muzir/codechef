package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FANCY {
	static final String REAL_FANCY = "Real Fancy";
	static final String REGULARY_FANCY = "regularly fancy";
	static final char EMPTY_CHAR = ' ';
	static final String NOT = "not";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String line = br.readLine();
			System.out.println(solution(line));
		}
		br.close();
	}

	static String solution(String line) {
		char[] array;
		int index = 0;
		while (index != -1) {
			try {
				array = line.toCharArray();
				if (isValidStarting(index, array) && isValidEnd(index + 2, array)) {
					return REAL_FANCY;
				}
				index = nextIndex(index, array);
				line = line.substring(index);
				index = line.indexOf(NOT);
			} catch (Exception e) {
				index = -1;
			}
		}
		return REGULARY_FANCY;
	}

	private static int nextIndex(int currentIndex, char[] charArray) {
		try {
			for (int i = currentIndex; i < charArray.length; i++) {
				if (charArray[i] == EMPTY_CHAR) {
					return i;
				}
			}
		} catch (Exception e) {
			return -1;
		}
		return -1;
	}

	private static boolean isValidEnd(int lastIndex, char[] lineArray) {
		try {
			if (lastIndex == lineArray.length - 1) {
				return true;
			}
			char nextChar = lineArray[lastIndex + 1];
			return nextChar == EMPTY_CHAR;
		} catch (Exception e) {
			return false;
		}
	}

	private static boolean isValidStarting(int firstIndex, char[] lineArray) {
		try {
			if (firstIndex == 0) {
				return true;
			}
			char previousChar = lineArray[firstIndex - 1];
			return previousChar == EMPTY_CHAR;
		} catch (Exception e) {
			return false;
		}
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/FANCY.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
