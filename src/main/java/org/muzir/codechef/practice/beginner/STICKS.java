package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class STICKS {
	private static boolean isCodechefModeOn = false;
	private static int base = 0;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			readLine(dis);
			String line = readLine(dis);
			int[] a = getArrayOfString(line);
			System.out.println(solution(a));
		}
	}

	static int solution(int[] a) {
		int lenght = a.length;
		if (lenght < 4) {
			return -1;
		}
		base = lenght - 1;
		Arrays.sort(a);
		int p1 = getMaxPair(a, base);
		if (p1 == -1) {
			return -1;
		}
		int p2 = getMaxPair(a, base);
		if (p2 == -1) {
			return -1;
		}
		int square = p1 * p2;
		return square;
	}

	private static int getMaxPair(int[] a, int base2) {
		for (int i = base; 0 < i; i--) {
			int p1 = a[i];
			int p2 = a[i - 1];
			if (p1 == p2) {
				base = i - 2;
				return p1;
			}
		}
		return -1;
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
		InputStream in = new FileInputStream(path + "/STICKS.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
