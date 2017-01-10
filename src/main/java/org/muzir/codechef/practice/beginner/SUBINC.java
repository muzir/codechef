package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

public class SUBINC {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			int n = Integer.parseInt(readLine(dis));
			String parameters = readLine(dis);
			int[] array = getArrayOfString(parameters);
			System.out.println(calculateSubArrays(array));
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

	static int calculateSubArrays(int[] n) {
		int lenght = n.length;
		int counter = 0;
		boolean isSubArrayStart = true;
		for (int i = 1; i <= lenght - 1; i++) {
			int current = n[i - 1];
			int next = n[i];
			if (next >= current) {
				if (isSubArrayStart) {
					counter = counter + 1;
					isSubArrayStart = false;
				}
			} else {
				isSubArrayStart = true;
			}
		}
		return counter + lenght;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/SUBINC.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}