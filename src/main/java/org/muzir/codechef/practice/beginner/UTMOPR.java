package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class UTMOPR {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String[] nk = readLine(dis).split(" ");
			// n value is not used by me
			Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			String line = readLine(dis);
			int[] a = getArrayOfString(line);
			System.out.println(solution(a, k));
		}
	}

	static String solution(int[] a, int k) {
		char c = getCurrentTotal(a);
		return getResult(c, k);
	}

	private static String getResult(char c, int k) {
		if (c == 'E' && k == 1) {
			return "odd";
		}
		return "even";
	}

	private static char getCurrentTotal(int[] a) {
		int lenght = a.length;
		int oddCounter = 0;
		for (int i = 0; i < lenght; i++) {
			if (a[i] % 2 != 0) {
				oddCounter++;
			} // end of if
		} // end of for loop
		if (oddCounter % 2 == 0) {
			return 'E';
		}
		return 'O';
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
		InputStream in = new FileInputStream(path + "/src/main/inputs/UTMOPR.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
