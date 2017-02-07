package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ALTARAY {
	private static boolean isCodechefModeOn = false;

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
		dis.close();
	}

	static String solution(int[] a) {
		int lenght = a.length;
		// If array length is 1 return "1"
		if (lenght == 1) {
			return "1";
		}
		int[] output = new int[lenght];
		int base = 0;
		for (int i = 0; i < lenght - 1; i++) {
			int p1 = a[i];
			int p2 = a[i + 1];
			output[i] = 1;
			output[i + 1] = 1;
			boolean b1 = p1 > 0;
			boolean b2 = p2 > 0;
			if (b1 ^ b2) {
				for (int j = base; j <= i; j++) {
					int value = output[j];
					output[j] = value + 1;
				}
			} // end of if
			else {
				base = i + 1;
			} // end of else
		} // end of for loop
		return convertToString(output);
	}

	private static String convertToString(int[] output) {
		StringBuilder sb = new StringBuilder();
		int lenght = output.length;
		for (int i = 0; i < lenght; i++) {
			sb.append(output[i]);
			if (i != lenght - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
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
		InputStream in = new FileInputStream(path + "/ALTARAY.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
