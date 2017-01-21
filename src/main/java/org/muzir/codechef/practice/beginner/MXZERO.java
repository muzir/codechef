package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MXZERO {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			Integer.parseInt(readLine(dis));
			String line = readLine(dis);
			int[] a = getArrayOfString(line);
			System.out.println(solution(a));
		}
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

	static int solution(int[] a) {
		int lenght = a.length;
		int oneCounter = 0;
		int zeroCounter = 0;
		for (int i = 0; i < lenght; i++) {
			if (1 == a[i]) {
				oneCounter++;
			}
			if (0 == a[i]) {
				zeroCounter++;
			}
		}
		if (oneCounter % 2 == 0) {
			return zeroCounter;
		}
		return oneCounter;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/MXZERO.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
