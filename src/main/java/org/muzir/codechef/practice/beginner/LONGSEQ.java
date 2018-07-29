package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LONGSEQ {
	private static boolean isCodechefModeOn = false;

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
		int oneCounter = 0;
		int zeroCounter = 0;
		char[] params = s.toCharArray();
		for (char c : params) {
			if (c == '0') {
				zeroCounter++;
			} else {
				oneCounter++;
			} // end of else
			if (zeroCounter > 1 && oneCounter > 1) {
				return "No";
			} // end of if
		} // end of for loop

		if (zeroCounter == 1 || oneCounter == 1) {
			return "Yes";
		}
		return "No";
	}

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
		InputStream in = new FileInputStream(path + "/src/main/inputs/LONGSEQ.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
