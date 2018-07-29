package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class EGRANDR {
	private static boolean isCodechefModeOn = false;
	private static final String NO = "No";
	private static final String YES = "Yes";

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
		double sum = 0.0;
		boolean isExcellent = false;
		for (int i = 0; i < lenght; i++) {
			double v = a[i];
			if (v == 2.0) {
				return NO;
			}
			if (v == 5.0) {
				isExcellent = true;
			}
			sum = sum + v;
		}
		if (!isExcellent) {
			return NO;
		}
		double avarage = sum / (double) lenght;
		if (avarage >= 4.0) {
			return YES;
		}
		return NO;
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
		InputStream in = new FileInputStream(path + "/src/main/inputs/EGRANDR.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
