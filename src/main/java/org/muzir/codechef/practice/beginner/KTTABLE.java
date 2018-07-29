package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class KTTABLE {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			readLine(dis);
			int[] a = getArrayOfString(readLine(dis));
			int[] b = getArrayOfString(readLine(dis));
			System.out.println(findMaxSceduleTime(a, b));
		}
	}

	static int findMaxSceduleTime(int[] a, int[] b) {
		int counter = 0;
		int a0 = a[0];
		int b0 = b[0];
		if (a0 >= b0) {
			counter++;
		}
		int lenght = a.length - 1;
		for (int i = 0; i < lenght; i++) {
			int a1 = a[i];
			int a2 = a[i + 1];
			int diff = a2 - a1;
			int b1 = b[i + 1];
			if (diff >= b1) {
				counter++;
			}
		}
		return counter;
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
		InputStream in = new FileInputStream(path + "/src/main/inputs/KTTABLE.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
