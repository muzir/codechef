package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CHEFARRP {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int k = 0; k < testCaseCount; k++) {
			readLine(dis);
			String argumentLine = readLine(dis);
			int[] argumentArray = getArrayOfString(argumentLine);
			System.out.println(solution(argumentArray));
		}
	}

	static int solution(int[] argumentArray) {
		int count = 0;
		int n = argumentArray.length;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			int product = 1;
			for (int j = i; j >= 0; j--) {
				sum += argumentArray[j];
				product *= argumentArray[j];
				if (sum == product) {
					count = count + 1;
				}
			}
		}
		return count;
	}

	private static int[] getArrayOfString(String ignored) {
		String[] arrayStr = ignored.split(" ");
		int[] returnArray = new int[arrayStr.length];
		for (int i = 0; i < arrayStr.length; i++) {
			returnArray[i] = Integer.parseInt(arrayStr[i]);
		}
		return returnArray;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/CHEFARRP.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
